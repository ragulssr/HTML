package oops_polymorphism;

import java.util.Scanner;

public class DynamicBinding {

	public static void main(String[] args) {
		Animal a = new Animal();

		Scanner scan = new Scanner(System.in);
		System.out.println("1. Dog 2. Cat 3.Cow");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			a = new Dog();
			a.eat();
			break;
		}
		case 2: {
			a= new Cat();
			a.eat();
			break;
		}
		case 3: {
			a = new Cow();
			a.eat();
			break;
		}
		}

		/// 50 lines
		a.lifespan();

	}
}

class Animal {
	public void eat() { // blueprint

	}

	public void lifespan() {

	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("Eats biscuits..");
	}

	public void lifespan() {
		System.out.println("Lives for 12 years");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Eats milk/fish");
	}

	public void lifespan() {
		System.out.println("Lives for 8 years");
	}
}

class Cow extends Animal {
	public void eat() {
		System.out.println("Eats grass");
	}

	public void lifespan() {
		System.out.println("Lives for 15 years");
	}
}