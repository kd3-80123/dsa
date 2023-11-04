package com.sunbeam;

import java.util.Stack;
import java.util.StringTokenizer;

public class PrefixEva {
	public static int calculate(int num1, char opr, int num2)
	{
		
		switch (opr) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;	
		case '*': return num1 * num2;
		case '/': return num1 / num2;
		case '%': return num1 % num2;
		case '$' :return (int)Math.pow(num1, num2);
		
		}
		return 0;
	}
	public static boolean isNumber(String str)
	{
		for(char ch : str.toCharArray())
		{
			if(Character.isDigit(ch))
				return true;
			
		}
		return false;
	}
	
	public static int preFixEval(String str)
	{
		Stack st = new Stack(20);
//		String str1 = "";
//		   for(int i=0;i<str.length();i++)
//		   {
//			   char ch = str.charAt(i);
//			   str1 = ch+str1;
//			   System.out.println(str1);
//		   }
		String str2 = new StringBuilder(str).reverse().toString();
		StringTokenizer ele = new StringTokenizer(str2," ");
		
		while(ele.hasMoreTokens())
		{
			String s = ele.nextToken();
			if(isNumber(s))
				st.push(Integer.parseInt(s));
			else
			{
				 int opt1= st.pop();
				 int opt2 = st.pop();
				 int result = calculate(opt1, s.charAt(0), opt2);
				 st.push(result);
			}
			
		}
		if(!st.isEmpty())
			return st.pop();
		
		return 0;
		
	}
	public static void main(String[] args) {
		String str = "- + + 44 / * 55 63 97";
		
		int result =  preFixEval(str);
		System.out.println(result);

	}

}
