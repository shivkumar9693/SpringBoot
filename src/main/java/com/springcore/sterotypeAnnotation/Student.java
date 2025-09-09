package com.springcore.sterotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //we do it to make it nor singleton by default it give same hashcode for all object of this class
public class Student {
    @Value("shiv")
    private String name;
    @Value("01")
    private  int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", hashCode=" + this.hashCode() +
                '}';
    }
}
