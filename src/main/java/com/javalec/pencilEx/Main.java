package com.javalec.pencilEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		//Spring DI is maximized in maintenance when a project is bigger. 
		
		
		/*
		
		way 1 in use of configuration file
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		*/
		
		//way 2 in use of configuration file directly
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Pencil pencil = ctx.getBean("pencil", Pencil.class); /* ID of an instance, type of the instance */
		pencil.use();
		
		ctx.close();

	}

}
