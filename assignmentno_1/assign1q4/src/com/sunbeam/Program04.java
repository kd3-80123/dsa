package com.sunbeam;

import java.util.Scanner;

public class Program04 {
	public static int occurancereturn(int [] arr,int size, int key ,int occur)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(key==arr[i])
			{
				count ++;
			}
		}
		if(count!=occur)
		return -1;
		
		else
			return 0;
	}

	public static void main(String[] args) {
	
		int [] arr = {1,4,5,2,6,3,8,9,4,5,1,2,4,6,5,2,3,4,8,9};
		System.out.println("Please enter the occurance for key");
		int occur = new Scanner(System.in).nextInt();
		System.out.println("Please enter integer key to be found");
		int key = new Scanner(System.in).nextInt();
		
		int count = occurancereturn(arr, arr.length, key,occur);
		if(count==-1)
			System.out.println("key not found for that occurance");
		else
			System.out.println("Instance of occurnace found ");

	}

}
