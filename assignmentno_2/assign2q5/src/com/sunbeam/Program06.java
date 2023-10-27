package com.sunbeam;

import java.util.Arrays;

public class Program06 {
	public static int employeeSalarySort(Employee arr[])
	{
		int count=0;
		for(int i=1;i<arr.length;i++)
		{
			Employee temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j].getSalary()>temp.getSalary())
			{
				arr[j+1]= arr[j];
				count ++;
				j--;
			}
			arr[j+1]= temp;
		}
		
		return count ;
	}

	public static void main(String[] args) {
		Employee arr[]= new Employee[6];
		arr[0]= new  Employee(1, "saurabh", 5000.0);
		arr[1]= new  Employee(2, "sandesh", 5000.0);
		arr[2]= new  Employee(5, "mane", 7000.0);
		arr[3]= new  Employee(3, "program", 8000.0);
		arr[4]= new  Employee(4, "sunday", 4000.0);
		arr[5]= new  Employee(6, "ghule", 2000.0);
		int count = employeeSalarySort(arr);
		System.out.println("The count of comparison"+count);
		for (Employee employee : arr) {
				System.out.println(employee);
		}
		
	}

}
