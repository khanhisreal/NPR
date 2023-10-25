package Midterm;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	public static void main(String[] args) throws IOException {
		// 5abc
		int port = 5105;
		ServerSocket serverSocket = new ServerSocket(port);
		System.out.println("Port 5105 is running...");

		while (true) {
			// client socket
			Socket clienSocket = serverSocket.accept();
			System.out.println("Accepted a client: " + Thread.currentThread().getName());
			
			Core thread = new Core(clienSocket);
			thread.start();
		}
	}
}
