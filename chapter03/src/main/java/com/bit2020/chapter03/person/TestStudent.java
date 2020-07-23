package com.bit2020.chapter03.person;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		
		Person p = s;              // Downcasting, implicity(암시적)
		Student s2 = (Student)p;   // Upcasting, explicity(명시적)
	}
}
