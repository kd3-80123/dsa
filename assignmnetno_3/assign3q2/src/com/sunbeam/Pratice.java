package com.sunbeam;

import java.util.Stack;
import java.util.StringTokenizer;

 public class Pratice{
    public static int evaluate(String expression) {
        Stack stack = new Stack<>();
        String reversedExpression = new StringBuilder(expression).reverse().toString();
        StringTokenizer tokenizer = new StringTokenizer(reversedExpression);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (isOperand(token)) {
                int operand = Integer.parseInt(token);
                stack.push(operand);
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = evaluateExpression(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static boolean isOperand(String token) {
        return token.matches("\\d+");
    }

    private static int evaluateExpression(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public static void main(String[] args) {
		String str = "- + + 44 / * 55 63 97";
		
		int result =  evaluate(str);
		System.out.println(result);

	}

}