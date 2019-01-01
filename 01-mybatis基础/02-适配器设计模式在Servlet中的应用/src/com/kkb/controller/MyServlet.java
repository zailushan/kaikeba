package com.kkb.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-12-22 18:27
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        HttpSession session = req.getSession();
        session.setAttribute("hello", "袁美女， 你好， 冬至快乐！！！🙂");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
