import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = JOptionPane.showInputDialog("Tell me a number!");
		int idea = Integer.parseInt(number);
		boolean isPrime = true;
		for (int i = 2; i < idea; i++) {
			if (idea % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			JOptionPane.showMessageDialog(null, "It's prime!");
		}

		else {
			JOptionPane.showMessageDialog(null, "It's not prime.");
		}

	}
}
