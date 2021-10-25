package balanceparenthesis;

import java.util.Stack;

import java.util.Scanner;

public class BalanceParanthesis {
	
		public static void main(String[] args) {
			Stack<Character> stack = new Stack<Character>();
			String exp = "(()";
			boolean isBalanced = false;
			for (int i = 0; i < exp.length(); i++) {
				isBalanced=false;
				if (exp.charAt(i) == '(') {
					stack.push('(');
					System.out.print("Peek : "+stack.peek());
				} else if (exp.charAt(i) == ')') {
					if (!stack.isEmpty()) {
						stack.pop();
						isBalanced = true;
					}
					

				}
			}
			
			if (stack.isEmpty() && isBalanced) {
				System.out.println("\nExpression has not balanced Parenthesis");
			} else {
				
				System.out.println("\nExpression has balanced Parenthesis");
			}
		}
	}
