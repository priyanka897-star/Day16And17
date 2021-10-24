package datastructureproblems;

import java.util.Scanner;

public class InsertionSort {
	/*Function to sort array using insertion sort*/
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 

			/* Move elements of arr[0..i-1], that are 
			greater than key, to one position ahead 
			of their current position */
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 
	
	/* A utility function to print array of size n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			//System.out.print(arr[i] + " ");
			System.out.print(String.valueOf(arr[i])+" ");

		System.out.println(); 
	} 
	
	public static void main(String args[]) 
	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers of Elements Do u Wnat to Insert? : ");
		int elements =scanner.nextInt();
		System.out.println("TOtal SIze = " +elements);
		String str[] = new String[elements]; // Total number of words/elements to be taken as input in the string array
		System.out.println("Entre Numbers To Sort: ");
		int arr[] = new int[elements];
		/**
		 * Loop is to take all the elements in the String array
		 */
		for(int i = 0; i < elements; i++)
		{
			str[i] =scanner.next();
			arr[i] = Integer.parseInt(str[i]);
			
		}

		InsertionSort insertionSort = new InsertionSort(); 
	     insertionSort.sort(arr); //Instantiation of InsertionFInal class to use the reference to call the sort Method

		printArray(arr); 
	} 
}



