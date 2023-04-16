package com.outsourcing.web;

import com.outsourcing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/chooseMedicineServlet")
public class chooseMedicineServlet extends HttpServlet {
    private UserServiceImpl us=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String id1=req.getParameter("id");
        int id=Integer.parseInt(id1);

        String history=us.getHistoryById(id);

        //修改历史记录，将本次就诊信息保存到之前的history模块里面

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
