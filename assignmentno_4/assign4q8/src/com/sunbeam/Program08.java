package com.sunbeam;

public class Program08 {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(10);
		list.addFirst(30);
		
		list.addFirst(50);
		list.addFirst(40);
		System.out.println(" after 40");
		list.display();
		list.addFirst(80);
		list.addFirst(60);
		System.out.println(" after 60");
		list.display();
		
		

	}

}
