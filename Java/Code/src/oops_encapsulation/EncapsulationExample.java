package oops_encapsulation;

import java.io.File;
import java.net.HttpURLConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import loops.NumberSum;
import loops.Pattern;

public class EncapsulationExample {

	public static void main(String[] args) {

		Connection c;
		HttpURLConnection http;
		File fp;
		Scanner scan;
		ArrayList al;
		/// package, access modifiers
		Pattern p;
		NumberSum s;
		String name;

		Student stu = new Student();
		stu.displayDetails();
		
		/*           same class   same package    outside package(subclass)   ouside package (nonsub)
		 *   pr         Y              N                  N                        N
		 *   de         Y              Y                  N                        N
		 *   pro        Y              Y                  Y                        N
		 *   pub        Y              Y                  Y                        Y
		 *
		 * 
		 * 
		 */
	}
}

