package example.src.main.java.com.self.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Configuration
 * @Author 51205
 * @Date 2023/7/6 0006 21:44
 * @Version 1.0
 * @Description Class Function Description Here
 */
@Configuration
public class Configurations {
    private static Logger logger = LoggerFactory.getLogger(Configurations.class);

    @Value("${server.port}")
    private int port;
}
