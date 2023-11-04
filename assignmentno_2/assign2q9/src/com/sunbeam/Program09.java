package com.sunbeam;

import java.util.Scanner;

public class Program09 {
	
	public static void PriorityOfOperator(String str)
	{
		switch (str) {
		case "()":
			System.out.println("Priority is 10");
			
			break;
		case "+":
			System.out.println("Priority is 9");
			
			break;
		case "-":
			System.out.println("Priority is 9");
			
			break;
		case "*":
			System.out.println("Priority is 10");
			
			break;
		case "/":
			System.out.println("Priority is 10");
			
			break;

		default:
			System.out.println("Wrong choice");
			break;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Please enter the operator");
		String str = new Scanner(System.in).next();
		PriorityOfOperator(str);

	}

}
