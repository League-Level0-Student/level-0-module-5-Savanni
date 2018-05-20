import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotStuff {
	public static void main(String[] args) {
		name();
	}
	public static void name() {
		Robot r2d2 = new Robot();
		r2d2.setPenWidth(10);
		r2d2.penDown();
		r2d2.setSpeed(10);
		String colors = JOptionPane.showInputDialog("What color would you like?");
		if (colors.equals("red")) {
			r2d2.setPenColor(Color.red);
		}
		else if (colors.equals("orange")) {
			r2d2.setPenColor(Color.orange);
		}
		else if (colors.equals("yellow")) {
			r2d2.setPenColor(Color.yellow);
		}
		else if (colors.equals("green")) {
			r2d2.setPenColor(Color.green);
		}
		else if (colors.equals("blue")) {
			r2d2.setPenColor(Color.blue);
		}
		else if (colors.equals("purple")) {
			r2d2.setPenColor(Color.MAGENTA);
		}
		String shapes = JOptionPane.showInputDialog("How many shapes would you like?");
		
		int shapenum = Integer.parseInt(shapes);
		
		for (int i = 0; i < shapenum; i++) {
			for (int j = 0; j < 4; j++) {
				r2d2.move(100);
				r2d2.turn(90);
			}
		r2d2.move(150);
		}
		
	}

}
