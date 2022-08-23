package it.com.seleter;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title:
 * @Description:
 * @date 2022/7/1315:07
 */
public class LogImportSelector implements ImportSelector {

    public static Map<String, String> CLAZZ_MAP = new HashMap<>();

    static {
        CLAZZ_MAP.put("1", LogFilterWebConfig1.class.getName());
        CLAZZ_MAP.put("2", LogFilterWebConfig2.class.getName());
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //获取注解上的属性
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableSelectorLog.class.getName());
        if (annotationAttributes != null) {
            String res = CLAZZ_MAP.get("" + annotationAttributes.get("style"));
            if (res == null || "".equals(res)) {
                throw new RuntimeException("未配置的style");
            }
            return new String[]{res};
        }
        return new String[]{null};
    }
}
