package com.bit2020.chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(200);
		
		Point point2 = new Point(50, 50);
		
		drawPoint(point1);
		drawPoint(point2);
		
		point1.show(false);
	}

	public static void drawPoint(Point pt) {
		//pt.show(true);
		pt.show();
	}
}
