package datastructureproblems;

import java.util.Scanner;

public class FindYourNumber {
	public static void main(String[] args) {
		FindYourNumber findNumber = new FindYourNumber();
		// TODO Auto-generated method stub
		int n = Integer.parseInt("10");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		findNumber.yourNumber(range);

	}
	
	public  void yourNumber(int range) {
		Scanner scanner = new Scanner(System.in);
		int li = 0;
		int hi = range - 1;
		int mi = (li + hi) / 2;

		System.out.println();
		System.out.println("Think of a number in your mind between 0 to " + (range - 1));

		while (li < hi) {
			System.out.println("if your number is between " + li + " to " + mi + " Press 1 ");
			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

			int uservalue = scanner.nextInt();
			if (uservalue == 1) {

				hi = mi;
				mi = (li + hi) / 2;

			} else if (uservalue == 2) {
				li = mi + 1;
				mi = (li + hi) / 2;
			} else {
				System.out.println("Wrong input ");
			}
		}

		System.out.println("Your number is :" + mi);
		scanner.close();
	}
}
