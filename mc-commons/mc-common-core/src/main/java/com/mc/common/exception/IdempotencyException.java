package com.mc.common.exception;

/**
 * [IdempotencyException 幂等性异常]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:29
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class IdempotencyException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
