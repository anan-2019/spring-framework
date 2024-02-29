package com.self.service.applicationcontext;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname AutowireCapableBeanFactoryTest
 * @Date 2023/9/15 16:20
 * @Created by anan
 * @Description description here
 */
public class AutowireCapableBeanFactoryTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.self.service.applicationcontext");
        // ApplicationContext里面是持久AutowireCapableBeanFactory这个工具的，它真实的实现类一般都是：DefaultListableBeanFactory
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();

        // 我们吧Child的创建过程都交给Bean工厂去帮我们处理，自己连new都不需要了 （createBean方法执行多次，就会创建多个child实例）
        Child child = (Child) autowireCapableBeanFactory.createBean(Child.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);

        //没有@Autowired注解都给注入进来了~~~
        System.out.println(child.getHelloService()); //HelloServiceImpl@6a78afa0
        System.out.println(child);

        System.out.println(applicationContext.getBean(HelloService.class));
        // 抛出异常 No qualifying bean of type 'Child' available
        // 能佐证：我们的Bean并没交给Spring容器管理，它只是帮我们创建好了，并把对应属性注入进去了
        Child bean = applicationContext.getBean(Child.class);
        System.out.println(bean);
    }
}
