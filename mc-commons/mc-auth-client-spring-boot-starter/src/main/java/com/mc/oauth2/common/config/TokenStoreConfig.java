package com.mc.oauth2.common.config;

import com.mc.oauth2.common.store.AuthDbTokenStore;
import com.mc.oauth2.common.store.AuthJwtTokenStore;
import com.mc.oauth2.common.store.AuthRedisTokenStore;
import com.mc.oauth2.common.store.ResJwtTokenStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * [TokenStoreConfig token存储配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:24
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
public class TokenStoreConfig {
    @Configuration
    @ConditionalOnProperty(prefix = "mc.oauth2.token.store", name = "type", havingValue = "db")
    @Import(AuthDbTokenStore.class)
    public class JdbcTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "mc.oauth2.token.store", name = "type", havingValue = "redis", matchIfMissing = true)
    @Import(AuthRedisTokenStore.class)
    public class RedisTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "mc.oauth2.token.store", name = "type", havingValue = "authJwt")
    @Import(AuthJwtTokenStore.class)
    public class AuthJwtTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "mc.oauth2.token.store", name = "type", havingValue = "resJwt")
    @Import(ResJwtTokenStore.class)
    public class ResJwtTokenConfig {
    }
}
