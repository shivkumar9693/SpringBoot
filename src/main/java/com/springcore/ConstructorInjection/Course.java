package com.springcore.ConstructorInjection;

public class Course {
	String name;
	Course(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
