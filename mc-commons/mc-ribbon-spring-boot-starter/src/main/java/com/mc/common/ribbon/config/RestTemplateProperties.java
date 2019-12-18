package com.mc.common.ribbon.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * [RestTemplateProperties RestTemplate 配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:33
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "mc.rest-template")
public class RestTemplateProperties {
    /**
     * 最大链接数
     */
    private int maxTotal = 200;
    /**
     * 同路由最大并发数
     */
    private int maxPerRoute = 50;
    /**
     * 读取超时时间 ms
     */
    private int readTimeout = 35000;
    /**
     * 链接超时时间 ms
     */
    private int connectTimeout = 10000;
}
