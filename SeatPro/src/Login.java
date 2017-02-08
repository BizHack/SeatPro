

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField username;
	private static JPasswordField passwordField;
	
	public Login(){
		

	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(false);
	      setTitle("Login Page");
	      setSize(251, 338);
	      setLocation(300,200);
	      
	      JPanel panel = new JPanel();
	      panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	      
	      JLabel lblWelcome = new JLabel("Welcome");
	      lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	      GroupLayout groupLayout = new GroupLayout(super.getContentPane());
	      groupLayout.setHorizontalGroup(
	      	groupLayout.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(lblWelcome)))
	      			.addContainerGap(21, Short.MAX_VALUE))
	      );
	      groupLayout.setVerticalGroup(
	      	groupLayout.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addGap(21)
	      			.addComponent(lblWelcome)
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addContainerGap(38, Short.MAX_VALUE))
	      );
	      
	      JLabel lblNeedNewAccount = new JLabel("Need New Account?");
	      lblNeedNewAccount.setFont(new Font("Tahoma", Font.PLAIN, 11));
	      
	      JButton signUpbtn = new JButton("SIGN UP");
	      signUpbtn.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		setVisible(false);
	      		dispose();
	      		Register reg = new Register();
	      		reg.setVisible(true);
	      	}
	      });
	      signUpbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
	      GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	      gl_panel_1.setHorizontalGroup(
	      	gl_panel_1.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panel_1.createSequentialGroup()
	      			.addContainerGap()
	      			.addComponent(lblNeedNewAccount)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(signUpbtn, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
	      			.addGap(24))
	      );
	      gl_panel_1.setVerticalGroup(
	      	gl_panel_1.createParallelGroup(Alignment.TRAILING)
	      		.addGroup(gl_panel_1.createSequentialGroup()
	      			.addContainerGap(13, Short.MAX_VALUE)
	      			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	      				.addComponent(signUpbtn)
	      				.addComponent(lblNeedNewAccount))
	      			.addContainerGap())
	      );
	      panel_1.setLayout(gl_panel_1);
	      
	      JLabel lblUsername = new JLabel("Username:");
	      lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
	      
	      username = new JTextField();
	      username.setColumns(10);
	      
	      JLabel lblPassword = new JLabel("Password:");
	      lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
	      
	      JButton loginbtn = new JButton("LOGIN");
	      loginbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
	      
	      passwordField = new JPasswordField();
	      GroupLayout gl_panel = new GroupLayout(panel);
	      gl_panel.setHorizontalGroup(
	      	gl_panel.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panel.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	      				.addComponent(lblUsername)
	      				.addComponent(username, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
	      				.addComponent(lblPassword)
	      				.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
	      				.addComponent(loginbtn, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
	      			.addContainerGap())
	      );
	      gl_panel.setVerticalGroup(
	      	gl_panel.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panel.createSequentialGroup()
	      			.addContainerGap()
	      			.addComponent(lblUsername)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addComponent(lblPassword)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
	      			.addComponent(loginbtn)
	      			.addContainerGap())
	      );
	      panel.setLayout(gl_panel);
	     getContentPane().setLayout(groupLayout);
		
	}
	
	public static void main(String[] args) {
	      
	    Login LoginPage = new Login();  
		
	      LoginPage.setVisible(true);
	     
	      
	    }
	
	
      
	
}
