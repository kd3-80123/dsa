package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		LinkListWithTail lt = new LinkListWithTail();
		lt.addFirst(14);
		lt.addFirst(15);
		lt.display();
		lt.addLast(16);
		lt.addLast(17);
		lt.display();
		lt.delFirst();
		lt.display();
		lt.delLast();
		lt.display();

	}

}
