package org.abdullah.javabrainA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("springA.xml");
		Shape shape= (Shape) context.getBean("circle");
        shape.draw();
		

	}

}
