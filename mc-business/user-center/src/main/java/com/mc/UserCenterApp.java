package com.mc;

import com.mc.common.ribbon.annotation.EnableFeignInterceptor;
import com.mc.search.annotation.EnableSearchClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * [UserCenterApp]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 14:45
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableDiscoveryClient
@EnableSearchClient
@EnableTransactionManagement
@EnableFeignInterceptor
@SpringBootApplication
public class UserCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
