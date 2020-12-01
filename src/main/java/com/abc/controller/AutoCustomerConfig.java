package com.abc.controller;

import com.abc.dto.Country;
import com.abc.dto.School;
import com.abc.dto.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.controller
 * @ClassName: AutoCustomerConfig
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/14 16:31
 * @Version: 1.0
 */
@RestController
@RequestMapping("/autoconfig")
@PropertySource(value= "classpath:config/custom.properties", encoding = "utf-8")
public class AutoCustomerConfig {

    @Value("${server.port}")
    private int port;

    @Value("${student.name}")
    private String name;

    @Autowired
    private Student student;

    @Autowired
    private Country country;

    @Autowired
    private School school;


    @GetMapping("/port")
    public String portHandle() {
        return "服务器端口号为：" + port;
    }

    @GetMapping("/name")
    public String nameHandle() {
        return name;
    }

    @GetMapping("/student")
    public Object studentHandle() {
        return student;
    }

    @GetMapping("/country")
    public Object couHandle() {
        return country;
    }

    @GetMapping("/school")
    public Object schoolHandle() {
        return school;
    }

}
