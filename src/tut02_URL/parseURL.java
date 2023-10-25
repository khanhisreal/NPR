package tut02_URL;

import java.net.MalformedURLException;
import java.net.URL;

public class parseURL {

	public static void main(String[] args) throws MalformedURLException {
		// Create a URL object for the given URL string.
		URL url = new URL("http://java.sun.com:80/docs/books/tutorial/intro.html#DOWNLOADING");
		// Print the protocol (e.g., "https")
		System.out.println("Protocol = " + url.getProtocol());
		// Print the host (e.g., "www.facebook.com")
		System.out.println("Host = " + url.getHost());
		// Print the file path (e.g., "/")
		System.out.println("FileName = " + url.getFile());
		// Print the port (e.g., -1 if not specified in the URL)
		System.out.println("Port = " + url.getPort());
		// Print the URL fragment (e.g., null if not specified)
		System.out.println("Reference = " + url.getRef());
	}

}
