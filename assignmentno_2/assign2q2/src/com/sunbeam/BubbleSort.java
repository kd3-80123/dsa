package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	
	public static int bubbleSort(int arr[])
	{
		int count=0,flag=0;
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i-1;j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					flag=1;
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1]= temp;
				}
				
				
			}
			if(flag==0)
				return count;
			
		}return count;
	}
	public static void main(String[] args) {
	
		//int arr[]= {11,55,56,42,58,47,59,60};
		int arr[]= {11,22,33,44,55,66,77};
		int count = bubbleSort(arr);
		System.out.println("Count of comparision "+count);
		System.out.println(Arrays.toString(arr));
	}

}
