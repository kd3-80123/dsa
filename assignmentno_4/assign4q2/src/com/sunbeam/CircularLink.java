package com.sunbeam;

public class CircularLink {

	 public class Node{
		 private char ch;
		 private Node next;
		 public Node(char data)
		 {
			 ch= data;
			 next = null;
			 
		 }
		
		
	}
	 private Node tail;
	 
	 public CircularLink()
	 {
		 this.tail = null;
	 }
	 
	 public boolean isEmpty()
	 {
		 return tail == null;
	 }
	 
	 public void addFirst(char data)
	 {
		 Node newnode = new Node(data);
		 if(isEmpty())
		 {
			 tail = newnode;
			 newnode.next = tail; 
		 }
		 else
		 {
			newnode.next = tail.next;
//			
			tail.next = newnode;
			
		 }
	 }
	 public void display()
	 {
		 if(isEmpty()) {
			 System.out.println("The list is empty");
		 return;
		 }
		 
		 Node trav = tail;
			 do {
				 trav = trav.next;
				 System.out.print(" "+ trav.ch);
				 
				 
				 
			 }while(trav !=tail);
		 System.out.println("");
	 }
	 public void addlast(char value)
	 {
		 Node nn = new Node(value);
		 nn.next = tail.next;
		 tail.next = nn;
		 tail=nn;
		 
		 
	 }
	 
}