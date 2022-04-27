package Array;

public class Arrays {

	public static void main(String[] args) {

		String word[] = { "Hi", "Guys", "Hello", "How", "When" };
		int mark[] = new int[5];
		mark[0] = 12;
		mark[1] = 13;
		mark[2] = 14;
		mark[3] = 15;
		mark[4] = 16;
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}

		int max_mark = mark[0];
		for (int j = 0; j < mark.length; j++) {
			if (mark[j] > max_mark) {
				max_mark = mark[j];
			}
		}
		System.out.println("maximum mark is " + max_mark);
	}

}
