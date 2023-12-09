package com.self.service.mybaits;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

@Component
@Intercepts({@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})})
public class ResultIntercept implements Interceptor {

	Logger logger = LoggerFactory.getLogger(ResultIntercept.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 执行sql返回结果
        List<Object> result = (List<Object>) invocation.proceed();
        try {
            for (Object basePage : result) {
                // 获取创建时间
                Object obj = getCreatedDate("createdDate", basePage);
                // 替换创建时间
                setCreatedDate("createdDate", basePage, LocalDate.now());
            }
        } catch (Throwable throwable) {
			logger.error("创建日期转换异常，请检查", throwable);
        } finally {
            return result;
        }
    }

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {

	}

	public Object getCreatedDate(String fieldName, Object basePage) throws Throwable {
        Object obj = null;
        Field field = basePage.getClass().getDeclaredField(fieldName);
        if (field != null) {
            field.setAccessible(true);
            obj = field.get(basePage);
        }
        return obj;
    }

    public void setCreatedDate(String fieldName, Object basePage, Object date) throws Throwable {
        Field userNameField = basePage.getClass().getDeclaredField(fieldName);
        if (userNameField != null) {
            userNameField.setAccessible(true);
            userNameField.set(basePage,date);
        }
    }
}