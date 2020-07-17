//package com.mc.gateway.auth;
//
//import com.mc.common.utils.ResponseUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.server.ServerAuthenticationEntryPoint;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
///**
// * [JsonAuthenticationEntryPoint 401未授权异常处理，转换为JSON]
// *
// * @author likai
// * @version 1.0
// * @date 2019/12/12 0012 10:19
// * @company Gainet
// * @copyright copyright (c) 2019
// */
//@Slf4j
//public class JsonAuthenticationEntryPoint implements ServerAuthenticationEntryPoint {
//    @Override
//    public Mono<Void> commence(ServerWebExchange exchange, AuthenticationException e) {
//        return ResponseUtil.responseWriter(exchange, HttpStatus.UNAUTHORIZED.value(), e.getMessage());
//    }
//}
