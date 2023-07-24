package com.self.controller;

import com.self.service.jpa.Blog;
import com.self.service.jpa.BlogRepository;
import com.self.service.mybaits.BlogMapper;
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
public class MybaitsController {

	@Autowired
	BlogMapper blogMapper;

	@GetMapping("/mybaits")
	public Object example(){
		return blogMapper.login(1L);
	}
}
