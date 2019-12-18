package com.mc.log;

import com.mc.search.annotation.EnableSearchClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * [LogApp]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/17 0017 17:38
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableDiscoveryClient
@EnableSearchClient
@SpringBootApplication
public class LogApp {
    public static void main(String[] args) {
        SpringApplication.run(LogApp.class, args);
    }
}
