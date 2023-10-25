package Socket_Java.TCP.basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws UnknownHostException, IOException {
	String serverHost = "localhost";
	int serverPort = 3030;
	
	Socket socket = new Socket(serverHost, serverPort);
	
	System.out.print("Write your name: ");
	String name = sc.nextLine();
	
	BufferedWriter bw = new BufferedWriter(
			new OutputStreamWriter(socket.getOutputStream()));
	
	bw.write(name);
	bw.newLine();
	bw.flush();
	
	socket.close();
	}
}
