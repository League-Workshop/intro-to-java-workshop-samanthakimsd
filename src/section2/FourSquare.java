package section2;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot icee = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		icee.setSpeed(200);
		// 5. Set the pen width to 5
		icee.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		icee.penDown();
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random

			icee.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();

			// 8. Turn the robot 90 degrees to the right
			icee.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			icee.move(150);
			icee.turn(90);

		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}
}
