package basic;

public class NumberReverse {
	public static void main(String[] args) {
		 int num=1234;
		 int rev=0;
		 while(num>0) {
			 int r=num%10;
			 rev=(rev*10)+r;
			 num/=10;
		 }
		 System.out.println(rev);
	}

}
