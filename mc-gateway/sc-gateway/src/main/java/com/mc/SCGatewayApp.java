package com.mc;

//import com.mc.common.ribbon.annotation.EnableBaseFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * [SCGatewayApp]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/12 0012 10:07
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableFeignClients
//@EnableBaseFeignInterceptor
@EnableDiscoveryClient
@SpringBootApplication
public class SCGatewayApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SCGatewayApp.class, args);
    }
}
