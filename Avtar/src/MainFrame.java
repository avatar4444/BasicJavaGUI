import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private JButton btn;
	private Toolbar toolbar;

	public MainFrame() {
		super("DB Project");
		
		setLayout(new BorderLayout());
		 
		toolbar = new Toolbar();
		textPanel  = new TextPanel();
		
		toolbar.setStringListener(new StringListener() {

			public void textEmitted(String text) {
				textPanel.appendText(text);
				
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
