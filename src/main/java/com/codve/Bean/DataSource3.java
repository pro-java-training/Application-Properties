package com.codve.Bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource(
        value = {"classpath:customize.properties"},
        encoding = "UTF-8")
public class DataSource3 {
    /**
     * 使用@PropertySource 加载指定文件
     * classpath 就是src/main/resources/目录
     */
    @Value("${nginx.url}")
    private String url;

    @Value("${nginx.username}")
    private String username;

    @Value("${nginx.password}")
    private String password;

}
