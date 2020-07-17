package com.mc;

import com.mc.common.ribbon.annotation.EnableBaseFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * [GatewayApp 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2020/1/8 0008 15:17
 * @company Gainet
 * @copyright copyright (c) 2020
 */
@EnableZuulProxy
@EnableFeignClients
@EnableBaseFeignInterceptor
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }
}
