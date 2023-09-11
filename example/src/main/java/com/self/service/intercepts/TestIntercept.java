package com.self.service.intercepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname TestIntercept
 * @Date 2023/9/11 13:16
 * @Created by anan
 * @Description description here
 */
public class TestIntercept extends HandlerInterceptorAdapter {

    Logger logger = LoggerFactory.getLogger(TestIntercept.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("receive request:{}", request.getRequestURI());
        return super.preHandle(request, response, handler);
    }
}
