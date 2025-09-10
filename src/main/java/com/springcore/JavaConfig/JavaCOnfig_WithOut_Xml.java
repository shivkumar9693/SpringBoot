package com.springcore.JavaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.springcore.JavaConfig")
public class JavaCOnfig_WithOut_Xml {
    public Student getStudent(){
        Student student=new Student();
        return student;
    }
}
