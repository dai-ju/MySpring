package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * 关闭事件
 */
public class ContextClosedEvent extends ApplicationContextEvent {

	public ContextClosedEvent(ApplicationContext source) {
		super(source);
	}
}
