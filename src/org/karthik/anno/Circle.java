package org.karthik.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	
	
	
	private Point centre;
	private Point centre1;
	
	

	public Point getCentre1() {
		return centre1;
	}



    @Resource(name="p2")
	public void setCentre1(Point centre1) {
		this.centre1 = centre1;
	}




	public Point getCentre() {
		return centre;	}



	
	@Autowired
	@Qualifier("circleu")
	public void setCentre(Point centre) {
		this.centre = centre;
	}








	@Override
	public void drawing() {
		System.out.println("Drawing Circle");
		System.out.println("Point is :"+centre.getX()+" "+centre.getY());
		System.out.println("Point for centre1:"+centre1.getX()+" "+centre1.getY());		
	
	
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Initializing Circle");
	}
	
	
	@PreDestroy
	public void destroCircle() {
		System.out.println("destroCircle");
	}

}
