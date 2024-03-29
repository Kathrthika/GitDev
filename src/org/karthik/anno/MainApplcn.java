package org.karthik.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplcn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springannotations.xml");
		context.registerShutdownHook();
		Circle circle = (Circle)context.getBean("circle");
		circle.drawing();
		
		Shape shape = (Shape)context.getBean("circle");
		shape.drawing();

	}

}
