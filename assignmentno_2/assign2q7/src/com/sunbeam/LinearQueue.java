package com.sunbeam;

public class LinearQueue {
	private int arr[];
	private int rear,front;
	private final int SIZE;
	
	public LinearQueue(int size) {
		this.SIZE=size;
		this.arr = new int[SIZE];
		this.rear = 0;
		this.front = 0;
	}
	
	public void push(int data)
	{
		
		arr[rear] = data;
		rear++;
		
	}
	public void pop()
	{
		front++;
	}
	public int peek()
	{
		return arr[front];
	}
	public boolean isFull()
	{
		return rear==SIZE;
	}
	public boolean isEmpty()
	{
		return front==rear;
	}

}//end of class
