package com.abc.configuration;

import com.abc.servlet.SecondServlet;
import com.abc.servlet.SomeServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.configuration
 * @ClassName: FirstJavaConfig
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/16 17:09
 * @Version: 1.0
 */
public class FirstJavaConfig {


    @Bean
    public ServletRegistrationBean<SecondServlet> getServletBean() {
        return new ServletRegistrationBean<>(new SecondServlet(), "/second1");
    }

    @Bean
    public FilterRegistrationBean<SecondFilter> getFilterBean() {
        FilterRegistrationBean<SecondFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new SecondFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
