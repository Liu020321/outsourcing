package com.outsourcing.web;

import com.outsourcing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doctorRegisteredChangeServlet")
public class doctorRegisteredChangeServlet extends HttpServlet {
    private UserServiceImpl us=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String id1=req.getParameter("id");
        int id=Integer.parseInt(id1);

        boolean b=us.changeStatus(id);

        if(b){
            resp.setContentType("text/json;charset=utf-8");
            resp.getWriter().write("success");
        }else{
            resp.setContentType("text/json;charset=utf-8");
            resp.getWriter().write("fail");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
