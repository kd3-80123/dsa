package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Program03 {
	public void findByName()
	{
		
	}

	public static void main(String[] args) {
		Employee arr[]= new Employee[6];
		arr[0]= new  Employee(1, "saurabh", 5000.0);
		arr[1]= new  Employee(2, "sandesh", 5000.0);
		arr[2]= new  Employee(5, "mane", 7000.0);
		arr[3]= new  Employee(3, "program", 8000.0);
		arr[4]= new  Employee(4, "sunday", 4000.0);
		arr[5]= new  Employee(6, "ghule", 2000.0);
		
		Scanner sc= new Scanner(System.in);
		
		
		Arrays.sort(arr, (x,y) -> -(x.getEmpid()-y.getEmpid()));
		for (Employee employee : arr) {
			System.out.println(employee);
		}
		System.out.println("Please enter the name of employee to search");
		String name = sc.next();
		Employee e = new Employee(0, name, 0);
		e.setName(name);
		
		int left =0,right = arr.length-1,mid=0;
		
		for(int i =0 ;i<arr.length;i++)
		{
			mid = (left+right)/2;
			if(e.getName().equals(arr[mid].getName()))
			{
				System.out.println("Employee found at "+mid);
				break;
			}
			else if(e.getName().equals(arr[mid].getName()))
				left = mid+1;
			else
				right = mid -1;
				
				
		}
		System.out.println("Please enter the id of employee to search");
		int id = sc.nextInt();
		  e = new Employee(id, "", 0);
		e.setEmpid(id);
		int left1 =0,right1 = arr.length-1,mid1=0;
		
		
		for(int i =0 ;i<arr.length;i++)
		{
			mid = (left+right)/2;
			if((Double.compare(e.getEmpid(), arr[mid].getEmpid()))==1)
			{
				System.out.println("Employee found at "+mid);
				break;
			}
			else if(e.getEmpid()>arr[mid].getEmpid())
				left = mid +1;
			else
				right = mid-1;
				
				
		}
		System.out.println("Please enter the salary of employee to search");
		double salary  = sc.nextInt();
		  e = new Employee(0, "", salary);
		e.setSalary(salary);
		int left2 =0,right2 = arr.length-1,mid2=0;
		
		
		for(int i =0 ;i<arr.length;i++)
		{
			mid = (left+right)/2;
			if(e.getSalary()==arr[mid].getSalary())
			{
				System.out.println("Employee found at "+mid);
				break;
			}
			else if(e.getSalary()  > arr[mid].getSalary())
				left = mid +1;
			else
				right = mid-1;
				
				
		}
		
		

	}

}
