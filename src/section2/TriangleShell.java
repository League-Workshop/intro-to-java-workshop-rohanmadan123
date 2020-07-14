package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot frank = new Robot();

	
	void go() {
		 // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		frank.setSpeed(100);
		frank.penDown();

		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;

		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {
			frank.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			frank.turn(6);
		}

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length variable by 10
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the robot 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		frank.move(length);
		frank.turn(60);
		frank.move(length);
		frank.turn(60);
		frank.move(length);
		frank.turn(60);
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
