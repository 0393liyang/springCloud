package com.mc.gateway.auth;

import com.mc.common.utils.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * [JsonAccessDeniedHandler 403拒绝访问异常处理，转换为JSON]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/12 0012 10:19
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Slf4j
public class JsonAccessDeniedHandler implements ServerAccessDeniedHandler {
    @Override
    public Mono<Void> handle(ServerWebExchange exchange, AccessDeniedException e) {
        return ResponseUtil.responseWriter(exchange, HttpStatus.FORBIDDEN.value(), e.getMessage());
    }
}
