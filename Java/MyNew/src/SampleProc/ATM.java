package SampleProc;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		int balance = 1000000, withdraw, deposit, pin;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please Enter Pin : ");
			pin = scanner.nextInt();
			if (pin == 1234) {
				while (true) {
					System.out.println("ATM MAchine");
					System.out.println("1.WithDraw  2.Deposit  3.Balance_Check   4.Exit");
					System.out.print("Please Choose Any One :");

					int Choice = scanner.nextInt();
					switch (Choice) {
					case 1: {
						System.out.print("Enter the Money : ");
						withdraw = scanner.nextInt();
						if (withdraw <= 49000) {
							if (balance >= withdraw) {
								balance = balance - withdraw;
								System.out.println("Please Collect Your Money...");
							} else {
								System.out.println("Insufficient Balance");
							}
						} else {
							System.out.print("Out of Limit");
						}
						System.out.println("");
						break;
					}
					case 2: {
						System.out.print("Enter the money to be deposit : ");
						deposit = scanner.nextInt();
						balance = balance + deposit;
						System.out.println("Your money has been Sucessfully Desposited..");
						System.out.println("");
						break;
					}
					case 3: {
						System.out.println("Balance : " + balance);
						System.out.println("");
						break;
					}
					case 4: {
						System.exit(Choice);
					}

					}
				}
			} else {
				System.out.print("Incorrect pin..");
			}
		} catch (Exception e) {
			System.out.println("Server Issue...");
		}

	}

}
