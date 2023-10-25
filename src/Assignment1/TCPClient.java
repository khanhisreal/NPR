package Assignment1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 * @author Khanh
- can connect to server.
- sends an integer number n to server.
- and receives square of n from server.
 */
public class TCPClient {
    public static void main(String[] args) throws InterruptedException, UnknownHostException, IOException {
        String serverHost = "localhost";
        int serverPort = 8080;

        Socket socket = new Socket(serverHost, serverPort);
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // Send to the server
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
    	//SHOULD WRITE AN INTEGER
        dataOutputStream.writeInt(input); // Send an integer
        dataOutputStream.flush();

        // Get from the server
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        int result = dataInputStream.readInt(); // Read an integer
        System.out.println("Received result from server: " + result);

        dataInputStream.close();
        dataOutputStream.close();
    }
}
