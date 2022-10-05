package org.springframework.beans.factory;

/**
 * 可以手动实例化bean
 */
public interface FactoryBean<T> {

	T getObject() throws Exception;

	boolean isSingleton();
}
