package com.spring.jdbc.entites;

public class Student {
	
	private String name;
	private String city;
	private int id=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student( String name, String city) {
		super();
		
		this.name = name;
		this.city = city;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", id=" + id + "]";
	}
	
}
