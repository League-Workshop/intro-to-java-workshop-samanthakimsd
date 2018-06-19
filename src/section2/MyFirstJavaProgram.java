package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot cream = new Robot();
		cream.sparkle();
		cream.penDown();
		cream.setPenColor(Color.pink);
		cream.setSpeed(150);
		for (int i = 0; i < 4; i++) {
			cream.move(150);
			cream.turn(90);
		}
		cream.penUp();
		cream.move(60);
		cream.penDown();
		cream.setPenColor(Color.orange);
		for (int i = 0; i < 4; i++) {
			cream.move(150);
			cream.turn(90);
		}
	}
}
