package it.com.seleter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1315:08
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({LogImportSelector.class})   // 注意
public @interface EnableSelectorLog {
    String style() default "1";  // 样式
}
