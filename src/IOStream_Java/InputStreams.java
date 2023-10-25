package IOStream_Java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Khanh InputStreams are used to read data from a source. It has two
 *         types: 
 *         -> InputStream to read data of byte streams 
 *         -> Reader to read data of character streams
 * 
 *         Buffered I/O Buffered stream "BufferedInputStream" is used to improve
 *         I/O performance by reading data in chunks, reducing the number of
 *         direct read
 */
public class InputStreams {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("Simple program to read data from a source using InputStream");
			System.out.println("1. Read from file.");
			System.out.println("2. Read from URL.");
			System.out.print("Your option: ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				readFromFile();
				break;

			case 2:
				readFromUrl();
				break;

			default:
				System.out.println("Invalid option!");
				break;
			}
		}
	}

	private static void readFromUrl() throws IOException {
		String url = "https://example-files.online-convert.com/document/txt/example.txt";
		URL object = new URL(url);
		BufferedReader br = new BufferedReader(new InputStreamReader(object.openStream()));

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	private static void readFromFile() throws IOException {
		try {
			File file = new File("lorem.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			File myObj = new File("lorem.txt");
			myObj.createNewFile();
			System.out.println("File created successfully.");
		}
	}
}
