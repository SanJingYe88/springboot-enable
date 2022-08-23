package it.com.filter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1315:00
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RequestLogFilterWebConfig.class)   // 注意这里
public @interface EnableRequestLog {

}
