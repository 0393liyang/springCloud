package com.mc.oauth2.common.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * [ValidateCodeProperties 验证码配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:10
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
public class ValidateCodeProperties {
    /**
     * 设置认证通时不需要验证码的clientId
     */
    private String[] ignoreClientCode = {};
}
