package org.example.Servlet;

import org.example.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signServlet")
public class signServlet extends HttpServlet {
    private userService us=new userService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/htm;charset=utf-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        String pass=us.getPassword(username);

        //判断密码是否正确
        if(password.equals(pass)){

            req.setAttribute("username",username);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else{//密码错误
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
