package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String name = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(name.equals("Yes")) {JOptionPane.showMessageDialog(null, "You will rule the World!"); }
		// 3. Otherwise, wish them good luck washing dishes.
else {JOptionPane.showMessageDialog(null, "Well good luck washing Dishes.");
	}
}
}
