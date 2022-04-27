package loops;

public class Pattern {

	public static void main(String[] args) {

		/*
		 * ip n = 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5
		 */
		int n = 5;
		System.out.println("Square.....");
		for (int a = 1; a <= n; a++) {
			for (int i = 1; i <= n; i++) { // nested loops
				System.out.print("* ");
			}
			System.out.println();
		}
		/* 1
		   1 2
		   1 2 3
		   1 2 3 4
		   1 2 3 4 5 */
		System.out.println("Triangle....");
		for (int a = 1; a <= n; a++) {
			for (int i = 1; i <= a; i++) { // nested loops
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int a = 1; a <= n; a++) {
			for (int i = 1; i <= n; i++) { // nested loops
				System.out.print(a+ " "+i+"--");
			}
			System.out.println();
		}

		// h.w
		/*
		 * 1 2 3 4 5
		   1 2 3 4
		   1 2 3
		   1 2
		   1  
		 * 
		 */
	}
}
