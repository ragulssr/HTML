package basic;

import java.util.Scanner;

public class DataBinding { // ParentClass Reference = ChildClass Methods or Attributes

	public static void main(String[] args) {

		Bird b = new Bird();

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Select One");
		System.out.println("1.Peacock 2.Eagle 3.Dove");
		System.out.print(" Your is Option: ");
		int choice = scan.nextInt();

		switch (choice) {
		case 1: {
			b = new peacock();
			b.Eat();
			break;
		}
		case 2: {
			b = new Eagle();
			b.Eat();
			break;
		}
		case 3: {
			b = new Dove();
			b.Eat();
			break;
		}
		}
		// 50 lines Code below

		b.lifespan();// switch case selected class life-span displayed.

	}

}

class Bird {

	public void Eat() {

	}

	public void lifespan() {

	}
}

class peacock extends Bird {

	@Override
	public void Eat() {
		System.out.println("Seeds");
	}

	public void lifespan() {
		System.out.println("15 years");
	}
}

class Eagle extends Bird {
	@Override
	public void Eat() {
		System.out.println("Rabbit And Rats");
	}

	@Override
	public void lifespan() {
		System.out.println("20 years");
	}
}

class Dove extends Bird {
	@Override
	public void Eat() {
		System.out.println("Weeds sunflower");
	}

	@Override
	public void lifespan() {
		System.out.println("14 years");
	}
}
