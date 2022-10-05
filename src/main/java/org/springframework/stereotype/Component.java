package org.springframework.stereotype;

import java.lang.annotation.*;

/**
bean注入
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

	String value() default "";
}