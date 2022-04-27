package loops;

public class NumberSum {
	
	public static void main(String[] args) {
		
		// i/p n = 10
		// o/p 1+2+3...n = 55
		
		int n= 100;
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.print(i+" + ");
			sum = sum + i;  // sum=6
		}
		System.out.println(" = "+sum);
	}

}
