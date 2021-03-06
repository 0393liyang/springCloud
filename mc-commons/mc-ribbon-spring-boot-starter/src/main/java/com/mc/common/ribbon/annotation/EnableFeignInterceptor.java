package com.mc.common.ribbon.annotation;

import com.mc.common.ribbon.config.FeignHttpInterceptorConfig;
import com.mc.common.ribbon.config.FeignInterceptorConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [EnableFeignInterceptor 开启feign拦截器传递数据给下游服务，包含基础数据和http的相关数据]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:31
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({FeignInterceptorConfig.class, FeignHttpInterceptorConfig.class})
public @interface EnableFeignInterceptor {
}
