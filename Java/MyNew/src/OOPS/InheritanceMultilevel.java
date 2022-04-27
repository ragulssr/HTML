package OOPS;

public class InheritanceMultilevel {

	public static void main(String[] args) {//MultiLevel
		CatType c = new CatType();
		c.bark();
		c.eat();
		c.fish();
	}

}

class AnimalType {//Parent Class
	void eat() {
		System.out.println("eating...");
	}
}

class DogType extends AnimalType {//Animal-Child Class
	void bark() {
		System.out.println("barking...");
	}
}

class CatType extends DogType{ // Dog-Child Class
	void fish() {
		System.out.println("Fishing...");
	}
}