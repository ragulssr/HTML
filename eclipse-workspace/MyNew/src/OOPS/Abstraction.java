package OOPS;

public class Abstraction {
	public static void main(String[] args) {

//		Person  p = new Person(); Can not create Object For Abstraction Class.
//		Person p = null; // Reference allowed.
//		p.College();
	}

}

// Abstract :- 0-100% abstract
// Interface:- 100%   abstract
interface Life {
// By Default all methods in interface public and abstract
	void Happy();

	void Sad();

	// void end() {} // not allowed body
}

class OfRam implements Life{ // interface inherit used for implements keyword

	@Override
	public void Happy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sad() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Person { // Abstraction :- showing what ,hiding how..

	public void School() {
		System.out.println("Joined School");
	}

	public void College() {
		System.out.println("Joined College");
	}

	abstract public void Marriage(); // Abstraction Method.

	abstract public void Death();
}

class An extends Person { // In Abstraction Methods are Mandatory for the child's class.

	@Override
	public void Marriage() {

	}

	@Override
	public void Death() {

	}

	@Override
	public void School() {
		super.School();
	}

}