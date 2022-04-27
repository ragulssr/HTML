
public class Functions {

	 // function or method
	
	
	 public static void main(String[] args) {
		System.out.println("Main method..");
		myFunction(); // function call
		int result = getArea(4);
		System.out.println("Result is "+result);
		System.out.println("Seat type: "+getType(45));
		System.out.println("Program ends.");
	 }
	 
	 // user defined function
	 public static void myFunction() { // implementation 
		 System.out.println("Its my method..");
	 }
	 
	 public static int getArea(int a) {
		 a =  a*a;
		 return a;
	 }
	 public static String getType(int age) {
		 if(age<=2) {
			 return "Infant";
		 }else if(age<=12) {
			 return "Kid";
		 }else if(age<=59) {
			 return "Adult";
		 }else {
			 return "Senior citizen";
		 }
	 }
	 
}
