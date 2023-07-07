package com.self;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @ClassName Main
 * @Author 51205
 * @Date 2023/7/6 0006 20:37
 * @Version 1.0
 * @Description Class Function Description Here
 */
@SpringBootApplication
@EnableRetry
public class Main {
//    private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		SpringApplication.run(Main.class,args);
	}
}
