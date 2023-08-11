package com.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotypeAnnotation/stereoconfig.xml");
		Student student = context.getBean("mystudentobject", Student.class);
		System.out.println(student.hashCode());
		Student student2 = context.getBean("mystudentobject",Student.class);
		System.out.println(student2.hashCode());
	}

}
 