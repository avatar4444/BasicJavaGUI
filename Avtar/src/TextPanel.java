import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	public TextPanel() {
		
		textArea = new JTextArea(30, 60);
		
		setLayout(new FlowLayout());
		textArea.setEditable(true);
		textArea.setForeground(Color.cyan);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setFont(textArea.getFont().deriveFont(16f));
		
	    this.setFont(null);
	    
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		textArea.setText(text);
	}
}
