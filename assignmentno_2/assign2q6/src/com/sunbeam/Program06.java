package com.sunbeam;

public class Program06 {

	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		int data = s.peek();
		System.out.println(data);
		data = s.pop();
		System.out.println(data);
		

	}

}
