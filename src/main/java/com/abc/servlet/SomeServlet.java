package com.abc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.servlet
 * @ClassName: SomeServlet
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/16 16:01
 * @Version: 1.0
 */
@WebServlet(name = "/first")
public class SomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello frist Servlet");
    }
}
