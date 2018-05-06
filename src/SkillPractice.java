import java.util.Random;

import javax.annotation.Generated;
import javax.lang.model.element.VariableElement;
import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String money = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(money);

		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " + (dimes * 10) + " cents");

		// Ask the user how tall they are (inches)
		String tall = JOptionPane.showInputDialog("How tall are you?");
		int height = Integer.parseInt(tall);

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (height < 36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties!");
		} else {
			JOptionPane.showMessageDialog(null, "You're a good height.");

		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 30; i++) {

			if (i % 3 == 0) {
				System.out.println(i);

			}
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random gen = new Random();
		int x = gen.nextInt(20);
		System.out.println(x);
		// Get another random number that is less than 10 and print it to the console
		int y = gen.nextInt(10);
		System.out.println(y);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, "The difference between those two numbers is " + (x - y));
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in Americ's Finest City
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
		}
		// Otherwise, tell them to move to San Diego
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego.");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		String car = JOptionPane.showInputDialog("How many cars does your family have?");
		int cars = Integer.parseInt(car);
		if (cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		if (cars == 1) {
			JOptionPane.showMessageDialog(null, "Your car is a 1998 Camry");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		if (cars > 1) {
			JOptionPane.showMessageDialog(null, "You have " + (cars * 4) + " wheels");
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("What school do you go to?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, school + " is a fantastic school.");
	}
}