package com.abc.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value= "classpath:config/custom.properties", encoding = "utf-8")
@ConfigurationProperties(prefix="school")
@Data
public class School {
    private Depart[] departs;
}
