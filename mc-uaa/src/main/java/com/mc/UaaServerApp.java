package com.mc;

import com.mc.common.ribbon.annotation.EnableFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * [UaaServerApp ]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:29
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableFeignClients
@EnableFeignInterceptor
@EnableDiscoveryClient
@EnableRedisHttpSession
@SpringBootApplication
public class UaaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(UaaServerApp.class, args);
    }
}
