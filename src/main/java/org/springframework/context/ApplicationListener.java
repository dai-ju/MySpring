package org.springframework.context;

import java.util.EventListener;

/**
 * 实现该接口可以监听事件
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	void onApplicationEvent(E event);
}