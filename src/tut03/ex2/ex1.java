package tut03.ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ex1 {
	//read from an URL and write the result to a file on the disk
	private URL url;
	
	//constructor to read from the given URL
	public ex1(String urlString) throws MalformedURLException {
		url = new URL(urlString);
	}
	
	//read downloader's URL and writes contents to the given file
	public void download(String targetFileName) throws IOException {
		InputStream in = url.openStream();
		FileOutputStream out = new FileOutputStream(targetFileName);
		while(true) {
			int n = in.read();
			if(n == -1) { //-1 means end of file
				break;
			}
			out.write(n);
		}
		in.close();
		out.close();
	}
}
