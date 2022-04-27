package strings;

public class Strings {

	public static void main(String[] args) {

		 String s  ="abc"; // string pool
		 String s2 =new String("abc");// heap
		 String s3 = "abc";
		 String s4 =new String("abc");
		 char name[] = null;
		 String n = null;
	     System.out.println(s==s3);
	     System.out.println(s2==s4);// ref
		 System.out.println(s2.equals(s4)); // value 
	}
}
