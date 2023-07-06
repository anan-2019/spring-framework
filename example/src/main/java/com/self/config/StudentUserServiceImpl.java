package example.src.main.java.com.self.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentUserServiceImpl
 * @Author 51205
 * @Date 2023/7/6 0006 22:05
 * @Version 1.0
 * @Description Class Function Description Here
 */
@Service("userService")
public class StudentUserServiceImpl implements User{
    private static Logger logger = LoggerFactory.getLogger(StudentUserServiceImpl.class);
	public String print(String param){
		System.out.println("测试成功");
		return null;
	}
}
