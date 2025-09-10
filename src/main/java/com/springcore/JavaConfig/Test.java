package com.springcore.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public  static  void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaCOnfig_WithOut_Xml.class);
        Student std1 =context.getBean(Student.class);
        System.out.print(std1);
        std1.display();
    }


}
