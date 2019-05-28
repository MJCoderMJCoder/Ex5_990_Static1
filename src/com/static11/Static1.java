package com.static11;

public class Static1 {

	//所有Person类的实例对象，都共享类变量totalNum所指的内存区域
	public static void main(String[] args) {
		System.out.println("目前出生的人数：" + Person.totalNum);
		
		Person wang = new Person("wang");
		Person liu = new Person("liu");
		Person zhao = new Person("zhao");
		
		System.out.println("目前出生的人数：" + Person.totalNum);
		System.out.println("目前出生的人数：" + wang.totalNum);

	}

}
