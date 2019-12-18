package com.mc.common.ribbon.config;

import cn.hutool.core.util.StrUtil;
import com.mc.common.constant.CommonConstant;
import com.mc.common.constant.SecurityConstants;
import com.mc.common.context.TenantContextHolder;
import feign.RequestInterceptor;
import org.slf4j.MDC;
import org.springframework.context.annotation.Bean;

/**
 * [FeignInterceptorConfig feign拦截器，只包含基础数据]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:32
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class FeignInterceptorConfig {
    /**
     * 使用feign client访问别的微服务时，将上游传过来的client、traceid等信息放入header传递给下一个服务
     */
    @Bean
    public RequestInterceptor baseFeignInterceptor() {
        return template -> {
            //传递client
            String tenant = TenantContextHolder.getTenant();
            if (StrUtil.isNotEmpty(tenant)) {
                template.header(SecurityConstants.TENANT_HEADER, tenant);
            }

            //传递日志traceId
            String traceId = MDC.get(CommonConstant.LOG_TRACE_ID);
            if (StrUtil.isNotEmpty(traceId)) {
                template.header(CommonConstant.TRACE_ID_HEADER, traceId);
            }
        };
    }
}
