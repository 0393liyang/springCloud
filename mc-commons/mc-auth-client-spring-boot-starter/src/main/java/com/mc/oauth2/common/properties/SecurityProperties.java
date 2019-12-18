package com.mc.oauth2.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * [SecurityProperties 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:09
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "mc.security")
@RefreshScope
public class SecurityProperties {
    private AuthProperties auth = new AuthProperties();

    private PermitProperties ignore = new PermitProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();
}
