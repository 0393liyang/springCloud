package com.mc.admin.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * [IndexProperties 索引配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:17
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "mc.indices")
@RefreshScope
public class IndexProperties {
    /**
     * 配置过滤的索引名：默认只显示这些索引
     */
    private String[] show;
}
