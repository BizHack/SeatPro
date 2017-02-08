
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPasswordField passwordRewrite;
	private static JPasswordField password;
	private static JTextField email;
	private static JTextField lastName;
	private static JTextField firstname;

	public Register(){
	 
	      
	      super("A JFrame");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(false);
	      setTitle("Register Page");
	      setSize(365, 369);
	      setLocation(300,200);
	      
	      JLabel lblCreateAnAccount = new JLabel("Create an Account");
	      lblCreateAnAccount.setFont(new Font("Tahoma", Font.BOLD, 15));
	      
	      JPanel panel = new JPanel();
	      panel.setBorder(new TitledBorder(null, "Please wite your information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	      
	      JPanel panel_1 = new JPanel();
	      GroupLayout groupLayout = new GroupLayout(super.getContentPane());
	      groupLayout.setHorizontalGroup(
	      	groupLayout.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      				.addComponent(panel_1, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
	      				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
	      					.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
	      					.addComponent(lblCreateAnAccount, Alignment.LEADING)))
	      			.addContainerGap(17, Short.MAX_VALUE))
	      );
	      groupLayout.setVerticalGroup(
	      	groupLayout.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addGap(19)
	      			.addComponent(lblCreateAnAccount)
	      			.addGap(18)
	      			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
	      );
	      
	      JButton registerbtn = new JButton("Register");
	      registerbtn.addActionListener(new ActionListener() {
			
	    	
	
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			if (firstname.getText().isEmpty() || lastName.getText().isEmpty() || 
		        email.getText().isEmpty()|| password.getText().isEmpty() || 
		        passwordRewrite.getText().isEmpty()){
				
				JOptionPane.showMessageDialog(null, "Please enter all information","Error Message", JOptionPane.WARNING_MESSAGE);
			}	
			
			else if (firstname.getText().length()<6 || lastName.getText().length()<6 || 
			        email.getText().length()<6|| password.getText().length()<6 || 
			        passwordRewrite.getText().length()<6 ||
			        firstname.getText().length()>12 || lastName.getText().length()>12 || 
			        email.getText().length()>12|| password.getText().length()>12 || 
			        passwordRewrite.getText().length()>12 ){
				
				JOptionPane.showMessageDialog(null, "Please Make Sure First Name, Last Name, Email and Password should be within the range of 6 to 12 characters","Error Message", JOptionPane.WARNING_MESSAGE);
			}
				
			else if (!password.getText().equals(passwordRewrite.getText())){
			JOptionPane.showMessageDialog(null, "Please make sure password and re-write password are the same","Error Message", JOptionPane.WARNING_MESSAGE);
			}
			
			else if (!isValidEmailAddress(email.getText())){
				
				JOptionPane.showMessageDialog(null, "Please enter a valid email","Error Message", JOptionPane.WARNING_MESSAGE);
				
				//checking the email in the data base
				
				
			}
			
			
			
			}
			
						
			
		});
	      JButton backbtn = new JButton("Go Back");
	      backbtn.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		new Login().setVisible(true);
	      		setVisible(false);
	      		dispose();
	      	  	}
	      });
	      GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	      gl_panel_1.setHorizontalGroup(
	      	gl_panel_1.createParallelGroup(Alignment.LEADING)
	      		.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
	      			.addGap(63)
	      			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
	      				.addComponent(backbtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
	      				.addComponent(registerbtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
	      			.addGap(88))
	      );
	      gl_panel_1.setVerticalGroup(
	      	gl_panel_1.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panel_1.createSequentialGroup()
	      			.addContainerGap()
	      			.addComponent(registerbtn)
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addComponent(backbtn, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	      			.addContainerGap(15, Short.MAX_VALUE))
	      );
	      panel_1.setLayout(gl_panel_1);
	      
	      JLabel lblName = new JLabel("First Name:");
	      
	      JLabel lblLastName = new JLabel("Last Name:");
	      
	      JLabel lblEmail = new JLabel("Email:");
	      
	      JLabel lblPassword = new JLabel("Password:");
	      
	      JLabel lblRewritePassword = new JLabel("Re-write password:");
	      
	      passwordRewrite = new JPasswordField();
	      
	      password = new JPasswordField();
	      
	      email = new JTextField();
	      email.setColumns(10);
	      
	      lastName = new JTextField();
	      lastName.setColumns(10);
	      
	      firstname = new JTextField();
	      firstname.setColumns(10);
	      GroupLayout gl_panel = new GroupLayout(panel);
	      gl_panel.setHorizontalGroup(
	      	gl_panel.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panel.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	      				.addComponent(lblRewritePassword)
	      				.addComponent(lblEmail)
	      				.addComponent(lblLastName)
	      				.addComponent(lblPassword)
	      				.addComponent(lblName))
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	      				.addComponent(firstname, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
	      				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	      					.addComponent(email)
	      					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
	      						.addComponent(lastName, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
	      						.addComponent(password, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
	      						.addComponent(passwordRewrite, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
	      			.addContainerGap(48, Short.MAX_VALUE))
	      );
	      gl_panel.setVerticalGroup(
	      	gl_panel.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panel.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	      				.addComponent(lblName)
	      				.addComponent(firstname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	      				.addComponent(lblLastName)
	      				.addComponent(lastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	      				.addComponent(lblEmail)
	      				.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	      				.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      				.addComponent(lblPassword))
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	      				.addComponent(lblRewritePassword)
	      				.addComponent(passwordRewrite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addContainerGap(118, Short.MAX_VALUE))
	      );
	      panel.setLayout(gl_panel);
	      getContentPane().setLayout(groupLayout);
	      setVisible(true);
	      
	    }
	
		
	
	 public boolean isValidEmailAddress(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(email);
         return m.matches();
  }
}
