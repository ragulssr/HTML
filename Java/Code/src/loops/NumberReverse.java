package loops;

public class NumberReverse {
  
	public static void main(String[] args) {
		// ip  1234
		// op  4321
		
		int num = 6754;
		int reverseNum = 0;
		while(num>0) {
			int r= num % 10; // 4, 3,2,1
			reverseNum = (reverseNum * 10) + r;  // 4,43,432,4321
			num = num/10; // 1
		}
		System.out.println(reverseNum);
	}
	// H.w   ip 4543 -> 4+5+4+3 ->16 -> 1+6 -> o/p = 7
	//   1000 -> 1
	//    1320 -> 6
}
