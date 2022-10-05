package org.springframework.context;

import java.util.EventObject;

/**
 * 事件处理类
 */
public abstract class ApplicationEvent extends EventObject {

	public ApplicationEvent(Object source) {
		super(source);
	}
}
