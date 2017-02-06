import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket ss = new ServerSocket(1342);

			Socket clientSocket = ss.accept();

			ObjectOutputStream outToClient = new ObjectOutputStream(clientSocket.getOutputStream());
			ObjectInputStream inFromClient = new ObjectInputStream(clientSocket.getInputStream());

			int number = (int) inFromClient.readObject();
			// Scanner sc = new Scanner(s1.getInputStream());

			// int number = sc.nextInt();

			int temp = number * 2;

			// PrintStream p = new PrintStream(s1.getOutputStream());
			// p.print(temp);

			outToClient.writeObject(temp);
			

		//	System.out.println(number);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
