package com.self.service.retryable;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Classname RetryAbleTest
 * @Date 2023/7/7 11:58 AM
 * @Created by anan
 * @Description description here
 */
@Component
public class RetryAbleTest implements ApplicationContextAware, ApplicationListener<ApplicationStartedEvent> {
	ApplicationContext applicationContext;

	Executor executor = Executors.newFixedThreadPool(2);

	@Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 60000, multiplier = 1, maxDelay = 60001))
	public void recountStorage(String entId) {
		throw new RuntimeException("wosile");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		RetryAbleTest bean = applicationContext.getBean(RetryAbleTest.class);
		executor.execute(() -> {
			try {
				bean.recountStorage("");
			} catch (BeansException e) {

			}
		});
	}
}
