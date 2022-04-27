package basic;

public class NumberPatternSum {

	public static void main(String[] args) {
		
		int n=4;int sum=0;
		
		for(int a=1;a<=n;a++) {
			System.out.print("(");
			for(int i=1;i<=a;i++) {
				System.out.print(i);
				if(i!=a) {
					System.out.print("+");
				}
				sum=sum+i;
			}
			System.out.print(")");
			if(a!=n) {
				System.out.print("+");
			}
		}
         System.out.print("="+sum);
	}

}
