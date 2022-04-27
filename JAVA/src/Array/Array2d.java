package Array;

public class Array2d {

	public static void main(String[] args) {
		// single d = index 0,1,2...
		// 2d = 0.0 , 0.1 , 1.0 , 1.2 , 2.0 , 2.1 , ....
		// 						0.0 	0.1 		 1.0 		1.1 		  2.0 			2.1
		String Name[][] = { {"Ahash","Kanna"}, { "Ragul", "Sampath" }, { "Shanmuga", "Aswinth" } };

		for (int i = 0; i < Name.length; i++) {
			for (int j = 0; j < Name[i].length; j++) {
				System.out.print(Name[i][j] + " ");
			}
			System.out.println();
		}
	}

}
