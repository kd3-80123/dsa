package com.sunbeam;

public class Program03 {
	public static void main(String[] args) {
		Deque deque = new Deque();
	    deque.addFirst(5);
	    deque.addLast(3);
	    deque.addFirst(7);
	    deque.addLast(1);
	    deque.addFirst(9);
	    System.out.println(deque.removeFirst());
	    System.out.println(deque.removeLast());
		
	}
	  
}
