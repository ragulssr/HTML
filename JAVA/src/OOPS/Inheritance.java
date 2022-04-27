package OOPS;

public class Inheritance {//Single Inheritance
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}

class Animal {//Parent class
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {//Child class
	void bark() {
		System.out.println("barking...");
	}
}

