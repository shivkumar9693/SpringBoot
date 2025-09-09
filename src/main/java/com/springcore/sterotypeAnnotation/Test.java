package com.springcore.sterotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static  void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/sterotypeconfig.xml");
//       Student st1= context.getBean("student",Student.class);
//       System.out.println(st1);
//       System.out.println(st1.hashCode());
//       System.out.println("______________");
//       Student st2=context.getBean("student",Student.class);
//       System.out.println(st2.hashCode());
//       System.out.println(st1==st2);
        Student st1 = context.getBean("student", Student.class);
        System.out.println("st1: " + st1);
        System.out.println("st1.hashCode(): " + st1.hashCode());

        Student st2 = context.getBean("student", Student.class);
        System.out.println("st2: " + st2);
        System.out.println("st2.hashCode(): " + st2.hashCode());

        System.out.println("st1 == st2 ? " + (st1 == st2));

    }
}
