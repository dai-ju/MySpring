package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * 通知器接口
 */
public interface Advisor {

	Advice getAdvice();

}
