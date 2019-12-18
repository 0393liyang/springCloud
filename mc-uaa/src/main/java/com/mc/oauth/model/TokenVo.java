package com.mc.oauth.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * [TokenVo 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:33
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
public class TokenVo implements Serializable {
    private static final long serialVersionUID = -6656955957477645319L;
    /**
     * token的值
     */
    private String tokenValue;
    /**
     * 到期时间
     */
    private Date expiration;
    /**
     * 用户名
     */
    private String username;
    /**
     * 所属应用
     */
    private String clientId;
    /**
     * 授权类型
     */
    private String grantType;
}
