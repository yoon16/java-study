package prob02;

public class Book {
	
	private int stateCode = 1;  // 1: 재고있음, 0:대여중
	
	public void rent() {
		stateCode = 0;
	}
	
	public void print() {
		System.out.println("");
	}
}
