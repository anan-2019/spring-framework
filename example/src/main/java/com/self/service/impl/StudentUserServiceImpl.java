package com.self.service.impl;

import com.self.model.Foo;
import com.self.service.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentUserServiceImpl
 * @Author 51205
 * @Date 2023/7/6 0006 22:05
 * @Version 1.0
 * @Description Class Function Description Here
 */
@Service("userService")
public class StudentUserServiceImpl implements User {
    private static Logger logger = LoggerFactory.getLogger(StudentUserServiceImpl.class);

	@Cacheable(value = "test",key =  "'SDK:ENTERPRISE:TOKEN:' + #p0")
	public Object print(String param){
		System.out.println("测试成功");
		return new Foo();
	}
}
