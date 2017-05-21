package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot robot1 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		robot1.setSpeed(10);
		// 5. Set the pen width to 5
		robot1.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			robot1.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			robot1.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		// JOptionPane.showMessageDialog(null, "yay! you called the drawSquare()
		// method!");

		robot1.penDown();

		for (int j = 0; j < 4; j++) {
			robot1.move(100);
			robot1.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
