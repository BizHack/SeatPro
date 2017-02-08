import java.io.Serializable;


public class User implements Serializable{

	private int u_id;
	private String firstName;
	private String lastName;
	private String email;
	private String pass;
	
	
	public void setU_id(int uid) {
		this.u_id=uid;
	}
	public int getU_id() {
		return u_id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	
	
}
