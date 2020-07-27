package com.bit2020.chapter04.thread;

import java.util.ArrayList;
import java.util.List;

public class AlphabetThread extends Thread {
	List<Object> list = new ArrayList<>();
	
	public AlphabetThread(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		for(char c = 'a'; c < 'z'; c++) {
			System.out.print(c);
			
			synchronized(list) {
				list.remove(new Object());
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
