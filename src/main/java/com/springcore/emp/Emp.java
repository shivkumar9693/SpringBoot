package com.springcore.emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private String name;
private List<String>phones;
private Set<String>email;
private Map<String,Integer>post;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getEmail() {
	return email;
}
public void setEmail(Set<String> email) {
	this.email = email;
}
public Map<String, Integer> getPost() {
	return post;
}
public void setPost(Map<String, Integer> post) {
	this.post = post;
}
public Emp(String name, List<String> phones, Set<String> email, Map<String, Integer> post) {
	super();
	this.name = name;
	this.phones = phones;
	this.email = email;
	this.post = post;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [name=" + name + ", phones=" + phones + ", email=" + email + ", post=" + post + "]";
}


}
