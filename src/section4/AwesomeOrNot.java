package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below…
    int randNumber = new Random().nextInt(4);
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	// 3. Print out this variable
	System.out.println(randNumber);
	// 4. Get the user to enter something that they think is awesome
	String awesomeThing = JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
	if(randNumber==0) {
		JOptionPane.showMessageDialog(null, "I agree, " + awesomeThing + " is awesome.");
	}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
	if(randNumber==1) {
		JOptionPane.showMessageDialog(null, "I disagree, I think " + awesomeThing + " is ok.");
	}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
	if(randNumber==2) {
		JOptionPane.showMessageDialog(null, "I completely disagree, " + awesomeThing + " is super boring.");
	}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
	if(randNumber==3) {
		JOptionPane.showMessageDialog(null, "I guess " + awesomeThing + " is awesome, but I don't really like it.");
	}
	// -- write your own answer


}
}
