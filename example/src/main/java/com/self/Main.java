package com.self;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
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
@EnableEncryptableProperties
@EnableCaching
public class Main {
//    private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		SpringApplication.run(Main.class,args);
	}
}
