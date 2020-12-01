package com.abc.configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.configuration
 * @ClassName: FirstFilter
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/16 15:59
 * @Version: 1.0
 */
@WebFilter("/*")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("信息已经被过滤first1");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }
}
