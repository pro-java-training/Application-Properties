package com.codve.Bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@Component
@PropertySource("classpath:customize.properties")
public class DataSource4 {

    /**
     * Java 变量的初始化顺序:
     * 1. 静态变量和静态语句块
     * 2. 非静态变量和构造代码块
     * 3 构造方法
     * 4 @Value 和 @Autowired
     * 所以，如果在构造函数中输出成员值，由于注解还没有执行，一般得到的都是null
     */
    @Value("${nginx.url}")
    private String url;

    @Value("${nginx.username}")
    private String username;

    @Value("${nginx.password}")
    private String password;

    public DataSource4(@Value("${nginx.url}") String url,
                       @Value("${nginx.username}") String username,
                       @Value("${nginx.password}") String password) {
        log.info("url: {}, username: {}, password: {}", url, username, password);
        this.url = url;
        this.username = username;
        this.password = password;
    }

}
