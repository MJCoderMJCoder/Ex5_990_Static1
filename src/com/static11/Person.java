package com.static11;

class Person {
	static long totalNum = 10000;	//���������̬������
	int age;
	String name;
	String id;
	
	public Person(String name) {
		totalNum++;
		this.name = name;
		age = 1;
	}
}
