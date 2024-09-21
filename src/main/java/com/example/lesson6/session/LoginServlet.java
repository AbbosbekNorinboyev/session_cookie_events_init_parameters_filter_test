package com.example.lesson6.session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(
        name = "com.example.lesson6.session.LoginServlet",
        value = "/login"
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        HttpSession session = req.getSession();
//        session.setMaxInactiveInterval(60);
        Cookie cookie = new Cookie("username", username);
        cookie.setSecure(false);
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60);
        resp.addCookie(cookie);
        resp.sendRedirect("/views/profile.jsp");
    }
}
