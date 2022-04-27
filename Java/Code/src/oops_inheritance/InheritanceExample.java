package oops_inheritance;

public class InheritanceExample {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "Senthil";
		s.id = 4545;

		Employee e = new Employee();
		e.name = "Rajesh";
		e.id = 5654;

		SeniorEmployee se = new SeniorEmployee();
		se.id = 5675;
		se.name = "Elango";
		se.designation = "SSE";
		se.salary = 67565;
		se.age = 35;
		Address ad = new Address();
		ad.doorNo = 4545;
		ad.buildingName = "SRK building";
		ad.streetName = "GK road";
		se.address = ad;
		
		System.out.println(se.name);
		System.out.println(se.address.buildingName+" "+se.address.streetName);

		// IS A
		// HAS A relationship

	}
}

class Address {
	int doorNo;
	String buildingName;
	String streetName;
	String city;
	String stateName;
	String pincode;
}

class Person { // base
	String name;
	int age;
	String fatherName;
	String phoneNum;
	Address address; // has a relationship // aggregation
}

class Student extends Person { // student -child class
	int id;
	String standard;
	float score;
	int rank;
}

class Employee extends Person { // employee- child class
	int id;
	float salary;
	String designation;
	float ratings;
	
}

class SeniorEmployee extends Employee {
	String petrolAllowance;
}

// java do not support
// multiple inheritance, hybrid in
