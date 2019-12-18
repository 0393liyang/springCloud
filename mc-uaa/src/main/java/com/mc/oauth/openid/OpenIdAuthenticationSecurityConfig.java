package com.mc.oauth.openid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Component;

/**
 * [OpenIdAuthenticationSecurityConfig openId的相关处理配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:49
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Component
public class OpenIdAuthenticationSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    @Autowired
    private SocialUserDetailsService userDetailsService;

    @Override
    public void configure(HttpSecurity http) {
        //openId provider
        OpenIdAuthenticationProvider provider = new OpenIdAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        http.authenticationProvider(provider);
    }
}
