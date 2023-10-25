package Socket_Java.TCP.DataInputStream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Khanh DataInputStream is a class used for reading primitive data
 *         types ("int", "double")
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		int port = 3030;
		ServerSocket socket = new ServerSocket(3030);
		System.out.println("Server is listening on port " + port);

		try {
			System.out.println("Server is waiting to accept user...");
			Socket clientSocket = socket.accept();
			System.out.println("Accept a client");

			/**
			 * If you want to read primitive data from the client using a DataInputStream, 
			 * you should first use a DataOutputStream on the client side to send the data in a machine-independent format. 
			 * Then, on the server side, you can use a DataInputStream to read and interpret that data.
			 */
			DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
			
			//Read an integer from the client
			int value = dataInputStream.readInt();
			System.out.println("Client sent integer: " + value);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
