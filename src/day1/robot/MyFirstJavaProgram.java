package day1.robot;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.layout.BackgroundFill;

public class MyFirstJavaProgram {
	
	static Robot r2d2 = new Robot();
	
	static void drawShape(int sideLength, int xPos, int yPos, int numSides) {
		
		r2d2.setSpeed(10);
		
		r2d2.setX(xPos);
		r2d2.setY(yPos);
		
		r2d2.penDown();
		r2d2.setRandomPenColor();
		
		for (int i = 0; i < numSides; i++) {
			r2d2.move(sideLength);
			r2d2.turn(360/numSides);
		}
		
		r2d2.penUp();
		
	}
	
	static void drawStars(int sideLength, int xPos, int yPos, int numSides) {
		
		r2d2.setSpeed(10);
		
		r2d2.setX(xPos);
		r2d2.setY(yPos);
		
		r2d2.penDown();
		r2d2.setRandomPenColor();
		
		for (int i = 0; i < numSides; i++) {
			r2d2.move(sideLength);
			r2d2.turn(720/numSides);
		}
		
		r2d2.penUp();
		
	}

	public static void main(String[] args) {

		Robot.setWindowColor(153, 204, 255);
		
		int initialX = 500, initialY = 500, rotations = 20; 
		
		Random r = new Random();
		
		for (int p = 0; p < 100; p++) {
			drawStars(r.nextInt(150), r.nextInt(1800), r.nextInt(1000), 5);
			r2d2.turn(r.nextInt(360));
		}
		
		
		
/*		for (int j = 0; j < rotations; j++) {
			drawShape(100, initialX, initialY, 10);
			r2d2.turn(360/rotations);
		}
*/
		

	}
	

	
}
