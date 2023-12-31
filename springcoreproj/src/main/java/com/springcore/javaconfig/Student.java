package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Student {
	@Autowired
	@Qualifier("samosabean")
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void details() {
		samosa.display();
		System.out.println("Studying");
	}
	
}
