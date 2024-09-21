package com.example.lesson6.initparam;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "com.example.lesson6.initparam.InitParamWithOutWebXMLServlet",
        value = "/init_without_xml",
        initParams = {
                @WebInitParam(
                        name = "database.user",
                        value = "postgres"
                ),
                @WebInitParam(
                name = "database.password",
                value = "2210"
        )
        }
)
public class InitParamWithOutWebXMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String databaseUser = servletConfig.getInitParameter("database.user");
        String databasePassword = servletConfig.getInitParameter("database.password");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1> User (WithOut XML) : " + databaseUser + "</h1>");
        writer.println("<h1> Password (WithOut XML) : " + databasePassword + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
