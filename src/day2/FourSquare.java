package day2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	Robot r = new Robot();

	void go() {
		r.setSpeed(200);
		r.setPenWidth(5);
		
		for(int i = 0; i < 4; i++) {
			r.setRandomPenColor();
			drawSquare();
			r.turn(90);
		}
	}

	void drawSquare() {
		
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		r.penDown();
		for(int i = 0; i < 4; i++) {
			r.move(200);
			r.turn(90);
		}
		r.penUp();
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



