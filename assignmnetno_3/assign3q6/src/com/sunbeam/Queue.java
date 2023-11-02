package com.sunbeam;

public class Queue {
	private final int SIZE;
Stack st ;
private int rear,front;

	public Queue(int size)
	{
		SIZE = size;
		st = new Stack(SIZE);
		rear = front =-1;
	}

}
