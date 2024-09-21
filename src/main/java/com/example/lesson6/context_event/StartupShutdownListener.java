package com.example.lesson6.context_event;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import lombok.extern.java.Log;

@Log
public class StartupShutdownListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("========== APPLICATION READY ==========");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("========== APPLICATION SHUTDOWN ==========");
    }
}
