package tut03.ex2;

import java.util.Scanner;

public class DownloadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("URL to download?: ");
		String urlString = sc.nextLine();
		
		ex1 down = null;
		while(down == null) {
			try {
				down = new TallyDownloader(urlString);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.print("Bad URL! Try again: ");
				urlString = sc.nextLine();
			}
		}
		
		System.out.print("Target file name: ");
		String targetFileName = sc.nextLine();
		
		try {
			down.download(targetFileName);
			System.out.println("Downloaded successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I/O error: " + e.getMessage());
		}
	}
}
