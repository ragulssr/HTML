package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExamples {

	static String path = "D:\\\\Java\\\\ss";
	static File f = null;

	public static void main(String[] args) {

		File f = new File(path);

//		if (f.mkdirs()) { // it used for create new folder. mkdirs is multiple folder created used.
//			System.out.println("Folder has Created..");
//		} else {
//			System.out.println("Unable to create Folder!!");
//		}
//
//		if (f.exists()) { // it used for file exist in folder
//			System.out.println("Folder Exists");
//		} else {
//			System.out.println("Folder not Exists");
//		}

		if (f.isDirectory()) { // it used for Folder checked
			System.out.println("It is Folder...");
		} else {
			System.out.println("It's not Folder..");
		}

//		f.delete(); It's delete Folder.
		write();
		read();

	}

	// File Writer
	public static void write() {
		File file = new File(path + f.separator + "test.txt"); // create text file
		System.out.println(file.toPath()); // display file path

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your message");
		String msgString = scanner.nextLine();
		try {
			FileWriter writer = new FileWriter(file, true); // define file writer
			writer.write(msgString);
			writer.close();
			System.out.println("Content has been Saved");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void read() {
		StringBuffer buffer = new StringBuffer(); // defined String buffer
		System.out.println("Content Start____________");
		File file = new File(path + f.separator + "test.txt");
		try {
			FileReader reader = new FileReader(file); // file reader defined
			
			while (true) {  // file content view conditions
				int i = reader.read();
				if (i == -1) {
					break;
				}
				buffer.append((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(buffer.toString()); // change char to String.
		System.out.println("_________end______");
	}

}
