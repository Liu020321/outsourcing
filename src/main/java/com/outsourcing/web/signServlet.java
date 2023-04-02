package com.outsourcing.web;

import com.outsourcing.service.UserService;
import com.outsourcing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.SocketTimeoutException;

@WebServlet("/signServlet")
public class signServlet extends HttpServlet {
    private UserServiceImpl us=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName=req.getParameter("userName");

        String password=req.getParameter("password");

        System.out.println(userName);
        System.out.println(password);

        if(userName.equals("1")){
            req.getRequestDispatcher("main.html").forward(req,resp);
        }else if(userName.equals("2")){
            req.getRequestDispatcher("patientMain.html").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
