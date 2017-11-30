package com.sathya.test;

public class Hello {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSayHello() {
		return "Hello " + getName();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private String name;
	
	private String sayHello;
	
	private int index;
	
	
	public Hello (int index,String name) {
		this.index = index;
		this.name = name;
	}
	

}
