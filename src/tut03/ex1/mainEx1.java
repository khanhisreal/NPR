package tut03.ex1;

import java.util.Scanner;

public class mainEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("URL to download?: ");
		String urlString = sc.nextLine();
		
		ex1 down = null; //create a downloader
		while(down == null) {
			try {
				down = new ex1(urlString);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print("Bad URL! Try again: ");
				urlString = sc.nextLine();
			}
		}
		System.out.print("Target file name: ");
		String targetString = sc.nextLine();
		
		try { //download bytes to file (print error if it fails)
			down.download(targetString);
			System.out.println("Downloaded successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I/O error: " + e.getMessage());
		}
	}
}
