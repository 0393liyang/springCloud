package com.mc.common.redis.constant;

/**
 * [RedisToolsConstant redis 工具常量]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 10:54
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class RedisToolsConstant {
    private RedisToolsConstant() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * single Redis
     */
    public final static int SINGLE = 1 ;

    /**
     * Redis cluster
     */
    public final static int CLUSTER = 2 ;
}
