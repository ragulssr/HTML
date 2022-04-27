package oops_abstraction;

import java.util.Scanner;

public class AbstractionExample {

	// abstract keyword -> abstract class -> 0-100%
	// interface -> 100%
	public static void main(String[] args) {
		Animal a = null;

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
			a = new Cat();
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

	// Showing What, hiding How.
}

interface IHeartLisener { // 100%
	// by default all methods in interface public , abstract
	public abstract void pump();
	void getHeartRatePerMin();
	int chamber = 4;
}

interface ITailInfo {
	void tailType();
	void tailLength();
}

abstract class Animal implements IHeartLisener, ITailInfo {

	public void birth() { // normal/concrete method
		System.out.println("Born");
	}

	public void death() {
		System.out.println("Died..");
	}

	abstract public void eat(); // abstract method // method declaration

	abstract public void lifespan();

	@Override
	public void pump() {
		System.out.println("Pumps the blood Has "+chamber+ "chambers..");
	}
}

class Dog extends Animal {

	public void eat() { // implement mandatory..
		System.out.println("Eats biscuits..");
	}

	public void lifespan() {
		System.out.println("Lives for 12 years");
	}

	@Override
	public void getHeartRatePerMin() {

	}

	@Override
	public void tailType() {
		
	}

	@Override
	public void tailLength() {
		
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Eats milk/fish");
	}

	public void lifespan() {
		System.out.println("Lives for 8 years");
	}

	@Override
	public void getHeartRatePerMin() {

	}

	@Override
	public void tailType() {
		
	}

	@Override
	public void tailLength() {
		
	}
}

class Cow extends Animal {
	public void eat() {
		System.out.println("Eats grass");
	}

	public void lifespan() {
		System.out.println("Lives for 15 years");
	}

	@Override
	public void getHeartRatePerMin() {

	}

	@Override
	public void tailType() {
		
	}

	@Override
	public void tailLength() {
		
	}
}