package com.sunbeam;

public class Queue {
	LinkList rear;
	
	public Queue()
	{
		rear =null;
	}
	
	public void push(int data)
	{
		rear.addLast(data);
	}

	public void pop()
	{
		rear.delFirst();
	}
}
