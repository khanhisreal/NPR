package Socket_Java.TCP.InputStreamReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Write a message: ");
		String str = sc.nextLine();
		
		String serverHost = "localhost";
		int serverPort = 3080;
		
		Socket client = new Socket(serverHost,serverPort);
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(client.getOutputStream()));
		bw.write(str);
		bw.flush();
		client.close();
	}
}
