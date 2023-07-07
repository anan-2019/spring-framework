package com.self.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Classname LogAop
 * @Date 2023/7/7 1:26 PM
 * @Created by anan
 * @Description description here
 */
@Aspect
//这个也不能漏掉
@Component
public class LogAop {

	private static final Logger logger = LoggerFactory.getLogger(LogAop.class);

	@Pointcut("execution(* com.self.service.impl.*.*(..))")
	public void point(){}

	@Around("point()")
	public Object invoke(ProceedingJoinPoint point) throws Throwable {
		logger.info("start to invoke :{}", point.getSignature().getName());
		Object proceed = point.proceed();
		logger.info("end to invoke :{}", point.getSignature().getName());
		return proceed;
	}
}
