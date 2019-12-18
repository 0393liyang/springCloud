package com.mc.oauth2.common.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * [AuthProperties 认证配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:08
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
public class AuthProperties {
    /**
     * 配置要认证的url（默认不需要配置）
     *
     * 优先级大于忽略认证配置`mc.security.ignore.httpUrls`
     * 意思是如果同一个url同时配置了`忽略认证`和`需要认证`，则该url还是会被认证
     */
    private String[] httpUrls = {};

    /**
     * token自动续签配置（目前只有redis实现）
     */
    private RenewProperties renew = new RenewProperties();

    /**
     * url权限配置
     */
    private UrlPermissionProperties urlPermission = new UrlPermissionProperties();
}
