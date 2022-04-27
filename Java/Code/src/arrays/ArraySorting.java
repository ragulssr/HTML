package arrays;

import java.util.Scanner;

public class ArraySorting {
  
	public static void main(String[] args) {
		
		int numbers[] =new int[5];
		
		System.out.println("Please enter numbers");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = scan.nextInt();
		}
		// bubble sort
		// 4,2,7,6,1
		// 2,4,7,6,1
		// 1,4,7,6,2 -> oth smallest assigned
		// 1,2,7,6,4 -> 1st ...
		
		for(int i=0;i<numbers.length;i++) {
			 
			 for(int j=i+1;j<numbers.length;j++) {
				 
				    if(numbers[i]>numbers[j]) {
				    	// swapping...
				    	int temp = numbers[i];
				    	numbers[i] = numbers[j];
				    	numbers[j] = temp;
				    	
				    }
			 }
		}
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}
