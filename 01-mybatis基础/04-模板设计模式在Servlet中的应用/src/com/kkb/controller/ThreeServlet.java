package com.kkb.controller;

import com.kkb.util.KKBHttpServlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-12-30 18:47
 */
public class ThreeServlet extends KKBHttpServlet {

    @Override
    public void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("three doPost servlet is run");
    }

    @Override
    public void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("three doGet servlet is run");
    }
}
