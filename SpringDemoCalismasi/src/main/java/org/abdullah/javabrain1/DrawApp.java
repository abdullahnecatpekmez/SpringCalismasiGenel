package org.abdullah.javabrain1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
        
		ApplicationContext context= new ClassPathXmlApplicationContext("spring1.xml");
		 Triangle triangle= (Triangle) context.getBean("triangle");
         triangle.draw();

	}

}
