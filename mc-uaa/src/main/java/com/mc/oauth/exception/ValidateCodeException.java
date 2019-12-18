package com.mc.oauth.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * [ValidateCodeException 验证码异常]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:34
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class ValidateCodeException extends AuthenticationException {
    private static final long serialVersionUID = -7285211528095468156L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
