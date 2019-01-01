package com.kkb.controller;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-12-22 20:59
 */
public class TwoServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
        if ("POST".equals(method)) {
            doPost(servletRequest, servletResponse);
        } else if ("GET".equals(method)) {
            doGet(servletRequest, servletResponse);
        }
    }

    public void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("dopost is running ...");
    }

    public void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("doget is running ...");
    }
}
