package com.mc.gateway.auth;

import cn.hutool.core.collection.CollectionUtil;
import com.mc.common.constant.SecurityConstants;
import com.mc.common.model.SysUser;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.ServerAuthenticationSuccessHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * [Oauth2AuthSuccessHandler 认证成功处理类]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/12 0012 10:20
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class Oauth2AuthSuccessHandler implements ServerAuthenticationSuccessHandler {
    @Override
    public Mono<Void> onAuthenticationSuccess(WebFilterExchange webFilterExchange, Authentication authentication) {
        SysUser user = (SysUser)authentication.getPrincipal();
        Long userId = user.getId();
        String username = user.getUsername();
        OAuth2Authentication oauth2Authentication = (OAuth2Authentication)authentication;
        String clientId = oauth2Authentication.getOAuth2Request().getClientId();

        ServerWebExchange exchange = webFilterExchange.getExchange();
        ServerHttpRequest serverHttpRequest = exchange.getRequest().mutate()
                .headers(h -> {
                    h.add(SecurityConstants.USER_ID_HEADER, String.valueOf(userId));
                    h.add(SecurityConstants.USER_HEADER, username);
                    h.add(SecurityConstants.TENANT_HEADER, clientId);
                    h.add(SecurityConstants.ROLE_HEADER, CollectionUtil.join(authentication.getAuthorities(), ","));
                })
                .build();

        ServerWebExchange build = exchange.mutate().request(serverHttpRequest).build();
        return webFilterExchange.getChain().filter(build);
    }
}
