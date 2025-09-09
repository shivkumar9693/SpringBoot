package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		Student std1=(Student) context.getBean("stdref");
		System.out.println(std1);
		System.out.println(std1.getRoll());
		System.out.println(std1.getName());
		System.out.println(std1.getAddress().getCity());
		System.out.println(std1.getAddress().getCountry());

	}

}
