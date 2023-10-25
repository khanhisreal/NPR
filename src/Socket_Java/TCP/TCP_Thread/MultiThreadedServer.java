package Socket_Java.TCP.TCP_Thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author Khanh
 * Using threads is a common practice to handle with multiple client connection concurrently. Each connection is handled by a single thread, allowing the server to serve multiple clients simultaneously
 */
public class MultiThreadedServer {
	public static void main(String[] args) throws IOException{
		int port = 8080;
		int clientNumber = 0;
		
		ServerSocket serverSocket = new ServerSocket(port);
		System.out.println("Server in listening on port " + port);
		
		//Continuously listen to clients 
		while(true) {
			Socket clientSocket = serverSocket.accept();
			System.out.println("Accepted a client");
			
			//Create a thread to handle the client
			ClientHandleThread thread = new ClientHandleThread(clientSocket, clientNumber++);
			thread.start();
		}
	}
}
