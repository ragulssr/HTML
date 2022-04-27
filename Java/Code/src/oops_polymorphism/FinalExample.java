package oops_polymorphism;

public class FinalExample {

	public static void main(String[] args) {

		// final variable -> can't change value
		// final method -> can't override
		// final class -> can't extend
		Parent p=new Parent();
		System.out.println(p.v);
		
		Child c=new Child();
		c.eat();
		
		String s="Rajesh";
		 
	}
}

class Parent {
	final int v=2;
	final public void Religion() {
		
	}
	public void eat() {
		
	}
	
}

class Child extends Parent{
	
	public void eat() {
		
	}

}