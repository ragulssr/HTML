package basic;

public class Operators1 {

	public static void main(String[] args) {
		
		//Arithmetic operator..
		int a=14;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// Relational operators
		System.out.println("Relational --");
		System.out.println(a<b);
		System.out.println(a==b); // == checks equality, = its assigning the value
		System.out.println(a!=b);
		
		System.out.println("Logical---");
		// Logical operator..
		// and gate, or gate
		// and -> 00 -> 0, 0 1-> 0 10-> 0  11->1
		// or -> 00->0, 10->1 ,01->1, 11->1
		System.out.println(a>b && a==b );
		System.out.println(a<b || a==b );
		
		//Assignment operators
		System.out.println("Assignment--");
		a = 3;
		//a = a + 10;
		a += 10;
		System.out.println(a);
		
		//
		System.out.println("Ternary operator..");
		int max = (a>b)?a:b;
		
		System.out.println(max);
		System.out.println(3>11?"Hello":"Hi"); // if else
	}
}
