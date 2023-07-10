package com.self.service.bpp;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Classname ApplicationConfig
 * @Date 2023/7/9 12:36 AM
 * @Created by anan
 * @Description description here
 */
@Component
public class ApplicationConfig {

	ConfigurableEnvironment environment;

	public ApplicationConfig(ConfigurableEnvironment environment) {
		this.environment = environment;
	}

	@PostConstruct
	public void init(){
		MutablePropertySources propertySources = environment.getPropertySources();
		for (PropertySource<?> propertySource : propertySources) {
			System.out.println( " name " + propertySource.getName());
//			System.out.println(propertySource.getSource().getClass());
			System.out.println(propertySource);
//			for (String propName : propertySource.) {
//				System.out.println(propName + "=" + propertySource.getProperty(propName));
//			}
		}
	}

}
