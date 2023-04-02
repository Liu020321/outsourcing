package com.outsourcing.web;

import com.outsourcing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/analyzeServlet")
public class analyzeServlet extends HttpServlet {
    private UserServiceImpl us=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String name=req.getParameter("name");

        if(name.equals("复方阿司匹林")){
            req.setAttribute("result", "价格基本一致");
            req.getRequestDispatcher("analyzePriceResult.html").forward(req,resp);
        }else if(name.equals("安神补脑液")){
            req.setAttribute("result","价格在合理范围内");
            req.getRequestDispatcher("analyzePriceResult.html").forward(req,resp);
        }else if(name.equals("阿莫西林胶囊")){
            req.setAttribute("result","价格远高于市场价");
            req.getRequestDispatcher("analyzePriceResult.html").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
