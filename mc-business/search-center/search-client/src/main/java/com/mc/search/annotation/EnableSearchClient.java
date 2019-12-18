package com.mc.search.annotation;

import com.mc.search.client.service.impl.QueryServiceImpl;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [EnableSearchClient 控制是否加载搜索中心客户端的Service]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:00
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@EnableFeignClients
@Import(QueryServiceImpl.class)
public @interface EnableSearchClient {
}
