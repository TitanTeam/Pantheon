package com.titan.pantheon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class SpringUtils {

	protected static ApplicationContext appctx = null;

	static public ApplicationContext getApplicationContext() {
		return appctx;
	}

	static public void setApplicationContext(ApplicationContext ctx) {
		appctx = ctx;
	}
	
	public static Object getBean(String name){
		return appctx.getBean(name);
	}
	
	public static void publicEvent(ApplicationEvent event){
		appctx.publishEvent(event);
	}
}







