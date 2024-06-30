package io.github.spafka.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
public class JwtFilter implements GlobalFilter, Ordered {

    private static final String AUTH_SERVER_URL = "lb://auth/auth/login";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 假设你有一个方法来检查JWT token是否存在
        String token = extractToken(exchange);
//        if (token == null || !isTokenValid(token)) {
//            // 如果JWT不存在或无效，重定向到认证服务器
//            return exchange.getResponse().setComplete();
//        }
        return chain.filter(exchange);
    }

    private String extractToken(ServerWebExchange exchange) {
        // 实现从请求中提取JWT token的逻辑
        // 例如：从请求头或者查询参数中获取
        return exchange.getRequest().getQueryParams().getFirst("token");
    }

    private boolean isTokenValid(String token) {
        // 实现JWT token验证的逻辑
        // 例如：通过调用认证服务或者使用一个库来验证
        return false; // 假设验证不通过
    }

    @Override
    public int getOrder() {
        // 设置过滤器的顺序
        return -1;
    }
}