package com.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mystudentobject")
@Scope("prototype")
public class Student {
	@Value("Subhradeep")
	private String studentName;
	@Value("Kolkata")
	private String city;
	@Value("#{temp}")
	private List<String> friends;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", friends=" + friends + "]";
	}
}
