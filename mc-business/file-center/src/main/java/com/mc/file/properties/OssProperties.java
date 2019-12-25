package com.mc.file.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * [OssProperties 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:21
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
public class OssProperties {
    /**
     * 密钥key
     */
    private String accessKey;
    /**
     * 密钥密码
     */
    private String accessKeySecret;
    /**
     * 端点
     */
    private String endpoint;
    /**
     * bucket名称
     */
    private String bucketName;
    /**
     * 说明
     */
    private String domain;
}
