package Exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.age = 18;
		p.name = "ragul";
		p.setTestScore(1);

		String statusString = null;
		try { // if you throw used mandatory use it try_catch
			statusString = getDrivingLicense(p);
		} catch (Exception e) {
//			e.printStackTrace();
		}
		System.out.println("Driving License :"+statusString);
	}

	public static String getDrivingLicense(Person per) throws Exception  {
		String name = "";
		if (per.age <= 17) {
			name = "Failed : Age under limit";
			throw new Exception(name);
		}
		if (per.score <= 40) {
			name = "Failed : score below 60";
			return name;
		}
		name = "Sucess : License Approved";
		return name;

	}

}

class Person {
	int age;
	String name;
	int score;

	public int getResult() {
		return score;
	}

	public void setTestScore(int scr) {
		this.score = scr;
	}
}
