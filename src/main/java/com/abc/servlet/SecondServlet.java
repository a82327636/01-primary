package com.abc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.servlet
 * @ClassName: SecondServlet
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/16 17:11
 * @Version: 1.0
 */
public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello second Servlet");
    }
}
