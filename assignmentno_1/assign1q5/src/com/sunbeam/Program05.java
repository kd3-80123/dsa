package com.sunbeam;

public class Program05 {

	public static void main(String[] args) {
		int [] arr= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			for (int j =1;j < arr.length;j++) {
			    if (arr[i]!=arr[j])
			   {
			    	count = arr[i];
			    	break;
			   }
			}
		}
		
		System.out.println(count);
	}

}
