package Socket_Java.TCP.DataInputStream;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String serverHost= "localhost";
		int serverPort = 3030;
		
		Socket socket = new Socket(serverHost, serverPort);
		
		//Create a DataOutputStream to send primitive data
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Send a number: ");
		int n = sc.nextInt();
		
		//send to server
		dataOutputStream.writeInt(n);
		dataOutputStream.flush(); // Flush the data to ensure it's sent
		
		socket.close();
	}
}
