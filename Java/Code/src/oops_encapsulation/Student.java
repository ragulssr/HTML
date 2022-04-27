package oops_encapsulation;

public class Student {

	int id = 123; // default -> within package
	protected String name = "John"; // -> outside package (only for the subclass)
	private int age = 23; /// within class..
	public int mark = 78; /// access anywhere
	{//scope
		int x;
	}
	public void displayDetails() {
//		System.out.println(x);
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(mark);
	}
}
