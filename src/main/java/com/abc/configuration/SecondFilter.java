package com.abc.configuration;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.configuration
 * @ClassName: SecondFilter
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/16 17:10
 * @Version: 1.0
 */
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("信息已经被过滤second1");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }
}
