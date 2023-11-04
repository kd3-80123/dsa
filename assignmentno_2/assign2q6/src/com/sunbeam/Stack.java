package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		 top = SIZE-1;
		
	}
	
	public void push(int value)
	{
		top--;
		arr[top]= value;
		
	
		System.out.println(arr[top]);
		
	}
	public int pop()
	{
		if(isEmpty())
			System.out.println("List is empty");
		
		int data= arr[top];
		top++;
		
		return data;
			
	}
	
	public int peek()
	{
		if(isEmpty())
			System.out.println("List is empty");
		return arr[top];
	}
	public boolean isEmpty()
	{
		return top == SIZE;
	}
	
	public boolean isFull()
	{
		return top== 0;
	}
}
