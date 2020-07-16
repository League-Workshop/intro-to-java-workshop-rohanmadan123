package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		
		// 2.  Ask the user a question 
		String fastMan = JOptionPane.showInputDialog("Who is the fastest man in the world?");
		String fastManAnswer = "Usain Bolt";
		// 3.  Use an if statement to check if their answer is correct
		if(fastMan.equalsIgnoreCase(fastManAnswer)) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			userScore += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is Usain Bolt");
		}
		// 4.  if the user's answer was correct, add one to their score 
		String bestSell = JOptionPane.showInputDialog("What is the best selling video game?");
		String bestSeller = "Minecraft";
		if(bestSell.equalsIgnoreCase(bestSeller)) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			userScore += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is Minecraft");
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Thank you for playing! Your score was " + userScore + ".");
		
	}
}
