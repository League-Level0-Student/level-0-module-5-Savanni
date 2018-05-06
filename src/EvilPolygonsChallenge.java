import java.awt.Color;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();
	
		// 2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "What color would you like?", "Color Selector",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Red", "Blue", "Green" }, 0);
		System.out.println(colorChoice); // 3 1 2
		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 1) {
			rob.setPenColor(0, 0, 255);
		}
		if (colorChoice == 2) {
			rob.setPenColor(0, 255, 0);
		} else {
			rob.setPenColor(255, 0, 0);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String polygon = JOptionPane.showInputDialog("How many polygons do you want?");
		int polygons = Integer.parseInt(polygon);

		// 5. Use the robot to draw the number of polygons the user requested.
		rob.penDown();
		for (int i = 0; i < polygons; i++) {
			rob.move(50);
			rob.turn(72);
			rob.move(50);
			rob.turn(72);
			rob.move(50);
			rob.turn(72);
			rob.move(50);
			rob.turn(72);
			rob.move(50);
			rob.turn(72);
			rob.penUp();
			
			rob.move(100);
			rob.penDown();
		}
		// 6. Make it so your shapes do not overlap
//done up there
		// 7. Challenge: add more colors to the Option Dialog.

	}
}
