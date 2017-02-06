import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class UserDao {
	
	
	/*
	// Declaring connection and statement for DBMS connections
		private Connection connect = null;
		private Statement statement = null;
		// Declaring resultSet object for getting query results and use it to queue.
		private ResultSet resultSet = null;
		// private static ResultSet resultSet2 = null;
		private static String url="jdbc:mysql://localhost/";
		private String username = "root";
		private String password = "";
		
		
		public List<User> getAllUsers() {
			List<User> users = new ArrayList<>();

			try {
				Class.forName("com.mysql.jdbc.Driver");

				// Setup the connection with the DB
				connect = (Connection) DriverManager.getConnection(url,"root","");
				// Statements allow to issue SQL queries to the database
				statement = (Statement) connect.createStatement();
				// Result set gets the result of the SQL query
				resultSet = statement.executeQuery("select u_id,user,pass,firstname,lastname,Position,u_type from user");

				// ResultSet is initially before the first data set
				while (resultSet.next()) {
					User user = new User();
					user.setuID(resultSet.getInt(1));
					user.setUsername(resultSet.getString(2));
					user.setPassword(resultSet.getString(3));
					user.setFirstName(resultSet.getString(4));
					user.setLastName(resultSet.getString(5));
					user.setPosition(resultSet.getString(6));
					user.setuType(resultSet.getString(7));

					users.add(user);

				}
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("error in getAllUser:UserDAO");
				System.out.println("Cannot read from local database");
				System.exit(0);
			}

			try {
				connect.close();
				connect = null;
			} catch (SQLException e) {
				System.out.println("Error closing connection: " + e);
			}

			return users;
		}
		
		public void addUser(User user) {

			try {
				connect = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				System.out.println("Error connection to database:" + e);
				System.exit(-1);

			}

			// Query to insert a record to the bank table
			String query = "INSERT INTO user (user, pass,firstname,lastname,Position,u_type) VALUES (?,?,?,?,?,?) ;";
			try (PreparedStatement statement = connect.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

				statement.setString(1, user.getUsername());
				statement.setString(2, user.getPassword());
				statement.setString(3, user.getFirstName());
				statement.setString(4, user.getLastName());
				statement.setString(5, user.getPosition());
				statement.setString(6, user.getuType());

				statement.executeUpdate();

			} catch (SQLException e) {
				user = null;
				System.out.println("Error Creating User: " + e);
				System.out.println("Error for Create Error Method: UserDAO");
			}

		}

		public User readUsersByName(User user) {
			User u = new User();
			// This will load the MySQL driver, each DB has its own driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// Setup the connection with the DB
				try {
					connect = (Connection) DriverManager.getConnection(url,"root","");

				} catch (Exception e) {
					System.out.println("Error creating connection to database: " + e);
					System.exit(-1);
				}

				// Statements allow to issue SQL queries to the database
				statement = (Statement) connect.createStatement();
				// Result set gets the result of the SQL query
				resultSet = statement
						.executeQuery("select u_id,user,pass,firstname,lastname,Position,u_type from user where user='" + user.getUsername() + "';");
				// ResultSet is initially before the first data set
				while (resultSet.next()) {
					u.setuID(resultSet.getInt(1));
					u.setUsername(resultSet.getString(2));
					u.setPassword(resultSet.getString(3));
					u.setFirstName(resultSet.getString(4));
					u.setLastName(resultSet.getString(5));
					u.setPosition(resultSet.getString(6));
					u.setuType(resultSet.getString(7));

				}
			} catch (Exception e) {
				// e.printStackTrace();

			}
			try {
				connect.close();
				connect = null;
			} catch (SQLException e) {
				System.out.println("Error closing connection: " + e);
			}

			return u;

		}

		public User readUsersByID(User user) {
			User u = new User();
			// This will load the MySQL driver, each DB has its own driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// Setup the connection with the DB
				try {
					connect = (Connection) DriverManager.getConnection(url,"root","");

				} catch (Exception e) {
					System.out.println("Error creating connection to database: " + e);
					System.exit(-1);
				}

				// Statements allow to issue SQL queries to the database
				statement = (Statement) connect.createStatement();
				// Result set gets the result of the SQL query
				resultSet = statement
						.executeQuery("select u_id,user,pass,firstname,lastname,Position,u_type from user where u_id='" + user.getuID() + "';");
				// ResultSet is initially before the first data set
				while (resultSet.next()) {
					u.setuID(resultSet.getInt(1));
					u.setUsername(resultSet.getString(2));
					u.setPassword(resultSet.getString(3));
					u.setFirstName(resultSet.getString(4));
					u.setLastName(resultSet.getString(5));
					u.setPosition(resultSet.getString(6));
					u.setuType(resultSet.getString(7));

				}
			} catch (Exception e) {
				// e.printStackTrace();

			}
			try {
				connect.close();
				connect = null;
			} catch (SQLException e) {
				System.out.println("Error closing connection: " + e);
			}

			return u;

		}

*/
}
