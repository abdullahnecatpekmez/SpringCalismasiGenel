package com.spring.polymorhism;

public class Drawing {
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void draw()
	{
		this.shape.draw();
	}

}
