package com.bit2020.chapter03.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public void status() {
		System.out.println(
			"TV[power=" + power + 
			", channel=" + channel + 
			", volume=" + volume + 
			"]");
	}
}
