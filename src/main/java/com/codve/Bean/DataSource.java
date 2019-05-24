package com.codve.Bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSource {
    /**
     * 使用@ConfigurationProperties 读取多个属性
     */
    private String url;

    private String username;

    private String password;
}
