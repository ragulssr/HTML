package Exceptions;

public class ExceptionsExamples {
	/**
	Throwable -> Exception & Error.
	Exception -> Arithmetic,ArrayIndex,NullPointer.   We can handle Exception.
	Error     -> Out of Memory, StackOverflow ...     We can not handle Error.
	*/

	public static void main(String[] args) {
		int i = 3;
		String nameString = null;
		String rr = "ragul";
		try {

			try {
				int j = i / 0;//Throw Error an Exception
				System.out.println("Result" + j);
			} catch (ArithmeticException e) {
				System.out.println("Num Error");
			}

			try {
				System.out.println("Length =" + nameString.length());// Empty String Occur Error.
			} catch (NullPointerException e) {
				System.out.println("null Error");
			}
			try {
				System.out.println("Char at" + rr.charAt(11));// Invalid index Positions Occur Error.
			} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Error");
			}

		} catch (Exception e) {
			System.out.println("Something Went Wrong");// All Error. Parent of All Exception error class.
		}finally {
			System.out.println("Always Execute..");
		}
		System.out.println("Program ends");
	}
}