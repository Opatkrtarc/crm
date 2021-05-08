package cn.wolfcode.crm.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Makol
 * @time   2018年6月20日 下午6:51:37
 * @email  Administrator@qq.com
 * @description 
 */
//自定义的异常,抛出自定义异常时使用
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiredPermission {
	String value();
}
