package basic;

import java.util.Scanner;

public class SampleTask {

	public static void main(String[] args) {
         System.out.print("Please enter the age:");
         Scanner scan=new Scanner(System.in);
         int age = scan.nextInt();
         
         if(age<=6) {
        	 System.out.println("Free Dinner");
         }
         else if(age>=7 && age<= 12) {
        	 System.out.println("50% Offer");
         }
         else if(age>=13 && age<=60) {
        	 System.out.println("5% Offer");
         }
         else if(age>60 && age<=100) {
        	 System.out.println("15% Offer");
         }
         else {
        	 System.out.println("Invalid Age");
         }
	}

}
