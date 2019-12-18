package com.mc.common.context;

import com.alibaba.ttl.TransmittableThreadLocal;

/**
 * [LbIsolationContextHolder 负载均衡策略Holder]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:25
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class LbIsolationContextHolder {
    private static final ThreadLocal<String> VERSION_CONTEXT = new TransmittableThreadLocal<>();

    public static void setVersion(String version) {
        VERSION_CONTEXT.set(version);
    }

    public static String getVersion() {
        return VERSION_CONTEXT.get();
    }

    public static void clear() {
        VERSION_CONTEXT.remove();
    }
}
