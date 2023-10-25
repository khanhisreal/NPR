package IOStream_Java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author Khanh OutputStreams are used to write data to a destination. it has
 *         two types: 
 *         -> OutputStream to work with binary data 
 *         -> Writer to work with text data
 * 
 *         BufferedOutputStream is used to improve I/O performance by writing
 *         data in chunks, reducing the number of direct write operations
 */
public class OutputStreams {

	static Scanner sc = new Scanner(System.in);

	// Create a new text file and write some text to it.
	public static void main(String[] args) throws IOException {
		while (true) {
			String fileName = "lorem.txt";
			File file = new File(fileName);
			if (file.exists()) {
				int i = 1;
				fileName = fileName.substring(0, 4) + i + ".txt";
				i++;
			}
			System.out.println("Simple program to write data into a file using OutputStreams");
			System.out.println("1. Write binary number.");
			System.out.println("2. Write text data");
			System.out.print("Your option: ");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				writeBinary(file);
				break;
				
			case 2:
				writeText(file);
				break;
				
			default:
				System.out.println("Invalid option!");
				break;
			}
				
		}
	}

	private static void writeText(File file) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Say something: ");
		String str = sc.nextLine();
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(file));
		bw.write(str);
		bw.close();
		System.out.println("Wrote to file successfully!");
	}

	private static void writeBinary(File file) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Write some numbers: ");
		int n = Integer.parseInt(sc.nextLine());
		OutputStreamWriter os = new OutputStreamWriter(
				new FileOutputStream(file));
		os.write(n);
		os.close();
		System.out.println("Wrote to file successfully!");
	}
}
