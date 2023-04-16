package com.outsourcing.web;

import com.alibaba.fastjson.JSON;
import com.outsourcing.pojo.medicine;
import com.outsourcing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/prescribeMedicineServlet")
public class prescribeMedicineServlet extends HttpServlet {
    private UserServiceImpl us=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        List<medicine> list1=us.getMedicineByType("感冒");
        List<medicine> list2=us.getMedicineByType("胃");
        List<medicine> list3=us.getMedicineByType("头");

        String jsonString1= JSON.toJSONString(list1);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
