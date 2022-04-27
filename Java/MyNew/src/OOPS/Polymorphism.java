package OOPS;


// overloading :- same method but different arguments
// Overriding  :- child class inherit parent class method and modify the method.
public class Polymorphism {

	public static void main(String[] args) {
				
		Employee e1 = new Employee();
		e1.salary(001);
		e1.salary();
		e1.salary("Apr");
		e1.salary(20000.00);
		senior s1 = new senior();
		s1.position();
	}

}
class Employee{
	public void position() {
		System.out.println("Employee");
	}
	public void salary(){
		System.out.print("Your Salary Creadited... ");
	}
	public void salary(String Month) {// OverLoading
		System.out.print("This "+Month+" Month Salary.");
	}
	public void salary(Double amt) {// O.L
		System.out.println(" Your salary is ="+amt);
	}
	public void salary(int empId) {// O.L
		switch (empId) {
		case 001: {
			System.out.print("Hello XXX ");
			break;
		}
		case 002: {
			System.out.print("Hello YYY ");
			break;
		}
		default:
			System.out.print("Invalid EMPID ");
			salary();
		}
	}
}

class senior extends Employee{
	@Override
	public void salary() {  // OverRiding
		super.salary();// super is parent class attributes called or used.
	}
	@Override
	public void position() {
		System.out.print("Senior ");
		super.position();
	}
}