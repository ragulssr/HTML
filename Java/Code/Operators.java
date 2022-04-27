package basic;

public class Operators {

	public static void main(String[] args) {
		
		//unary operator
		// ++,--
		int a=10;
		
		a++;  // post increment
		++a; // pre increment
		a--;
		
		int b = a++;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		// 12 , 11
		//12 + 12 + 13
		System.out.println(a+ ++b + ++a);
	}
}
