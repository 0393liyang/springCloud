package com.mc.oauth2.common.constants;

/**
 * [AuthoritiesEnum 权限常量]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:05
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public enum AuthoritiesEnum {
    /**
     * 管理员
     */
    ADMIN("ROLE_ADMIN"),
    /**
     * 普通用户
     */
    USER("ROLE_USER"),
    /**
     * 匿名用户
     */
    ANONYMOUS("ROLE_ANONYMOUS");

    private String role;

    AuthoritiesEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
