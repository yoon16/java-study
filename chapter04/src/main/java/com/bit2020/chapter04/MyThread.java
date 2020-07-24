package com.bit2020.chapter04;

import java.util.List;

public class MyThread extends Thread {
	List list = null;
	
	public MyThread(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		//somecode2.... dealing list
	}

}
