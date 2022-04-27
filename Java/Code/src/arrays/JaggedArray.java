package arrays;

public class JaggedArray {

	public static void main(String[] args) {

		int num[][] = new int[3][]; // Jagged array
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[4];

		System.out.println(num[0].length);
		System.out.println(num[2].length);
		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {
				System.out.print(i + " " + j + "  ");
				num[i][j] = i * j;
			}
			System.out.println();
		}
		System.out.println("\n\n");
		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] +"  ");
			}
			System.out.println();
		}
	}
}
