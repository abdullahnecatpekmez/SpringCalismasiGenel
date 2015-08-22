package org.abdullah.javabrainB;

import javax.annotation.Resource;

public class Circle implements Shape{
	private Point center;
	
	
	
	public Point getCenter() {
		
		return center;
	}
	
	@Resource(name="center")
	public void setCenter(Point center) {
		this.center = center;
		
	}
	public void draw()
	{
		System.out.println("Drawing Circle..");
		System.out.println("Circle Point is :(" + center.getX() + " ,"+center.getY() +")" );
	}
	
	
	/*@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of Circle");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	}*/
}
