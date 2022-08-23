package it.com.seleter;

import org.springframework.context.annotation.Bean;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1315:11
 */
public class LogFilterWebConfig1 {
    @Bean
    public LogFilter1 logFilter1() {
        return new LogFilter1();
    }
}
