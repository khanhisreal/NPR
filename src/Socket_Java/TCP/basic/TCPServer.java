package Socket_Java.TCP.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Khanh TCP socket is a communication endpoint used for establishing
 *         and maintaining a network connection between two devices over a TCP
 *         network Java provides classes and APIs to work with TCP sockets: ->
 *         Client-side socket: initiate a connection to server -> Server-side
 *         socket: listen for incoming connections on a specific port When a
 *         client connects, a new "Socket" object is created to handle the
 *         communication with that client -> InputStream and OuputStream
 *         classes: used to read from and write to the input and output streams
 *         of a socket
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		int port = 3030;
		ServerSocket serverSocket = new ServerSocket(port);
		System.out.println("Server listening on port " + port);

		while (true) {
			Socket clientSocket = serverSocket.accept();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("Hello " + br.readLine());
			clientSocket.close();
		}
	}
}
