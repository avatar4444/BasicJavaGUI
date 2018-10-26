/*
 * Created By: Avtar Singh
 * Date: 09/15/2018
 * 
 * This is a basic GUI layout for my Database Project
 * Database section to be implemented
 * 
 *Happy Coding :)
 * 
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
				
			}
		
		});
		
	}

}
