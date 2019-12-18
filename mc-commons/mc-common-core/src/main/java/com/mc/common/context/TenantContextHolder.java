package com.mc.common.context;

import com.alibaba.ttl.TransmittableThreadLocal;

/**
 * [TenantContextHolder 租户holder]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:20
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class TenantContextHolder {
    /**
     * 支持父子线程之间的数据传递
     */
    private static final ThreadLocal<String> CONTEXT = new TransmittableThreadLocal<>();

    public static void setTenant(String tenant) {
        CONTEXT.set(tenant);
    }

    public static String getTenant() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }
}
