package com.sunbeam;

public class LinkListWithTail {
	public class Node{
		private int data;
		private Node next;
		public Node(int value)
		{
			data = value;
			next =null;
		}

	}
	private Node head;
	private Node tail;
	
	public LinkListWithTail()
	{
		head = null;
		tail= null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int data)

	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			head= newnode;
			tail=newnode;
		}
		else 
		{
			newnode.next = head;
			head = newnode;
		}
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("List is empty");
		
			Node trav =head;
		while(trav!=null)
		{
			System.out.println(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			head= newnode;
			tail= newnode;
		}
		
		else {
			
		tail.next = newnode;
		tail = newnode;
		}
		
	}
	public void delFirst()
	{
		if(isEmpty())
			System.out.println("The list is empty");
		else
		{
			head = head.next;
		}
	}
	public void delLast()
	{
		if(isEmpty())
		{
			System.out.println("The list is empty");
		}
		else
		{
			Node trav = head;
			while( trav.next.next!=null)
				trav = trav.next;
			trav.next=null;
			tail = trav.next;
				
		}
	}
	//addFirst(), addLast(), delFirst(), delLast, display()

}