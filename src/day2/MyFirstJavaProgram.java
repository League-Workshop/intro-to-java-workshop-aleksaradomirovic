package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot r = new Robot();
		
		int angle = 45;
		r.setSpeed(20);
		r.penDown();
		
		while(true) {
			for(int i = 0; i < 8;) {
				r.move(100);
				r.turn(angle);
				i++;
			}
			angle = -angle;
		}
	}
}
