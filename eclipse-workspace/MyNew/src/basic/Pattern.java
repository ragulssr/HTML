package basic;

public class Pattern {

	public static void main(String[] args) {
		// Square.....
      System.out.println("Square");
      System.out.println("------");
		int n=5;
	for(int a=1;a<=n;a++) {
		for(int i=1;i<=n;i++) {
		System.out.print(" * ");	
		}
		System.out.println();
	}

	
	//Triangle.....
	System.out.println("Triangle");
	System.out.println("--------");
	for(int a=1;a<=n;a++) {
		for(int i=1;i<=a;i++) {
		System.out.print(" * ");	
		}
		System.out.println();
	}
System.out.println("Downtown");
System.out.println("--------");
	int k=6;
	for(int a=k-1;a>=0;a--) {
		for(int i=1;i<=a;i++) {
		System.out.print(" * ");	
		}
		System.out.println();
	}
}
}