package strings;

public class StringExample {

	public static void main(String args[]) {

		String strLarge = "         I am Senthilkumar. I am       living in chennai..               ";
		String email = "Gv90senthil11@gmail.com";
		String str = "I AM SENTHIL"; // literals

		String nameObj1 = new String("senthil"); // object - heap
		String nameObj2 = new String("senthil"); //
		String nameLit1 = "senthil";// literals - pool
		String nameLit2 = "Senthil";// literals

		System.out.println(nameLit1 == nameLit2); // its compares the reference
		System.out.println(nameObj1 == nameObj2);
	
		System.out.println(nameLit2.equals(nameLit1)); // compares the content of the string
		System.out.println(nameLit2.equalsIgnoreCase(nameObj2));

		System.out.println("-----------------------");

		System.out.println(nameLit2 + " length is " + nameLit2.length());
		System.out.println("char at 3 "+str.charAt(3));
		System.out.println("index of M " +str.indexOf('M'));
		System.out.println("last index of I"+str.lastIndexOf('I'));
		System.out.println("\nEmpty------------");
		System.out.println("\nIs Empty  " + str.isEmpty());
		// System.out.println("IS Empty "+"".isEmpty());
		System.out.println("Substring : " + str.substring(3));
		System.out.println("Substring 2 range : " + str.substring(2, 6));
		System.out.println("Contains " + str.contains("SENTHIL"));
		System.out.println("Concat " + str.concat(" KUMAR"));
		System.out.println("Trim Before: " + strLarge);
		System.out.println("Trim after : " + strLarge.trim());
		System.out.println("Replace : " + strLarge.replace("am", "AM"));
		System.out.println("Replace All : " + email.replaceAll("[A-Z]", "x"));
		System.out.println("Email: " + "XXXX".concat(email.substring(4)));
		System.out.println("Compare to :" + "A".compareTo("A")); //ascii 
		System.out.println("Starts with " + str.startsWith("I"));
		System.out.println("Ends ith: " + str.toLowerCase().endsWith("thil"));
		System.out.println("Lower :" + str.toLowerCase());
		
		
		System.out.println("Split example-----------");
		String sp[] = str.split(" ");
		for (String s : sp) {
			System.out.println(s);
		}
		char ar[] = str.toCharArray();
		int count = 0;
		int vowel = 0;
		for (char c : ar) {
			if (c == 'i' || c == 'I') {
				count++;
			}
			if( c=='I' || c=='A' || c=='E' || c=='O' || c=='U') {
				vowel++;
			}
			System.out.print(c+"|");
		}
		System.out.println("\n" + count + " times i/I is present in " + str);
		System.out.println("Vowels  : "+vowel);

	}
}
