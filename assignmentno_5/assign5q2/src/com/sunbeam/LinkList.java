package com.sunbeam;



public class LinkList {
 public class Node
 {
	 private int data;
	 private Node next;
	 private Node prev;
	 
	 public Node(int value)
	 {
		 data = value;
		 next = null; prev =null;
	 }
 }
 private Node head;
 int count;
 
 public LinkList()
 {
	 head = null;
 }
 public boolean isEmpty()
 {
	 return head == null;
 }
 
 public void addFirst(int value)
 {
	 Node nn = new Node(value);
	 if(isEmpty())
	 {
		 head = nn;
		 head.next=nn;
		 head.prev=nn;
	 }
	 else
	 {
		 nn.next = head;
		 nn.prev = head.prev;
		 head.prev.next = nn;
		 head.prev=nn;
		 head =nn;
		 
	 }
	 count++;
 
}

 public void display()
 {
	 if(isEmpty())
		 return;
	 Node trav = head;
	 
	
	 do {
		 System.out.print(" "+trav.data);
		 trav = trav.next;
		 
	 }while(trav!=head);
	 System.out.println("");
	 
 }
 
 public void addPos(int value,int pos)
 {
	 if(pos<1||pos>count+1)
		 return;
	 Node nn = new Node(value);
	 if(isEmpty())
	 {
		 head= nn;
		 head.next=nn;
		 head.prev=nn;
	 }
	 		
	
	 else if(pos==1)
	 {
		 addFirst(value);
		 return;
	 }
	 else
	 {
	 Node trav = head;
	 for(int i=1;i<pos-1;i++)
	 
		 trav = trav.next;
	 
	 nn.next= trav.next;
	 nn.prev = trav.next.prev;
	 if (trav.next != null) 
         trav.next.prev = nn;
	trav.next = nn;
	// trav.next.prev = nn;
	 }
	 count++;
 }
 public void delFirst()
 {
	 if(isEmpty())
	 {
		 System.out.println(" List is empty");
	 }
	 else if(head.next==head)
	 head =null;
	 else
	 {	
		head.prev.next= head.next;
		head.next.prev=head.prev;
		head = head.next;
		 
	 }
	 count--;
 }
 
 public void deletePos(int pos)
 {
	 if(pos<1||pos>count) {
		 System.out.println("Invalid Position ");
		 return;
	 }
	 if(isEmpty())
		 System.out.println("The list is empty");
	 
	 else if(head.next == head)
		 head = null;
	 
	 else if(pos==1)
	 {
		delFirst();
		return;
	 }
	 else
	 {
		 Node trav = head;
		 for(int i=1;i<pos;i++)
			 trav =trav.next;
		 
		 trav.prev.next = trav.next;
		 trav.next.prev = trav.prev;
		if(trav==head)
			 head=trav.next;
 
	 }
	 count--;
 }
	public void deleteLast() {
		 
		if(isEmpty())
			return;
		 
		else if(head.next == head)
			head = null;
	 
		else {
			 
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	public void addLast(int value) {
		 
		Node nn = new Node(value);
		 
		if(isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		}
		 
		else {
		 
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
		}
	}
 
}