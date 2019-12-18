package com.mc.oauth.config;

import com.mc.oauth.service.impl.RedisAuthorizationCodeServices;
import com.mc.oauth.service.impl.RedisClientDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.oauth2.provider.code.RandomValueAuthorizationCodeServices;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * [ClientDetailsConfig ]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:54
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
public class ClientDetailsConfig {
    @Resource
    private DataSource dataSource;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 声明 ClientDetails实现
     */
    @Bean
    public RedisClientDetailsService clientDetailsService() {
        RedisClientDetailsService clientDetailsService = new RedisClientDetailsService(dataSource);
        clientDetailsService.setRedisTemplate(redisTemplate);
        return clientDetailsService;
    }

    @Bean
    public RandomValueAuthorizationCodeServices authorizationCodeServices() {
        RedisAuthorizationCodeServices redisAuthorizationCodeServices = new RedisAuthorizationCodeServices();
        redisAuthorizationCodeServices.setRedisTemplate(redisTemplate);
        return redisAuthorizationCodeServices;
    }
}
