package oops_polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {

		System.out.println(5 + 4); // addition
		System.out.println("5" + "4"); // append /concat

		Student s = new Student();
		s.writeExam(125);
		
		SeniorStudent s2 = new SeniorStudent();
		s2.writeExam(125);
		s2.writeExam();
	}
}

// overloading:- in a class, two methods with same name and different arguments
// overriding:-  when child class inherit parent class method and modify the method 

class Student {

	public void writeExam(int examCode) {
		switch (examCode) {
		case 123: {
			System.out.println("Student is writing DS exam..");
			break;
		}
		case 125: {
			System.out.println("Student is writing DSP exam..");
			break;
		}
		default: {
			writeExam();
		  }
		}
	}

	public void writeExam(int examCode, int level) {

	}

	public void writeExam() {
		System.out.println("Student is writing exam..");
	}

	// overloading..
	public void writeExam(String subject) {
		System.out.println("Student is writing " + subject + " exam..");
	}
}

class SeniorStudent extends Student {

	
	public void writeExam() {
		System.out.print("Senior ");
		super.writeExam();
	}
	
	@Override
	public void writeExam(int examCode) {
		switch (examCode) {
		case 123: {
			System.out.println("Student is writing AWS exam..");
			break;
		}
		case 125: {
			System.out.println("Student is writing JS exam..");
			break;
		}
		default: {
			writeExam();
		  }
		}
	}
	
}







