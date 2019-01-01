package com.kkb.controller;

import com.kkb.util.KKBGenericServlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-12-22 16:45
 */
public class OneServlet extends KKBGenericServlet {


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("oneServlet runing...");
        String string = "袁美女，你好， 冬至快乐！！！";
        /*InputStream in = servletRequest.getInputStream();
        OutputStream out = servletResponse.getOutputStream();
        out.write(string.getBytes());

        ServletContext application = this.getServletContext();//this是这个页面
        RequestDispatcher rd = application.getRequestDispatcher("/目标页面");
        rd.forward(request, response);
        servletResponse.set*/

    }



}
