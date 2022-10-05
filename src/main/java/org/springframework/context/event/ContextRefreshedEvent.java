package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * 刷新事件
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
