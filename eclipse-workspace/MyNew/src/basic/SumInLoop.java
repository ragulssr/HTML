package basic;

public class SumInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=10;
     int sum=0;
     for(int i=1;i<=n;i++) {
    	 System.out.print(i);
    	 if(i!=n) {
    	 System.out.print(" + ");
    	 } 
    	 sum +=i;
     }
     System.out.print(" = "+sum);
	}

}
