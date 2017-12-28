package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	static String query(String type) {
		String answer = JOptionPane.showInputDialog("Give me a " + type + ":");
		
		return answer;
	}
	
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "''If you happen to find yourself in a zombie apocalypse, here's how to survive''");
		
		String noun1 = query("noun");
		String noun2 = query("plural noun");
		String noun3 = query("plural noun");
		String noun4 = query("plural noun");
		
		String adj1 = query("adjective");
		
		String verb1 = query("infinitive verb");
		
		
		String paragraph = ("First of all, find a safe and secure "+noun1+". This is important if you are to survive. "+noun2+" and "+noun3+" are the biggest priority, and are "+adj1+" if you and your "+noun4+" are to survive. In fact, find a group of "+noun4+" to "+verb1+" with until the apocalypse ends.");
		
		JOptionPane.showMessageDialog(null, paragraph);

		// Fit the user's words into this sentence, and save it in a String:
		// 
		
		/* First of all, find safe and secure [noun1]. This is important if you are 
		 * to survive. [noun2] and [noun3] are the biggest priority, and are [adjective1]
		 * if you and your [noun4] are to survive. In fact, find a group of [noun4] to
		 * [verb1] until the apocalypse ends.
		 */
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

