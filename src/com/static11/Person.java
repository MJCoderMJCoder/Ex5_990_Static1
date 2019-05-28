package com.static11;

class Person {
	static long totalNum = 10000;	//类变量（静态变量）
	int age;
	String name;
	String id;
	
	public Person(String name) {
		totalNum++;
		this.name = name;
		age = 1;
	}
}
