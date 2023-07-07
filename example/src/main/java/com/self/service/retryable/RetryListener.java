package com.self.service.retryable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.listener.RetryListenerSupport;
import org.springframework.stereotype.Component;

@Component("retryListener")
public class RetryListener extends RetryListenerSupport {
    private static Logger logger = LoggerFactory.getLogger(RetryListener.class);
    @Override
    public <T, E extends Throwable> void onError(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
        logger.debug("监听到重试过程错误了，e:",throwable);
        logger.error(throwable.getMessage());
    }

    @Override
    public <T, E extends Throwable> boolean open(RetryContext context, RetryCallback<T, E> callback) {
        logger.debug("监听到重试过程开启了");
        return true;
    }
}