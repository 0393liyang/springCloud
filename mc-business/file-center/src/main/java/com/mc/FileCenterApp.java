package com.mc;

import com.mc.common.ribbon.annotation.EnableFeignInterceptor;
import com.mc.file.properties.FileServerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * [FileCenterApp 文件中心]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:33
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableDiscoveryClient
@EnableConfigurationProperties(FileServerProperties.class)
@EnableFeignClients
@EnableFeignInterceptor
@SpringBootApplication
public class FileCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(FileCenterApp.class, args);
    }
}
