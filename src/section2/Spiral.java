package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot fries = new Robot();
		// 5. Set your robot's pen down
		fries.penDown();
		// 3. Set the robot to go at max speed (10)
		fries.setSpeed(200);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			// 7. Change the pen color to random
			fries.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			fries.move(5 * i);
			// 2. Turn the robot 360/7 degrees to the right
			fries.turn(360 / 7);
			// 8. Set the pen width to i
			fries.setPenWidth(i);
		}
	}
}
