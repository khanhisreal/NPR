package IOStream_Java;

import java.util.Scanner;

public class basic {
	public static void main(String[] args) {
		/**
		 * Java I/O is used to process the input and produce the output
		 */
		/**
		 * Streams in Java are sequence of data elements, often bytes, that are read from or written to a source or destination
		 * 2 types of I/O streams:
		 * - input streams: reading data
		 * - output streams: writing data
		 * sometimes we have error stream
		 */
		//input
		Scanner len = new Scanner(System.in);
		//output
		System.out.println("output stream");
		//error
		System.err.println("error message");
	}

}
