package Array;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

		int Number[] = new int[5];
		System.out.println("Please enter the Numbers:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < Number.length; i++) {
			Number[i] = scan.nextInt();

		}
		for (int i = 0; i < Number.length; i++) { // number checking
			for (int j = i + 1; j < Number.length; j++) { // this for loop compared next value.
				if (Number[i] > Number[j]) { // checking smallest value.
					// swapping values
					int temp = Number[i];
					Number[i] = Number[j];
					Number[j] = temp;
				}
			}
		}
		System.out.println("Display");
		for (int i = 0; i < Number.length; i++) {
			
			System.out.println(Number[i]);
		}
	}

}

// bubble sort
//
//4 8 6 2 10 -> this array 
//2 8 6 4 10 -> swapped number
//2 4 6 8 10 -> next position same sorted value.
