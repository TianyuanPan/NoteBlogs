package com.aihecun.blogs.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 必须参数标记
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MustParam {
    String value() default "";
}
