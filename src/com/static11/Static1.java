package com.static11;

public class Static1 {

	//����Person���ʵ�����󣬶����������totalNum��ָ���ڴ�����
	public static void main(String[] args) {
		System.out.println("Ŀǰ������������" + Person.totalNum);
		
		Person wang = new Person("wang");
		Person liu = new Person("liu");
		Person zhao = new Person("zhao");
		
		System.out.println("Ŀǰ������������" + Person.totalNum);
		System.out.println("Ŀǰ������������" + wang.totalNum);

	}

}
