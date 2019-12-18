package com.mc.oauth2.common.store;

import com.mc.oauth2.common.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * [AuthRedisTokenStore 认证服务器使用Redis存取令牌]
 *  <pre>
 *      注意: 需要配置redis参数
 *  </pre>
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:16
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class AuthRedisTokenStore {
    @Autowired
    private RedisConnectionFactory connectionFactory;

    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    public TokenStore tokenStore() {
        return new CustomRedisTokenStore(connectionFactory, securityProperties);
    }
}
