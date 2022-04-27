package OOPS;

public class Class {

	public static void main(String[] args) {
		// new
		Student s1 = new Student();// Object
		// s1 reference
		s1.id = 12;
		s1.Name = "Ragul";
		s1.display();
		bike b1 = new bike();
		b1.engineStart();
	}

	public static void forName(String string) {
		// TODO Auto-generated method stub
		
	}
}

class Student {
	int id, age;
	String Name, CollegeName;
	float score;

	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + Name);
	}
}
