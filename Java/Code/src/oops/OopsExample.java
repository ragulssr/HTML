package oops;

//driver class
public class OopsExample {

	public static void main(String[] args) {

		// new
		
		
		Student s1 = new Student(125,"Sathish");// object..
		//s1 reference
	    Student.schoolName ="SRK school";
		s1.age = 12;
		s1.avgScore = 4545.0f;
		s1.displayDetails();
		
		Student s2=new Student(123,"Arun",18);
		Student s3=new Student(342,"Ragu");
		
		s2.displayDetails();
		s3.displayDetails();
//		
//		Student nextStudent = compareStudent(new Student(1234,"akshay"), 
//				new Student(5678,"Senthil"));
//		System.out.println("Next student "+nextStudent.name);
		
		Bike b=new Bike();
		b.engineCap =45;
		//b.startEngine();
		
	}
	public static Student compareStudent(Student s1,Student s2) {
		if(s1.id<s2.id) {
			return s1;
		}else {
			return s2;
		}
	}
}
class Student {
	
	int id; // instance variable
	String name;
	String standard;
	float avgScore;
	int age;
	static String schoolName; //static variable
	
	public Student(int id,String name) { // constructor
		this.id = id; // local variable
		this.name = name;
		System.out.println("Constructor:- Student object has been created..");
	    //display(this);
	}
	public Student(int _id,String _name,int _age) { // constructor overloading..
		id = _id;
		name = _name;
		age = _age;
		System.out.println("Constructor:- Student object has been created..");
	}
	public void writeExam() {
		System.out.println("Writing exam..");
	}
	public void displayDetails() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age  :"+age);
		System.out.println("Score : "+avgScore);
		System.out.println("School : "+schoolName);
	}
//	public void display(Student s) {
//		System.out.println("Id : "+s.id);
//		System.out.println("Name : "+s.name);
//		System.out.println("Age  :"+s.age);
//		System.out.println("Score : "+s.avgScore);
//		System.out.println("School : "+s.schoolName);
//	}
}
class Fruit {
	
	String color;
	float price;
	float weight;
	public void peelSkin() {
		
	}
	public void makeJuice() {
		
	}
}
class Car {
	float price;
	String make;
	String model;
	int tankCap;
	int engineCap;
	 public void startEngine() {
		  
	  }
	  public void offEngine() {
		  
	  }
	  public void indicatorOn() {
		  
	  }
	  public void applyBreak() {
		  
	  }
	  public void openDoor() {
		  
	  }
}
