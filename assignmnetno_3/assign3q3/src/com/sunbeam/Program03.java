package com.sunbeam;

public class Program03 {

	public static void main(String[] args) {
		Integer [] arr = {12,15,16,58,24,56,12,19,42};
		Stack st = new Stack(50);
		System.out.println(" before sorting");
		for(int i=0;i< arr.length;i++)
		{
			System.out.print("   "+arr[i]);
		}
		
		for(int i=0;i< arr.length;i++)
		{
			st.push(arr[i]);
			System.out.println("done ");
		}
		System.out.println(" After sorting");

		for(int i=0;i< arr.length;i++)
		{
			arr[i]=st.pop();
			System.out.print("   "+arr[i]);
		}

	}

}
