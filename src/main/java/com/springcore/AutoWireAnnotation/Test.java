package com.springcore.AutoWireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static  void  main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("/autowireconfig.xml");
         Person p1=context.getBean("person",Person.class);
         System.out.println(p1);
    }
}
