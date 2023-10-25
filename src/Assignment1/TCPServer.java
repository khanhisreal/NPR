package Assignment1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author Khanh
 * A server that: 
- can accept connect from client.
- receives integer number n from client.
- calculates the value of square of n.
- and sends back square of n to client.
 */
public class TCPServer {
	public static void main(String[] args) throws Exception {
		//Open server socket
		ServerSocket serverSocket = new ServerSocket(8080);
		System.out.println("Port 8080 is running!");
		
		//Open client socket
		Socket clienSocket = serverSocket.accept();
		
		try {
			//Read data
			DataInputStream dataInputStream = new DataInputStream(
					clienSocket.getInputStream());
			int n = dataInputStream.readInt();
			System.out.println("Client sent: " + n);
			System.out.println("Sending back to client the result....");
			
			//Write data
			DataOutputStream dataOutputStream = new DataOutputStream(
					clienSocket.getOutputStream());
			//SHOULD WRITE AN INTEGER
			dataOutputStream.writeInt(square(n));
			dataOutputStream.flush();
			
			//Close
			dataInputStream.close();
			dataOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static int square(int n) {
		return n*n;
	}
}
