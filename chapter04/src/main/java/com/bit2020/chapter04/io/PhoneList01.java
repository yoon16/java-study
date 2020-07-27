package com.bit2020.chapter04.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			File file = new File("phone.txt");
			
			if(!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("================파일정보=================");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(file.lastModified()));
	
			System.out.println("================전화번호=================");
		
			// 기반스트림(byte)
			FileInputStream fis = new FileInputStream(file);

			// 보조스트림1(byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			// 보조스트림2(라인단위 입력)
			br = new BufferedReader(isr);
			
			// 처리
			String line = null;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");
				int index = 0;
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					if(index == 0) {
						System.out.print(token + ":"); //이름
					} else if(index == 1) {
						System.out.print(token + "-"); //번호1
					} else if(index == 2) {
						System.out.print(token + "-"); //번호2
					} else {
						System.out.print(token); //번호3
					}
					
					index++;
				}
				
				System.out.println("");
			}
		} catch (IOException e) {
			System.out.println("에러:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
