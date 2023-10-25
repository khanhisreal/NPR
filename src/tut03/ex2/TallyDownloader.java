package tut03.ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.TreeMap;

import tut03.ex1.ex1;

public class TallyDownloader extends tut03.ex2.ex1{
	
	public TallyDownloader(String url) throws MalformedURLException {
		// TODO Auto-generated constructor stub
		super(url);
	}
	
	public void download(String targetFileName) throws IOException {
		super.download(targetFileName);
		
		Map<Character, Integer> counts = new TreeMap<>();
		FileInputStream in = new FileInputStream(targetFileName);
		while(true) {
			int n = in.read();
			if(n == -1) {
				break;
			}
			char ch = (char) n;
			if(counts.containsKey(ch)) {
				counts.put(ch, counts.get(ch) + 1);
			} else {
				counts.put(ch, 1);
			}
			System.out.print(ch);
		} 
		in.close();
		System.out.println(counts); // print map of char -> int
	}
	
}
