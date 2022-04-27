package strings;

public class StringSplit {

	public static void main(String[] args) {
		
		String name="Rajesh*Kumar*Shanmuga*vellan";
		
		String result[] = name.split("");
		
		for(String re: result) {
			System.out.println(re);
		}
	}
}
