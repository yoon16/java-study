package com.bit2020.chapter04.thread;

import java.util.ArrayList;
import java.util.List;

public class DigitThread extends Thread {
	List<Object> list = new ArrayList<>();
	
	public DigitThread(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			
			System.out.print(i);
			
			synchronized(list) {
				list.add(new Object());
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
