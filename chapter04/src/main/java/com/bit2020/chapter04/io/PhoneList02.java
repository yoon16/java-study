package com.bit2020.chapter04.io;

import java.io.File;
import java.
public class PhoneList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("phone.txt");
		
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		
	}

}
