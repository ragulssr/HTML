package OOPS;

public class constuctor {

	public static void main(String[] args) {
		Fruit f = new Fruit(100, "Ragul");// arguments are mandatory.
//		f.id=100;
//		f.Name="Ragul";  This is overwrite constructor
		f.display();

		Fruit f1 = new Fruit(101, "Aswinth");
		f1.id = 101;
		f1.Name = "Aswinth";
		f1.display();
		
	}
}

class Fruit {
	int id;
	String Name;
	float rate;

	// arguments is required only
	public Fruit(int id, String Name) {// Constructor
		System.out.println("Constuctor Created...");
	}

	public void display() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + Name);
	}
}
