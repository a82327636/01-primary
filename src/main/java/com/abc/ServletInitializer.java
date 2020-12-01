package com.abc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc
 * @ClassName: ServletInitializer
 * @Author: zwj
 * @Description: 注释 如果使用外部tomcat运行war包，需要SpringBootServletInitializer
 * @Date: 2020/10/14 15:47
 * @Version: 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
