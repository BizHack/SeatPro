import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javafx.scene.chart.ValueAxis;


public class Client {

	
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		int number, temp;
		
		Scanner sc= new Scanner(System.in);
		
		Socket clientSocket = new Socket("127.0.0.1",1342);
		
		Scanner sc1= new Scanner(clientSocket.getInputStream());
		
		System.out.println("enter Your number:");
		
		number=sc.nextInt();
		
		Integer intObj=Integer.valueOf(number);
		
		ObjectOutputStream outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
        ObjectInputStream inFromServer = new ObjectInputStream(clientSocket.getInputStream());

		
        
		outToServer.writeObject(intObj);
		
	//	PrintStream p= new PrintStream(clientSocket.getOutputStream());
		
	//	p.println(number);
		
		temp=(int) inFromServer.readObject();
		
		//temp=sc1.nextInt();
		System.out.println(temp);
		
		
		//clientSocket.close();
		
		
	}
}
