package com.example.lesson6.session;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        String id = session.getId();
        System.out.println("Session created with id: " + id);
//        session.setMaxInactiveInterval(10);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent   se) {
        HttpSession session = se.getSession();
        String id = session.getId();
        System.out.println("Session destroyed with id: " + id);
    }
}
