package com.abc.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value= "classpath:config/custom.properties", encoding = "utf-8")
@ConfigurationProperties(prefix="country")
@Data
public class Country {
    private String[] cities;
}
