package com.aihecun.blogs.annotations.dbmodel;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by TianyuanPan on 3/22/16.
 *
 * The Interface FK.
 * 外键
 * @author yp
 * @date 2016-01-15 10:46:17 中国标准时间
 */

@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface FK {

    /**
     * 列名.
     */
    public String columnName() default "";

}
