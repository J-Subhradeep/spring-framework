package com.autowireing.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("temp")
	private A address;

	public A getAddress() {
		return address;
	}

	public void setAddress(A address) {
		this.address = address;
	}

	public Employee(A address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
