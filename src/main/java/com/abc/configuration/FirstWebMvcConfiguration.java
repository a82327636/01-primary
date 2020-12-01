package com.abc.configuration;

import com.abc.inteceptor.FirstInteceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.configuration
 * @ClassName: FirstWebMvcConfiguration
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/16 10:16
 * @Version: 1.0
 */
@Configuration
public class FirstWebMvcConfiguration implements WebMvcConfigurer {

    // @Override
    // protected void addInterceptors(InterceptorRegistry registry) {
    //     registry.addInterceptor(new SomeIntercepter())
    //             .addPathPatterns("/first/**");    // 指定拦截包含/first的URL
    // }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInteceptor())
                .excludePathPatterns("/some/**");    // 拦截所有请求，除了指定的URI之外
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/webapp/");
    }
}