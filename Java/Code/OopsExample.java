package oops;

//driver class
public class OopsExample {

	public static void main(String[] args) {

		// new
		Student s1 = new Student();// object..
		//s1 reference
		
		s1.age = 12;
		s1.name ="Sathish";
		s1.id = 454545;
		s1.avgScore = 4545.0f;
		s1.displayDetails();
		
		Student s2=new Student();
		Student s3=new Student();
		
		Bike b=new Bike();
		b.engineCap =45;
		b.startEngine();
		
	}
}
class Student {
	
	int id;
	String name;
	String standard;
	float avgScore;
	int age;
	
	public void writeExam() {
		System.out.println("Writing exam..");
	}
	public void displayDetails() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
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
