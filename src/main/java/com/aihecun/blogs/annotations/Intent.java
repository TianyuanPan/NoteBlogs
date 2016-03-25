package com.aihecun.blogs.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 意图，在Controller使用
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Intent {
	public String value();
}
