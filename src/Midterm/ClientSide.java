package Midterm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) throws UnknownHostException, IOException {
        String serverHost = "localhost";
        int port = 5105;

        Socket socket = new Socket(serverHost, port);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // Send a message to the server
        bw.write("Hello, my name is Phan Quoc Khanh! My ID is 2001040105");
        bw.newLine();
        bw.flush();

        Scanner sc = new Scanner(System.in);
        System.out.print("And you want to say: ");
        String str = sc.nextLine();
        bw.write(str);
        bw.newLine();
        bw.flush();

        // Read and display server responses
        String response;
        while ((response = br.readLine()) != null) {
            System.out.println("Server response: " + response);
        }

        // Properly close resources in a finally block
        try {
            br.close();
            bw.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
