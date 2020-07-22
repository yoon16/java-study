package com.bit2020.chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(200);
		
		Point point2 = new Point(50, 50);
		
		//drawPoint(point1);
		draw(point1);
		//drawPoint(point2);
		draw(point2);

		point1.show(false);
		
		System.out.println("//================================");

		Point point3 = new ColorPoint();
		point3.setX(30);
		point3.setY(100);
		((ColorPoint)point3).setColor("red");
		
		//drawPoint(point3);
		draw(point3);
		
		Point point4 = new ColorPoint(10, 20, "yellow");
		draw(point4);
		
		System.out.println("//================================");
		Rect rect = new Rect();
		//drawShape(rect);
		draw(rect);
		
		System.out.println("//================================");
		Triangle triangle = new Triangle();
		//drawShape(triangle);
		draw(triangle);

		System.out.println("//================================");
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);

		System.out.println("//================================");
		draw(new GraphicText("Hello"));
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawPoint(Point pt) {
//		//pt.show(true);
//		pt.show();
//	}
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
	
}
