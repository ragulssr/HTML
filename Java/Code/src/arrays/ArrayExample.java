package arrays;

import oops_encapsulation.Student;

public class ArrayExample {

	public static void main(String[] args) {

		int mark[] = new int[5];
		int age[] = {44,100,12,56,32,90};
		mark[0] = 4;
		mark[1] = 45;
		mark[2] = 76;
		mark[3] = 89;
		mark[4] = 90;
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);
		}
		System.out.println("Age------------");
		int seniorAge = age[0]; //
		for (int i = 0; i < age.length; i++) {
			if(age[i]>seniorAge) {
				seniorAge = age[i];
			}
			System.out.println(age[i]);
		}
		System.out.println("Senior Age is "+seniorAge);
		
		
			
	}
}
