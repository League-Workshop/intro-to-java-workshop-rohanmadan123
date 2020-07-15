package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it.");
		// Get the user to enter an adjective
		String typeAdj = JOptionPane.showInputDialog("Enter an adjective");
		// Get the user to enter a type of liquid
		String typeLiquid = JOptionPane.showInputDialog("Enter a type of liquid");
		// Get the user to enter a body part
		String typeBodyp = JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
		String typeVerb = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
		String typePlace = JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String madlib = "Piranhas are more " + typeAdj + " during the day, so cross the river at \n"
				+ "night. Piranhas are more attracted to fresh " + typeLiquid + " and will most \n"
						+ "likely take a bit out of your " + typeBodyp + " if you " + typeVerb + ". Whatever \n"
								+ "you do, if you have an open wound, try to find another way to get \n"
								+ "back to the " + typePlace + ". Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, madlib);
		
		

	}
}

