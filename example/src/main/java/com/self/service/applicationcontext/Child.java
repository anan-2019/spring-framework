package com.self.service.applicationcontext;

import com.self.service.applicationcontext.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

public class Child {
	
	// 注意：这里并没有@Autowired注解的
    private HelloService helloService;

    private String name;
    private Integer age;

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
