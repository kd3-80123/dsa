package com.sunbeam;

public class Pogram09 {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(10);
		list.addFirst(30);
		
		list.addFirst(7);
		list.addFirst(40);
		System.out.println(" after 40");
		
		list.addFirst(80);
		list.addFirst(60);
		System.out.println(" after 60");
		list.display();
		int Big =list.getMax();
		System.out.println("\n Max number is "+ Big);
		int min =list.getMin();
		System.out.println("Min number is"+min);
		

	}

}
