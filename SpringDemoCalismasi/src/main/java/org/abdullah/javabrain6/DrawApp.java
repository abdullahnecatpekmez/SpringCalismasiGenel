package org.abdullah.javabrain6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
        
		ApplicationContext context= new ClassPathXmlApplicationContext("spring6.xml");
		 Triangle triangle= (Triangle) context.getBean("triangle1");
         triangle.draw();

	}

}
