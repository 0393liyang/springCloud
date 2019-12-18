package com.mc.common.ribbon.annotation;

import com.mc.common.ribbon.config.FeignInterceptorConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [EnableBaseFeignInterceptor 开启feign拦截器传递数据给下游服务，只包含基础数据]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:31
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(FeignInterceptorConfig.class)
public @interface EnableBaseFeignInterceptor {
}
