package Socket_Java.TCP.TCP_Thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientHandleThread extends Thread {
	private int clientNumber;
	private Socket socketOfServer;

	public ClientHandleThread(Socket socket, int clientNumber) {
		this.clientNumber = clientNumber;
		this.socketOfServer = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));

			while (true) {
				// read line to read data from BufferReader
				String line = br.readLine();

				bw.write(">>" + line);
				bw.newLine();
				bw.flush();

				if (line.equals("STOP")) {
					bw.write("OK");
					bw.newLine();
					bw.flush();
					break;
				}
			}
			socketOfServer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
