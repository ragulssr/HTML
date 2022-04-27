package basic;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		System.out.println("Please enter your choice");
		System.out.println("1.Credit 2.Debit 3.Balance ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
            System.out.println("Amt creditted");
            break;
		}
		case 2: {
            System.out.println("Amt debitted..");
            break;
		}
		case 3: {
            System.out.println("Your balance is : 655");
            break;
		}
		default: {
			System.out.println("INvalid choice");
			break;
		}

		}
	}
}
