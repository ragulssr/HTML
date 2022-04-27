package basic;

public class ControlStmt {

	 public static void main(String[] args) {
	     // if, if-else, if else -ladder. nested if
		 //switch
		 
		 boolean condition = true;
		 if(condition) {
			 System.out.println("Got inside");
		 }
		 
		 int mark = 93;
		 if(mark>=50) {
			 System.out.println("Pass");
		 }else {
			 System.out.println("Fail");
		 }
		 
		 if(mark<0 && mark>100) {
			 System.out.println("Invalid mark");
		 }
		 if(mark>=60 && mark<70) {
			 System.out.println("E grade");
		 }else if(mark>=80 && mark<90) {
			 System.out.println("B grade");
		 }else if(mark>=70 && mark<80) {
			 System.out.println("C grade");
		 }else if(mark>=50 && mark<60) {
			 System.out.println("E grade");
		 }else if(mark>=90){
			 System.out.println("A grade");
			 if(mark==100) {
			 System.out.println("Topper");
			 }
		 }else {
			 System.out.println("No grade");
		 }
		 
		 
		 
	 }
}
