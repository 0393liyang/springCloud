package com.mc.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * [CodeGeneratorApp]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:59
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CodeGeneratorApp {
    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApp.class, args);
    }
}
