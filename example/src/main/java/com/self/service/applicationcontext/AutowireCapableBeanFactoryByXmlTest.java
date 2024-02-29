package com.self.service.applicationcontext;

import com.self.model.BoyFriend;
import com.self.model.GirlFriend;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname AutowireCapableBeanFactoryByXmlTest
 * @Date 2023年12月27日14:08:28
 * @Created by anan
 * @Description description here
 */
public class AutowireCapableBeanFactoryByXmlTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        System.out.println(applicationContext.getBean(GirlFriend.class));
        System.out.println(applicationContext.getBean(BoyFriend.class));


    }


}
