package Exceptions;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class ThrowsMultiExamples {

	public static void main(String[] args) {

		Person1 per = new Person1();

		per.Age = 18;
		per.Score = 50;
		String statuString = null;
		try {
			statuString = getDriving(per);
		} catch (Agebar e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (scorebar e) {
			// TODO: handle exception
		}
		System.out.println("XXX" + statuString);

	}

	public static String getDriving(Person1 per) throws Agebar, scorebar {
		String Name = "";
		if (per.Age <= 17) {
			throw new Agebar();
		}
		if (per.Score<=59) {
			throw new scorebar();
		}
		return Name;

	}

}

class Agebar extends Exception { // Exception Class.
	public Agebar() {
		super("Failed : Age Under limit");
	}

}
class scorebar extends Exception{
	public scorebar() {
		super("Failed : Score below 60");
	}
}

class Person1 {
	int Age;
	String nameString;
	int Score;
}
