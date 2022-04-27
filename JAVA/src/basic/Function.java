package basic;

public class Function {
	public static void main(String[] args) {
		System.out.println("Start");
		myFun();
		int result = g(4);
		System.out.println("Area is " + result);
		System.out.println("Person is  " + age(12));
	}

	public static void myFun() {
		System.out.println("My_World");
	}

	public static int g(int a) {
		a = a * a;
		return a;
	}

	public static String age(int age) {
		if (age <= 5) {
			return "Kid school";
		} else if (age <= 15) {
			return "SSlc";
		} else {
			return "College || VIP || Employee";
		}
	}
}
