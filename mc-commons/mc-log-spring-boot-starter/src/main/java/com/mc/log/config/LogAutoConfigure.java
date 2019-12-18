package com.mc.log.config;

import com.mc.log.properties.TraceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * [LogAutoConfigure 日志自动配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 17:29
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableConfigurationProperties(TraceProperties.class)
public class LogAutoConfigure {
}
