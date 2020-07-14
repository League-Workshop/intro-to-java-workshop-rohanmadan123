package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		int distance = 250;
		
		Robot frank = new Robot();
		
		for (int i = 0; i < 4; i++) {
			frank.move(distance);
			frank.turn(90);

		}
		frank.setSpeed(100);
		frank.penDown();
		
		
		
		
		
		
	
		
		
	}
}
