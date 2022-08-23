package it.com.seleter;

import org.springframework.context.annotation.Bean;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1315:11
 */
public class LogFilterWebConfig2 {
    @Bean
    public LogFilter2 logFilter2() {
        return new LogFilter2();
    }
}
