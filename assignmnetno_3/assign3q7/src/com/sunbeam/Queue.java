package com.sunbeam;

public class Queue {
	Stack st;
	Stack st1;
	
	private final int SIZE;
	int count=0;
	
	public Queue(int size)
	{
		SIZE =size;
		st = new Stack(size);
		st1 = new Stack(size);
		
		
	}
	public boolean isEmpty()
	{
		return st1.isEmpty();
	}
	public boolean isFull()
	{
		return st1.isFull();
	}
	
	public void push(int value)
	{
		while (!st.isEmpty())
        { 
            st1.push(st.pop()); 
           
        } 
 
      
        st.push(value); 
 
         
        while (!st1.isEmpty()) 
        { 
            st.push(st1.pop()); 
           
        } 
	}
	
	public int pop()
	{
		 if (st.isEmpty()) 
	        { 
	            return -1;
	        } 
	 
	        
	        int value = st.peek(); 
	        st.pop(); 
	        return value; 
	}
	public int peek()
	{
		return st1.peek();
	}
	

}