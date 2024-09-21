package com.example.lesson6;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "com.example.lesson6.ErrorBadRequestServlet",
        value = "/error/400"
)
public class ErrorBadRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = (String) req.getAttribute("jakarta.servlet.error.message");
        String request_uri = (String) req.getAttribute("jakarta.servlet.error.request_uri");
        int status_code = (int) req.getAttribute("jakarta.servlet.error.status_code");
        req.setAttribute("error_message", message);
        req.setAttribute("error_uri", request_uri);
        req.setAttribute("error_code", status_code);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/400.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
