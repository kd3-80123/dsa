package com.sunbeam;

public class Program07 {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(10);
		list.addFirst(30);
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(80);
		list.addFirst(60);
		System.out.println("Before reverse");
		list.display();
		list.reverseList();
		System.out.println("After reverse");
		list.display();
	}

}
