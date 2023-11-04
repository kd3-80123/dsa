package com.sunbeam;

public class Queue {
	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;
	int count=0;
	
	public Queue(int size)
	{
		SIZE =size;
		arr = new int[SIZE];
		rear = front =-1;
		
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	public boolean isFull()
	{
		return count==SIZE;
	}
	
	public void push(int value)
	{
		rear = (rear + 1)% SIZE;
		arr[rear]= value;
		count++;
	}
	
	public void pop()
	{
		if(isEmpty()) 
			System.out.println("The list is empty");
		
		front = (front + 1)% SIZE;
	
		if(front == rear)
			front = rear =-1;
		count--;
		
		
			
	}
	public int peek()
	{
		return arr[(front + 1) % SIZE];
	}
	

}
