package com.mc.oauth2.common.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * [AuthDbTokenStore 认证服务器使用数据库存取令牌]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:15
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class AuthDbTokenStore {

    @Autowired
    private DataSource dataSource;

    @Bean
    public TokenStore tokenStore(){
        return new JdbcTokenStore(dataSource);
    }
}
