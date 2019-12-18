package com.mc.common.config;

import com.mc.common.feign.UserService;
import com.mc.common.resolver.ClientArgumentResolver;
import com.mc.common.resolver.TokenArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * [LoginArgResolverConfig 公共配置类, 一些公共工具配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 09:41
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class LoginArgResolverConfig implements WebMvcConfigurer {
    @Lazy
    @Autowired
    private UserService userService;
    /**
     * Token参数解析
     *
     * @param argumentResolvers 解析类
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        //注入用户信息
        argumentResolvers.add(new TokenArgumentResolver(userService));
        //注入应用信息
        argumentResolvers.add(new ClientArgumentResolver());
    }
}
