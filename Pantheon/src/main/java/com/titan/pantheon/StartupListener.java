package com.titan.pantheon;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class StartupListener extends ContextLoaderListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
	    // call Spring's context ContextLoaderListener to initialize
	    // all the context files specified in web.xml
	    super.contextInitialized(event);
		SpringUtils.setApplicationContext(WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext()));		
	}
}
