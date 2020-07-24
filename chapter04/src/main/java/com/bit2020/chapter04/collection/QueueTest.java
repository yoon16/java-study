package com.bit2020.chapter04.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s);
		}
		
		// 비어 있는 경우, null를 리턴 
		System.out.println(q.poll());

		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		
	}

}
