package com.sunbeam;

public class Program07 {
	public static void main(String[] args) {
		
		Queue q= new Queue(10);
		q.push(10);
		System.out.println(q.pop());
		q.push(200);
		q.push(20);
		System.out.println(q.pop());
		q.push(30);
		q.push(40);
		q.push(80);
		
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
	}

}
