package com.self.controller;

import com.self.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ExampleController
 * @Date 2023/7/7 9:32 AM
 * @Created by anan
 * @Description description here
 */
@RestController
public class ExampleController {

	@Autowired
	User user;

	@GetMapping
	public Object example(){
		return user.print("");
	}
}
