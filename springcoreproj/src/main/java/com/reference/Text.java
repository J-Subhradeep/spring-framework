package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/reference/referenceconfig.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp);
	}

}
