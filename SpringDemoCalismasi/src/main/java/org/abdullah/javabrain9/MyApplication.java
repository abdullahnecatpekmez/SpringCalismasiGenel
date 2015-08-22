package org.abdullah.javabrain9;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void myDrawMethod(Shape shape)
	{
		shape.draw();
	}

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring9.xml");
		Shape shape= (Shape) context.getBean("circle");
        shape.draw();
		

	}

}
