import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginFrame extends JFrame implements ActionListener {

	JFrame frame;
	JButton submit,cencel;
	JPanel panel;
	JLabel user_label,password_label,message;
	JTextField Username_text;
	JPasswordField password_text;
	LoginFrame(){
		user_label=new JLabel();
		user_label.setText("Username :");
		Username_text=new JTextField();
		
		password_label = new JLabel();
		password_label.setText("Password :");
		password_text=new JPasswordField();
		
		submit=new JButton("Submit");
		
		panel= new JPanel(new GridLayout(3,1));
		
		panel.add(user_label);
		panel.add(Username_text);
		panel.add(password_label);
		panel.add(password_text);
		
		message = new JLabel();
		
		panel.add(message);
		panel.add(submit);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		submit.addActionListener(this);
		add(panel,BorderLayout.CENTER);
		setTitle("Login");
		setSize(450, 350);
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String Username=Username_text.getText();
		String Password=password_text.getText();
		if(Username.trim().equals("admin")&&Password.trim().equals("admin")) {
			message.setText("hello"+Username);
		}else {
			message.setText("Invalid Password..");
		}		
	}

}
