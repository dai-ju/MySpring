package org.springframework.aop;

/**
 * 判断是否需要增强
 */
public interface ClassFilter {

	boolean matches(Class<?> clazz);
}
