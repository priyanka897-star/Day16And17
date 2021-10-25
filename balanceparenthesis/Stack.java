package balanceparenthesis;

import java.util.List;

public class Stack<T> {
	         public static int top = 0;
		LinkedList<T> stack = new LinkedList<T>();
		

		
		public void push(T data) {

			stack.add(data);
			top++;

		}

		public void pop() {

			if (isEmpty()) {
				System.out.println("Stack is underflow");
			} else {
				stack.deleteAtEnd();
				top--;

			}

		}

		public T peek() {
			if (!isEmpty()) {
				T data;
				data = (T) stack.get(top);
				return data;
			}
			return null;

		}

		
		public boolean isEmpty() {

			return stack.isEmpty();
		}
		
		public void show() {
			
			stack.show();
		}

		public void showStackWithoutSpace() {
			stack.showListWithoutSpaces();
		}

		
		public String returnStackWithoutSpaces() {
			return stack.returnListInString();
		}

	
		public int size() {
			return top;
		}
   }

	
	
		