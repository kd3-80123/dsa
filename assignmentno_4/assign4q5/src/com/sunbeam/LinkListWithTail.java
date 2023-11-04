package com.sunbeam;

import com.sunbeam.LinkListWithTail.Node;

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
	public void reverseList()
	{
		
		Node t1= head;
		Node t2 = head.next;
		
		head.next= null;
		while(head!=null)
		{
			head = t2.next;
			t2.next = t1;
			t1= t2;
			t2 = head;
			
		}
		head = t1;
		
		
		
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
	public void addAfterPos(int data, int pos)
	{
		Node nn = new Node(data);
		if(pos==1)
			addFirst(data);
		
		Node trav = head;
		for(int i=1;trav.next!=null && i<pos; i++)
		{
			trav=trav.next;
		}
		nn.next = trav.next;
		trav.next = nn;
	}
	public void addBeforePos(int data, int pos)
	{
		Node nn = new Node(data);
		Node trav = head;
		for(int i=1;trav.next!=null && i<pos-1; i++)
		{
			trav=trav.next;
			System.out.println("done");
		}
		nn.next = trav.next;
		trav.next = nn;
	}
	//addFirst(), addLast(), delFirst(), delLast, display()

}

