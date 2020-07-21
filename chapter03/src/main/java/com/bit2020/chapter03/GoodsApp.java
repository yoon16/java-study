package com.bit2020.chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(-100);
		camera.setCountSold(20);
		camera.setCountStock(30);
		
		Goods camera1 = new Goods();
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
		
		System.out.println(Goods.countofGoods);
	}

}
