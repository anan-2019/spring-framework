package com.self.service.applicationcontext;

import com.self.model.GirlFriend;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @Classname MyInstantiationAwareBeanPostProcessor
 * @Date 2023/12/28 14:19
 * @Created by anan
 * @Description description here
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//		System.out.println(beanName + " is creating");
		if (beanName.equals("girlFriend")) {
			return new GirlFriend("我是 打劫的");
		}
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

}
