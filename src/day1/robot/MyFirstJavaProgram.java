package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		Robot r2d2 = new Robot();

		r2d2.setSpeed(10);
		r2d2.penDown();
		r2d2.move(100);
		r2d2.turn(90);
		r2d2.move(100);
		r2d2.turn(90);
		r2d2.move(100);
		r2d2.turn(90);
		r2d2.move(100);

		r2d2.turn(90);
		r2d2.penUp();

		r2d2.moveTo(100, 600);

		r2d2.penDown();
		r2d2.move(100);

	}
}
