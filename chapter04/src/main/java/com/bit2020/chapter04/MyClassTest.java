package com.bit2020.chapter04;

import java.util.ArrayList;
import java.util.List;

public class MyClassTest {
	
	public static void main(String[] args) {
		// MyClass my = new MyClass();
		// MyClass my = MyClass.getInstance();
		// System.out.println(my);
		
		List list = new ArrayList();
		
		new MyThread(list).start();

		new MyThread(list).start();
		
		
		// somecode1....dealing list
		
	}
}
