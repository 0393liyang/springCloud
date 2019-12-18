package com.mc.log.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * [TraceProperties 日志链路追踪配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 17:28
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "mc.trace")
@RefreshScope
public class TraceProperties {
    /**
     * 是否开启日志链路追踪
     */
    private Boolean enable = false;

}
