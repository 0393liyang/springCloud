package com.mc.file.config;

import com.mc.file.model.FileInfo;
import com.mc.file.properties.FileServerProperties;
import com.mc.file.service.impl.AbstractIFileService;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * [QiniuOSSAutoConfigure 七牛云配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:29
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
@ConditionalOnProperty(name = "mc.file-server.type", havingValue = "qiniu")
public class QiniuOSSAutoConfigure {
    @Autowired
    private FileServerProperties fileProperties;

    /**
     * 华东机房
     */
    @Bean
    public com.qiniu.storage.Configuration qiniuConfig() {
        return new com.qiniu.storage.Configuration(Zone.zone2());
    }

    /**
     * 构建一个七牛上传工具实例
     */
    @Bean
    public UploadManager uploadManager() {
        return new UploadManager(qiniuConfig());
    }

    /**
     * 认证信息实例
     *
     * @return
     */
    @Bean
    public Auth auth() {
        return Auth.create(fileProperties.getOss().getAccessKey(), fileProperties.getOss().getAccessKeySecret());
    }

    /**
     * 构建七牛空间管理实例
     */
    @Bean
    public BucketManager bucketManager() {
        return new BucketManager(auth(), qiniuConfig());
    }

    @Service
    public class QiniuOssServiceImpl extends AbstractIFileService {
        @Autowired
        private UploadManager uploadManager;
        @Autowired
        private BucketManager bucketManager;
        @Autowired
        private Auth auth;

        @Override
        protected String fileType() {
            return fileProperties.getType();
        }

        @Override
        protected void uploadFile(MultipartFile file, FileInfo fileInfo) throws Exception {
            // 调用put方法上传
            uploadManager.put(file.getBytes(), fileInfo.getName(), auth.uploadToken(fileProperties.getOss().getBucketName()));
            fileInfo.setUrl(fileProperties.getOss().getEndpoint() + "/" + fileInfo.getName());
            fileInfo.setPath(fileProperties.getOss().getEndpoint() + "/" + fileInfo.getName());
        }

        @Override
        protected boolean deleteFile(FileInfo fileInfo) {
            try {
                Response response = bucketManager.delete(fileProperties.getOss().getBucketName(), fileInfo.getPath());
                int retry = 0;
                while (response.needRetry() && retry++ < 3) {
                    response = bucketManager.delete(fileProperties.getOss().getBucketName(), fileInfo.getPath());
                }
            } catch (QiniuException e) {
                return false;
            }
            return true;
        }
    }
}
