package arrays;

public class Array2d {

	public static void main(String[] args) {

		String name[][] = { { "Rajesh", "Shankar" }, { "Senthil ", "Kumar" }, { "Bala", "Vignesh" } };
         
		//String name[][]=new String[10][3];
		
//		for (int i = 0; i < name.length; i++) {
//			for (int j = 0; j < name[i].length; j++) {
//				name[i][j]="sdfs";
//			}
//			System.out.println();
//		}
		
		// single d = index will be 0 , 1, 2..
		// 2d = index will be 00,01.. 10,11,... 20,21..
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		
		
		Person pArr[] = new Person[2];
		pArr[0] = new Person("Rajesh","Kumar","Shankar", 40);
		pArr[1] = new Person("magesh","Kumar","Bala", 40);

		for(Person p: pArr) {
			 System.out.println(p.name+" "+p.age);
		}
	}

}

class Person {
	String name;
	String middleName;
	String lastName;
	int age;
	public Person(String name, String middleName, String lastName, int age) {
		super();
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
	}
	
}
