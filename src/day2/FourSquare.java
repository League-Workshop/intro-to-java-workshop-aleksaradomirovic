package day2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot c3po = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		c3po.setSpeed(500);
		// 5. Set the pen width to 5
		c3po.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
		c3po.setRandomPenColor();
		
		
		// 7. Set the pen color to random
	
		drawSquare();
		c3po.turn(90);
		// 8. Turn the robot 90 degrees to the right
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
		c3po.setRandomPenColor();
		c3po.penDown();
		c3po.move(200);
		c3po.turn(90);
		}
		
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



