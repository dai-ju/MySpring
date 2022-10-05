package org.springframework.beans.factory;

/**
 * 销毁bean的时候的回调接口
 */
public interface DisposableBean {

	void destroy() throws Exception;
}
