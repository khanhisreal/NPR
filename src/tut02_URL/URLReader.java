package tut02_URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {
	//read the file from a URL
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://example-files.online-convert.com/document/txt/example.txt");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(url.openStream()));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
