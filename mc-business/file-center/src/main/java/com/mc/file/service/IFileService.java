package com.mc.file.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mc.common.model.PageResult;
import com.mc.file.model.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * [IFileService 文件service]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:23
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface IFileService extends IService<FileInfo> {
    FileInfo upload(MultipartFile file ) throws Exception;

    PageResult<FileInfo> findList(Map<String, Object> params);

    void delete(String id);
}
