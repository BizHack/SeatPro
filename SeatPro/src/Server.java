import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;



public class Server {

	public boolean checkAvailability(String username) {
		UserDao udao = new UserDao();

		for (int i = 0; i < udao.getAllUsers().size(); i++) {
			User u = udao.getAllUsers().get(i);
			// System.out.println("here");
			if (u.getEmail().equals(username)) {
				// username authorized
				return true;
			}

		}
		return false;

	}

	public boolean authorizeUsers(String pass1, String pass2) {

		if (pass1.equals(pass2)) {
			return true;
		} else {
			return false;
		}

	}

	public String logIn(String username, String password) {
		// Extract the data from the view elements
		UserDao udao = new UserDao();
		String name = username;
		String pass = password;
		name = name.trim().toLowerCase();

		// Validate the data
		if (name == null || name.trim().equals("")) {
			return "Please enter username";
		}
		if (pass == null || pass.trim().equals("")) {
			return "Please enter password";
		}

		if (!checkAvailability(name)) {
			System.out.println("Incorrect user");

			return "Incorrect user";

		}

		User user = new User();
		user.setEmail(name);
		
		System.out.println(udao.readUsersByEmail(user).getPass());
		System.out.println(pass);

		if (authorizeUsers(pass, udao.readUsersByEmail(user).getPass())) {
			System.out.println("Correct Password");
			return "Correct password";

		}

		return "Incorrect password";
	}

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket ss = new ServerSocket(1342);
			String message = "";

			Socket clientSocket = ss.accept();
			// System.out.println("here");

			ObjectOutputStream outToClient = new ObjectOutputStream(clientSocket.getOutputStream());
			ObjectInputStream inFromClient = new ObjectInputStream(clientSocket.getInputStream());

			
			User loginUser =  (User) inFromClient.readObject();
			
		

			Server server = new Server();
			
			
			
			

			message = server.logIn(loginUser.getEmail(), loginUser.getPass());
			System.out.println(message);

			if (message == null) {
				message = "incorrect";
			}

			// Scanner sc = new Scanner(s1.getInputStream());

			// int number = sc.nextInt();

			// int temp = number * 2;

			// PrintStream p = new PrintStream(s1.getOutputStream());
			// p.print(temp);

			outToClient.writeObject(message);

			// System.out.println(number);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
