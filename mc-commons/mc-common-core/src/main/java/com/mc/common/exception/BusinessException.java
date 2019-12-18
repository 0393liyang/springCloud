package com.mc.common.exception;

/**
 * [BusinessException 业务异常]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:26
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public BusinessException(String message) {
        super(message);
    }
}
