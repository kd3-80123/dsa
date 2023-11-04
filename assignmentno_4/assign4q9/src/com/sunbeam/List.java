package com.sunbeam;

public class List {
	class  Node{
		private int data;
		private Node next;
		
		public Node(int value)
		{
		
			data= value;
			next=null;
		}
	}
	private Node head;
	int count;
	
	public List()
	{
		head =null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	
	public int getMax(Node head) {
	    int max = 0;
	    while (head != null) {
	        if (head.data > max) {
	            max = head.data;
	        }
	        head = head.next;
	    }
	    return max;
	}
	public int getMax()
	{
		int data = getMax(head);
		return data;
	}
	public int getMin() {
		Node trav = head;
	    int min = 999;
	    while (trav != null) {
	        if (trav.data < min) {
	            min = trav.data;
	        }
	        trav = trav.next;
	    }
	    return min;
	}
	public void addFirst(int value)
	{
		Node nn = new Node(value);
		if(isEmpty())
		{
			head= nn;
		}
		else {
			nn.next=head;
			head= nn;
		}
	}
	public void display() 
	{
		if(isEmpty())
			System.out.println("list is empty");
		
		Node trav = head;
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav =trav.next;
		}
		System.out.println("");
	}

	
}
