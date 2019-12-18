package com.mc.gateway;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * [MonitorApp]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/17 0017 17:43
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class MonitorApp {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApp.class, args);
    }
}
