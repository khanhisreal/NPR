package Socket_Java.TCP.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		// Server configuration
		int port = 3080;
		ServerSocket serverSocket = new ServerSocket(3080);
		System.out.println("Server 3080 is waiting for the client...");
		
		// Get client
		Socket clientSocket = serverSocket.accept();
		

		try {
			System.out.print("Reply from server: Hi ");
			BufferedReader br = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
			System.out.println(br.readLine());
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
