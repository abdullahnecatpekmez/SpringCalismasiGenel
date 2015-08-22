package org.abdullah.javabrain7;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
        
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring7.xml");
		context.registerShutdownHook();
		 Triangle triangle= (Triangle) context.getBean("triangle");
         triangle.draw();

	}

}
