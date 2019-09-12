package com.xoriant.nikhil;

public class Greeter {
	public String name;
	
	public Greeter(String aName) {
		this.name=aName;
	}
	public String sayHello() {
		return("Hello " + this.name);
	}
	public void goodBye() {
		System.out.println("GoodBye " + this.name);
	}

}
