package day5;
import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// 1. Make a new robot, and set it's pen down.
		Robot robot1 = new Robot();
		robot1.penDown();
		
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		  robot1.setX(850);
		  robot1.setY(300);
		// *15. Make some adjustments to see what other kinds of shapes you can make.
		  robot1.setPenWidth(20);
		// 12. Set the robot speed to 10
			robot1.setSpeed(10);
		// 13. Make all the code below repeat 25 times
			for (int i = 0; i < 13; i++) {
				robot1.setRandomPenColor();
			// 2. Turn the robot 1/8 of a circle
				robot1.turn((1/8)*360);
			// 3. Move the robot 64 pixels
				robot1.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
				robot1.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
				robot1.move(flameSize);
			// 6. Turn the robot 170 degrees
				robot1.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
				robot1.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
				robot1.turn(64);
			// 9. Move the robot the distance in the variable baseSize
				robot1.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
			}
	}

}


