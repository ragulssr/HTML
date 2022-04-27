package loops;

public class NumberPatternSum {
	public static void main(String[] args) {

		// ip -> n = 4
		// o/p -> (1) +(1+2) + (1+2+3) +(1+2+3+4) = 20
		int n = 6;
		int sum = 0;
		for (int a = 1; a <= n; a++) {
			System.out.print("(");
			for (int i = 1; i <= a; i++) { // nested loops
				System.out.print(i);
				if(i!=a) {
				System.out.print(" + ");
				}
				sum = sum +i;

			}
			System.out.print(") ");
			
			if(a!=n) {
				System.out.print("+ ");
			}

		}
		System.out.print(" = "+sum);
		
	}
	//1234 -> 4321
}
