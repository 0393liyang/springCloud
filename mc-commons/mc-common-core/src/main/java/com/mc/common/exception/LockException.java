package com.mc.common.exception;

/**
 * [LockException 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:30
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class LockException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public LockException(String message) {
        super(message);
    }
}
