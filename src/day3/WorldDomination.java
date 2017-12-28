package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String query = JOptionPane.showInputDialog("Do you know how to code?");
		
		if(query.equals("yes") || query.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You will aspire to take over the world!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You will be purged along with the rest of the computer-illiterate population once the coders take over.");
		}
	}
}

