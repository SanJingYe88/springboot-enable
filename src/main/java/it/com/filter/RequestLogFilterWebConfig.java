package it.com.filter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1314:59
 */
@ConditionalOnWebApplication
public class RequestLogFilterWebConfig {
    @Bean
    public RequestLogFilter timeFilter() {
        return new RequestLogFilter();
    }
}
