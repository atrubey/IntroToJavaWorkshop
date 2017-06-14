package Level0Practice;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/**
 * FriendlyRobots: This recipe creates 2 robots in opposite corners of the
 * canvas, and moves them a random distance towards each other until they
 * overlap.
 * 
 *
 */
public class FriendlyRobots {
	// Starting positions
	int xPosLeft = 50;
	int yPosTop = 50;
	int xPosRight = 1700;
	int yPosBottom = 875;

	int maxNumGames = 30;
	int maxMoves = 200;

	public FriendlyRobots() {

		// 1. Create and initialize 2 robots.

		Robot robot1 = new Robot();
		Robot robot2 = new Robot();

		int moveCounter = 0;
		int answer;
		boolean repeat;

		// 2. fill in the steps(a,b, and c) in the setupRobot method.

		// 3. call the setupRobot method using your two robots.

		setupRobot(robot1, Color.green);
		setupRobot(robot2, Color.magenta);

		// 4. Move robots back to the top-right and bottom-left corners
		do {
			robot1.setX(xPosLeft);
			robot1.setY(yPosTop);
			robot2.setX(xPosRight);
			robot2.setY(yPosBottom);

			// 5. do steps 6-7 repeatedly.

			do {
				// 6. use both seek methods below to have the robots find each
				// other.
				// Note that you will need to do this for both of your robots.
				seekX(robot1, robot2);
				seekY(robot1, robot2);
				seekX(robot2, robot1);
				seekY(robot2, robot1);
				moveCounter++;

				// 7.Use the method below to check if robot friends have found
				// each
				// other
				repeat = foundFriend(robot1, robot2);

			} while (!repeat);

			// 8. if the robots have found each other make them sparkle and
			// dance.
			if (foundFriend(robot1, robot2) == true) {
				for (int i = 0; i < 15; i++) {
					robot1.sparkle();
					robot1.turn(20);
					robot1.turn(-20);

					robot2.sparkle();
					robot2.turn(20);
					robot2.turn(-20);
				}
				robot1.unSparkle();
				robot2.unSparkle();

			}
			// 9. print out the number of times the robots had to move before
			// the
			// found each other.
			JOptionPane.showMessageDialog(null, "The robots moved " + moveCounter + " times to find each other. \n");

			// 10. use a confirmDialog to ask the user if they want to play
			// again.
			// repeat the game until the user says no.

			answer = JOptionPane.showOptionDialog(null, "Do you want to play again? ", "Play again?", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);
		} while (answer != 1);
	}

	private void setupRobot(Robot robot, Color robotColor) {
		// a. set the speed of the robot
		robot.setSpeed(10);
		// b. set the pen color
		robot.setPenColor(robotColor);
		// c. put the pen down.
		robot.penDown();
	}

	private void seekX(Robot robot, Robot otherRobot) {
		// Move robot a random X distance towards otherRobot
		if (robot.getX() < otherRobot.getX()) {
			robot.setAngle(90);
			robot.move(new Random().nextInt(100));
		} else if (robot.getX() > otherRobot.getX()) {
			robot.setAngle(-90);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getX() > xPosRight)
			robot.setX(xPosRight);
		else if (robot.getX() < xPosLeft)
			robot.setX(xPosLeft);
	}

	private void seekY(Robot robot, Robot otherRobot) {
		// Move robot a random Y distance towards otherRobot
		if (robot.getY() < otherRobot.getY()) {
			robot.setAngle(180);
			robot.move(new Random().nextInt(100));
		} else if (robot.getY() > otherRobot.getY()) {
			robot.setAngle(0);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getY() > yPosBottom)
			robot.setY(yPosBottom);
		else if (robot.getY() < yPosTop)
			robot.setY(yPosTop);
	}

	private Boolean foundFriend(Robot robot1, Robot robot2) {
		// Check whether robots are within 10 pixels of each other
		if (Math.abs(robot1.getX() - robot2.getX()) < 10 && Math.abs(robot1.getY() - robot2.getY()) < 10)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		new FriendlyRobots();
	}
}