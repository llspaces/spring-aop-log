package com.lyp.aoplog.annotation;

import java.lang.annotation.*;

/**
 * <p>@filename ControllerLog</p>
 * <p>
 * <p>@description Controller层日志自定义注解</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/13 11:42
 **/
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerLog {
    String description() default "";
}
