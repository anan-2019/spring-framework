package com.ys;

import com.ys.ioc.IocTestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname ${NAME}
 * @Date 2023/8/30 13:15
 * @Created by anan
 * @Description description here
 */
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:./springBean.xml");
//		context.getBean("transactionManager");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext("com.ys.ioc");
		IocTestController bean = context1.getBean(IocTestController.class);
//		SpringApplication.run(Main.class, args);
	}
}