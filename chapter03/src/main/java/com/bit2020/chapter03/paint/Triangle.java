package com.bit2020.chapter03.paint;

public class Triangle extends Shape{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;

	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	
}
