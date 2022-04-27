package strings;

public class Strings1 {

	public static void main(String[] args) {

		String messag = "Hello all how are you.S 676";

		char c[] = messag.toCharArray();

		char cha = 65;
		System.out.println(cha);
		int sum = 0;
		int sumCaps = 0;
		int sumNumer = 0;
		for (char c1 : c) {
			if(c1 == 'a' || c1=='i' || c1=='e' || c1=='o' || c1=='u') {
				 sum++;
			}
			if(c1 >= 'A' && c1 <='Z') {
				sumCaps++;
			}
			if(c1 >= '0' && c1 <='9') {
				sumNumer++;
			}
			System.out.print(c1);
		}
		System.out.println("\nCaps : "+sumCaps);
		System.out.println("\nNumbers : "+sumNumer);
		System.out.println("\nThere are "+sum+" vowels present in the string");

	}
}
