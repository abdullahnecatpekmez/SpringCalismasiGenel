package com.spring.polymorhism;

public class MyApplication1 {

	public static void main(String[] args) {
		Shape triangle=  new Triangle();
		   Drawing drawing=new Drawing();
		   drawing.setShape(triangle);
		   drawing.draw();
			Shape circle=new Circle();
			drawing.setShape(circle);
			drawing.draw();

	}

}
