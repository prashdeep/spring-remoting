package com.remoting.http;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientInvoker {
	
	private static Logger logger = Logger.getAnonymousLogger();

	public static int sum(int a, int b) {
		logger.log(Level.ALL, "Testing");
		ApplicationContext context = new ClassPathXmlApplicationContext("client-config.xml");
		Calculation calculation = (Calculation) context.getBean("transferService");
		logger.log(Level.INFO, "testing....");
		return calculation.add(78, 4);
	}

}
