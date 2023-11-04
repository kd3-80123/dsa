package com.sunbeam;

public class List {
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data = value;
			next = null;
			
		}
		
	} 
	private Node head;
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node nn = new Node(value);
		if(isEmpty())
			head=nn;
		else 
		{
			nn.next= head;
			head = nn;
			
		}
		
	}

	public void findMiddle()
	{
		Node f = head;
		Node s = head;
		while(f!=null && f.next!=null)
		{
			f= f.next.next;
			s=s.next;
			
		}
		System.out.println("Middle element is "+s.data);
	}
}
