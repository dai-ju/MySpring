package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * bean容器
 */
public interface BeanFactory {

	/**
	 * 获取bean
	 *
	 * @param name
	 * @return
	 * @throws BeansException bean不存在时
	 */
	Object getBean(String name) throws BeansException;

	/**
	 * 根据名称和类型查找bean
	 *
	 * @param name
	 * @param requiredType
	 * @param <T>
	 * @return
	 * @throws BeansException
	 */
	<T> T getBean(String name, Class<T> requiredType) throws BeansException;

	/**
	 * 根据类型查找bean
	 * @param requiredType
	 * @param <T>
	 * @return
	 * @throws BeansException
	 */
	<T> T getBean(Class<T> requiredType) throws BeansException;

	/**
	 * 判断bean是否在容器中
	 * @param name
	 * @return
	 */
	boolean containsBean(String name);
}
