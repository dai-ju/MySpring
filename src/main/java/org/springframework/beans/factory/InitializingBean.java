package org.springframework.beans.factory;

/**
 * 初始化bean
 */
public interface InitializingBean {

	void afterPropertiesSet() throws Exception;
}
