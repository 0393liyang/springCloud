package com.mc.common.swagger2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * [Swagger2Configuration]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:47
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
@ConditionalOnProperty(name = "mc.swagger.enabled", matchIfMissing = true)
@Import({
        Swagger2DocumentationConfiguration.class
})
public class Swagger2Configuration {
}
