package com.self.controller;

import com.self.service.User;
import com.self.service.jpa.Blog;
import com.self.service.jpa.BlogRepository;
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
public class JpaController {

	@Autowired
	BlogRepository blogRepository;

	@GetMapping("/jpa")
	public Object example(){
		Blog blog = new Blog();

		blog.setId(12321312L);
		blog.setName("12321312L");
		return blogRepository.save(blog);
	}
}
