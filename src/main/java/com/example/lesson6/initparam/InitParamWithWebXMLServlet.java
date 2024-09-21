package com.example.lesson6.initparam;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class InitParamWithWebXMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String databaseUser = servletConfig.getInitParameter("database.user");
        String databasePassword = servletConfig.getInitParameter("database.password");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1> User : " + databaseUser + "</h1>");
        writer.println("<h1> Password : " + databasePassword + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
