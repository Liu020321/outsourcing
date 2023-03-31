package com.outsourcing.web;

import com.alibaba.fastjson.JSON;
import com.outsourcing.pojo.User;
import com.outsourcing.service.UserService;
import com.outsourcing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

    /**
     * 登录方法
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/json;charset=utf-8");

        BufferedReader ur = req.getReader();
        String params = ur.readLine();

        User user = JSON.parseObject(params, User.class);

        User userLogin = userService.login(user.getUserName(), user.getPassword());


        if (userLogin != null) {
            resp.getWriter().write("success");

        } else {
            req.setAttribute("login_msg", "账号或密码错误，请重试");
            req.getRequestDispatcher("/index.html").forward(req, resp);
        }


    }


}
