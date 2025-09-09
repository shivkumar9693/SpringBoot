package com.springcore.ConstructorInjection;

import java.util.List;

public class Person {
	private String name;
	private List<String>phone;
	private Course course;
	Person(String name,List<String>phone,Course course){
		this.name=name;
		this.phone=phone;
		this.course=course;
	}
	@Override
	public String toString() {
		return  "name: "+name+" phone number: "+phone+" course: "+course;
	}
	
	
}
