package com.mc.common.ribbon;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * [FeignAutoConfigure Feign统一配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:35
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class FeignAutoConfigure {

    /**
     * Feign 日志级别
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
