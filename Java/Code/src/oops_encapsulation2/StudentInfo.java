package oops_encapsulation2;

import oops_encapsulation.Student;

public class StudentInfo {

	public void show() {
		Student s=new Student();
		//System.out.println(s.id);
		//System.out.println(s.name);
		//System.out.println(s.age);
		System.out.println(s.mark);
	}
}

class StudentInfor extends Student {
	public void displayDetails() {
//		System.out.println(x);
		//System.out.println(id);
		System.out.println(name);
		//System.out.println(age);
		System.out.println(mark);
	}
}
