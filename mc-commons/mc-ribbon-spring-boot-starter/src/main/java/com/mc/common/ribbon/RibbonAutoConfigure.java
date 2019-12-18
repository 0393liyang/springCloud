package com.mc.common.ribbon;

import com.mc.common.ribbon.config.RestTemplateProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.ribbon.DefaultPropertiesFactory;
import org.springframework.context.annotation.Bean;

/**
 * [RibbonAutoConfigure Ribbon扩展配置类]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:37
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableConfigurationProperties(RestTemplateProperties.class)
public class RibbonAutoConfigure {
    @Bean
    public DefaultPropertiesFactory defaultPropertiesFactory() {
        return new DefaultPropertiesFactory();
    }
}
