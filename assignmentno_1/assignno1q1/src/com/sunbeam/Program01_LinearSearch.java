package com.sunbeam;

public class Program01_LinearSearch {
	
	
	
	public static void main(String[] args) {
		
		
	
		int [] arr = {1,3,6,4,7,9,10};
		int key = 4,x=0;
		int count = 1;
		
		
		for(int i=0;i< arr.length;i++ )
		{
			if(key==arr[i]) {
				System.out.println("Key found");
				x=1;
			break;
			}
			else if(key!=arr[i])
				count++;
			else
				System.out.println("key not found");
		}
		if(x==1)
		System.out.println("Linear search no of comparisions done to search a key is "+count);
		else 
			System.out.println("key not found");
}
	
}
