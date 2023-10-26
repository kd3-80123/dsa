package com.sunbeam;

public class Program02_BinarySearch {

	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5,6,7,8,9};
		int key =6
				,x=0;
		int count=0;
		int left = 0,mid;
		int right = (arr.length-1);
		
		while(left<=right)
		{
		mid = (left+right)/2;
		if(arr[mid]==key)
		{
			System.out.println("Found the key");
			x=1;
			break;
		}
		
		else if(arr[mid]>key)
			right = mid-1;
		else 
			left = mid + 1;
		count++;
		}
		if(x==1)
		System.out.println("The no of comparisons done to search the key is"+ count);
		else
			System.out.println("The element not found");
		
		
		
	}

} 
