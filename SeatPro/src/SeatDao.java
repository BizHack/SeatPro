import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class SeatDao {
	
	
	
	// Declaring connection and statement for DBMS connections
		private Connection connect = null;
		private Statement statement = null;
		// Declaring resultSet object for getting query results and use it to queue.
		private ResultSet resultSet = null;
		// private static ResultSet resultSet2 = null;
		private String url = "jdbc:mysql://localhost/reservation?";
		private String username = "root";
		private String password = "";

	

	public Seat returnSId(int sid) {
		Seat s = new Seat();
		try

		{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = (Connection) DriverManager.getConnection(url + "user=" + username + "&password=" + password);
			// Statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();
			// Result set gets the result of the SQL query
			resultSet = statement.executeQuery("select s_id,u_id,rowN,colN,state from seat where s_id=" + sid);
			// ResultSet is initially before the first data set
			while (resultSet.next()) {

				s.setS_id(resultSet.getInt(1));
				s.setU_id(resultSet.getInt(2));
				s.setRowN(resultSet.getInt(3));
				s.setColN(resultSet.getInt(4));
				s.setState(resultSet.getString(5));
				

			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error from returnCID method: CustomerDAO");

		}
		try {
			connect.close();
			connect = null;
		} catch (SQLException e) {
			System.out.println("Error closing connection: " + e);
		}
		return s;

	}

	
	public Seat returnSId(Seat seat) {
		Seat s = new Seat();
		try

		{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = (Connection) DriverManager.getConnection(url + "user=" + username + "&password=" + password);
			// Statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();
			// Result set gets the result of the SQL query
			resultSet = statement.executeQuery("select s_id,u_id,rowN,colN,state from seat where rowN='"+seat.getRowN()+"'AND colN='"+seat.getColN()+"'");
			// ResultSet is initially before the first data set
			while (resultSet.next()) {

				s.setS_id(resultSet.getInt(1));
				s.setU_id(resultSet.getInt(2));
				s.setRowN(resultSet.getInt(3));
				s.setColN(resultSet.getInt(4));
				s.setState(resultSet.getString(5));
				

			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error from returnSID method: SeatDAO");

		}
		try {
			connect.close();
			connect = null;
		} catch (SQLException e) {
			System.out.println("Error closing connection: " + e);
		}
		return s;

	}

	
	public void updateSeat(Seat seat) {
		// Get a connection
		try {
			connect = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Error creating connection to database: " + e);
			System.exit(-1);
		}
		
		// Query to insert a record to the bank table
		String query = "UPDATE seat SET u_id='" + seat.getU_id() + "', state='"+seat.getState()+"' WHERE s_id=" + seat.getS_id()
				+ ";";
		// Use prepared statements to avoid SQL injection attacks
		try (PreparedStatement statement = connect.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

			statement.executeUpdate();

		} catch (SQLException e) {
			seat = null;
			System.out.println("Error Creating Order: " + e);
			System.out.println("Error for Customer Update Method: SeatDAO");
		}
		// Close the connection to the database - Very important!!!
		try {
			connect.close();
			connect = null;
		} catch (SQLException e) {
			System.out.println("Error closing connection: " + e);
			System.out.println("Error for Customer Update Error Method: SeatDAO");
		}

	}

	public List<Seat> getAllSeats() {
		List<Seat> seatList = new ArrayList<>();

		// This will load the MySQL driver, each DB has its own driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = (Connection) DriverManager.getConnection(url + "user=" + username + "&password=" + password);
			// Statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();

			// Result set gets the result of the SQL query
			resultSet = statement.executeQuery(
					"select s_id,u_id,rowN,colN,state from seat");
			// ResultSet is initially before the first data set
			while (resultSet.next()) {

				Seat seat = new Seat();
				seat.setS_id(resultSet.getInt(1));
				seat.setU_id(resultSet.getInt(2));
				seat.setRowN(resultSet.getInt(3));
				seat.setColN(resultSet.getInt(4));
				seat.setState(resultSet.getString(5));
				
			
				seatList.add(seat);

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

		return seatList;
	}

	


}
