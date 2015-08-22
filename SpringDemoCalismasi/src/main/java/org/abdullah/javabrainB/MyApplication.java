package org.abdullah.javabrainB;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class MyApplication {
	
	public static void main(String[] args) {
		
		  AbstractApplicationContext context= new ClassPathXmlApplicationContext("springB.xml");
	  context.registerShutdownHook();
		Shape shape=  (Shape) context.getBean("circle");
        shape.draw();
		

	}

}
