package oops_encapsulation;

public class ReadOnlyExample {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println(e.getEmpID());
	}
}

class Employee {  // model class, pojo ( plan old java object)
	private int empID=4423;
	private String name;
	private String designation = "SSE";
	private float salary = 22342.0f;
	private String phone ;
	public int getEmpID() {
		return empID;
	}
	private void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	private void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	private void setSalary(float salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
    
}