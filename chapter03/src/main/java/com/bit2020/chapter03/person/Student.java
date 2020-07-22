package com.bit2020.chapter03.person;

public class Student extends Person {
	public Student() {
		// 자식 생성자에 부모 생성자를 명시 하지 않으면
		// Compiler가 자식생성자 코드 맨~앞에 부모 디폴트 생성자를 자동으로 넣어준다.
		// super();
		System.out.println("Student() Called");
	}

	public void test() {
		//자식에서는 부모의 private 필드나 메소드 접근 불가
		//name = "둘리";
		//자식에서는 부모의 protected 필드나 메소드 접근 가능
		height = 140;
		//자식에서는 부모의 public 필드나 메소드 접근 가능
		weight = 30;
	}
}
