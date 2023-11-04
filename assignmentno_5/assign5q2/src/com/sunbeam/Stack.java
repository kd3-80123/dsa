package com.sunbeam;

public class Stack {
	LinkList top;
	
	public Stack()
	{
		top =null;
	}

	public void push(int value)
	{
		top.addFirst(value);
	}
	public void pop()
	{
		top.deleteLast();
	}
	public boolean isEmpty()
	{
		return top.isEmpty();
	}
}
