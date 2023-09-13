package com.self.config;

import com.self.model.Bar;
import com.self.model.Foo;
import com.self.service.intercepts.TestIntercept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName Configuration
 * @Author 51205
 * @Date 2023/7/6 0006 21:44
 * @Version 1.0
 * @Description Class Function Description Here
 */
@Configuration
public class Configurations extends WebMvcConfigurerAdapter {
    private static Logger logger = LoggerFactory.getLogger(Configurations.class);

    @Value("${server.port}")
    private int port;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册自己的拦截器并设置拦截的请求路径
		registry.addInterceptor(new TestIntercept()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

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
