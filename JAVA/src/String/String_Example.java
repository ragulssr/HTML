package String;

public class String_Example {
	public static void main(String[] args) {
		
		String s1 = "Abc"; // string pool
		String s2 = new String("cba"); // heap
		String s3 = "Abc";
		String s4 = new String("cba");
		System.out.println(s1==s3);// compared reference
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4)); // Compared values.
	}

}
