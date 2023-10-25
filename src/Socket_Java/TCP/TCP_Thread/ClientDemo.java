package Socket_Java.TCP.TCP_Thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		final String serverHost = "localhost";
		final int port = 8080;
		
		//create a socket
		Socket clientSocket = new Socket(serverHost, port);
		
		//Create IOStreams
		BufferedReader br = new BufferedReader(
				new InputStreamReader(clientSocket.getInputStream()));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(clientSocket.getOutputStream()));
		
		//Send to server
		bw.write("HELLO THERE.");
		bw.newLine();
		bw.flush();
		bw.write("LET ME OUT. I DON'T WANT TO GO TO CLASS ANYMORE");
		bw.newLine();
		bw.flush();
		bw.write("STOP");
		bw.newLine();
		bw.flush();
		
		//Read from server
		String response;
		while((response = br.readLine()) != null) {
			System.out.println("Server says: " + response);
			if(response.indexOf("OK") != -1) {
				break;
			}
		}
		bw.close();
		br.close();
		clientSocket.close();
	}
}
