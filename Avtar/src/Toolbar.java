

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Toolbar extends JPanel implements ActionListener{

	
	private JButton logInButton;
	private JButton aboutProjectButton;
	private JButton intrestsButton;
	private JButton hobbiesButton;
	private JButton logOutButton;

	
	private StringListener textListener;

	public Toolbar() {
		
		//TODO set the button size
		logInButton = new JButton("Log In");
		aboutProjectButton = new JButton("About my project");
		intrestsButton = new JButton("My Academic Intrests");
		hobbiesButton = new JButton("My Hobbies");
		logOutButton = new JButton("Log Out");
		
		logInButton.addActionListener(this);
		aboutProjectButton.addActionListener(this);
		intrestsButton.addActionListener(this);
		hobbiesButton.addActionListener(this);
		logOutButton.addActionListener(this);
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		add(logInButton);
		add(aboutProjectButton);
		add(intrestsButton);
		add(hobbiesButton);
		add(logOutButton);
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == logInButton) {
			if(textListener != null) {
				
				//logInOptions();
				textListener.textEmitted(logInOptions());
				
			}
			
		}
		else if (clicked == aboutProjectButton) {
			if(textListener != null) {
				textListener.textEmitted("This is a fun DB project\n");
			}
			
		}
		else if (clicked == intrestsButton) {
			if(textListener != null) {
				textListener.textEmitted("Web Dev and software development\n");
			}
			
		}
		else if (clicked == hobbiesButton) {
			if(textListener != null) {
				textListener.textEmitted("Gym, Music and cooking\n");
			}
			
		}
		else if (clicked == logOutButton) {
			if(textListener != null) {
				textListener.textEmitted("Logged out... \nHave a nice day!\n");
			}
			
		}
	}
	
	private static String logInOptions() {
		String userType = "";
        String[] options = {"Student", "Profetor", "Admin"};
        JComboBox<String> combo = new JComboBox<>(options);
        JTextField userName = new JTextField("");
        JTextField password = new JTextField("");
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(combo);
        panel.add(new JLabel("User Name:"));
        panel.add(userName);
        panel.add(new JLabel("Password:"));
        panel.add(password);
        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println(combo.getSelectedItem()
                + " " + userName.getText()
                + " " + password.getText());
        } else {
            System.out.println("Cancelled");
        }
        
        userType =   "Logged In as: " + userName.getText() + "  (" + combo.getSelectedItem() +")";
        
        return userType;
    }
	
	
}
