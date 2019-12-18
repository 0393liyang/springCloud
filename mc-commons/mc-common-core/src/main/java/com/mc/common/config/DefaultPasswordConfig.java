package com.mc.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * [DefaultPasswordConfig 密码工具类]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 09:37
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class DefaultPasswordConfig {
    /**
     * 装配BCryptPasswordEncoder用户密码的匹配
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder()	{
        return new BCryptPasswordEncoder();
    }
}
