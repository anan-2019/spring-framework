package com.self.config;

import com.self.model.Bar;
import com.self.model.Foo;
import com.self.service.Teacher;
import com.self.service.User;
import com.self.service.impl.StudentUserServiceImpl;
import com.self.service.impl.TeacherImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Configuration
 * @Author 51205
 * @Date 2023/7/6 0006 21:44
 * @Version 1.0
 * @Description Class Function Description Here
 */
@Configuration
public class Configurations {
    private static Logger logger = LoggerFactory.getLogger(Configurations.class);

    @Value("${server.port}")
    private int port;

	@Bean
	public Foo createFoo() {
		Foo foo = new Foo();
		System.out.println(foo.value); // Prints null - foo not initialized yet
		return foo;
	}

	@Bean
	public Bar createBar() {
		Foo foo = createFoo();
		System.out.println(foo.value); // Prints Hello, world! - foo have been initialized by the interceptor
		return new Bar(foo);
	}
}
