package com.self.controller;

import com.self.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname ExampleController
 * @Date 2023/7/7 9:32 AM
 * @Created by anan
 * @Description description here
 */
@RestController
public class ExampleController1 {


	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/1")
	public Object example(){
		
		ResponseEntity<String> forEntity = restTemplate.getForEntity("https://nones.xylink.com/project/#/workspace/home", String.class);
		return forEntity;
	}
}
