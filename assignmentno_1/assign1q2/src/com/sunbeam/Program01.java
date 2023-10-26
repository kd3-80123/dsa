package com.sunbeam;

import java.util.Scanner;

public class Program01 {
	public static void main(String[] args) {
		
		Employee arr[]= new Employee[6];
		arr[0]= new  Employee(1, "saurabh", 5000.0);
		arr[1]= new  Employee(2, "sandesh", 5000.0);
		arr[2]= new  Employee(3, "mane", 7000.0);
		arr[3]= new  Employee(4, "program", 8000.0);
		arr[4]= new  Employee(5, "sunday", 4000.0);
		arr[5]= new  Employee(6, "ghule", 2000.0);
	System.out.println("Please enter the name of employee for search");
	Scanner sc= new Scanner(System.in);
	
	String name = sc.next();
	for (int i=0;i<arr.length;i++)
	{
		if (name.equals(arr[i].getName())) 
		{
			System.out.println("The name found at index "+ i);
			 
			break;
		}
		
			
	}
	
	
	System.out.println("........................................");
	System.out.println("Please enter the empid of employee for search");
	int empid = sc.nextInt();
	for (int i=0;i<arr.length;i++)
	{
		if (empid== arr[i].getEmpid()) 
		{
			System.out.println("The name found at index "+ i);
			
			
			break;
		}
		
	}
	
	System.out.println("........................................");
	System.out.println("Please enter the salary of employee for search");
	double salary = sc.nextDouble();
	for (int i=0;i<arr.length;i++)
	{
		if (salary== arr[i].getSalary()) 
		{
			System.out.println("The name found at index "+ i);
			break;
		}
		
	}
	
	System.out.println("........................................");
	sc.close();
	}

}
