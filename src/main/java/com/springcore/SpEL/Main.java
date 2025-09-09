package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class Main {
	@Value("#{22+33}")
	private int a;
	@Value("#{6>8?55:66}")
	private int b;
	
	//******Static Method *****
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private double c;
	
	// ***********static Variable *********
	@Value("#{T(java.lang.Math).PI}")
	private double d;

    //****create Object*****
    @Value("#{new java.lang.String('Shiv')}")
    private String Name;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}

    @Override
    public String toString() {
        return "Main{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", Name='" + Name + '\'' +
                '}';
    }
}
