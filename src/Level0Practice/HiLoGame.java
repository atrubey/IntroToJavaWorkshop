package Level0Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class HiLoGame {
	public static void main(String[] args) {

		Random r = new Random();
		int guess;

		do {
			int randomNum1 = r.nextInt(20);

			guess = JOptionPane.showOptionDialog(null,
					"Will the next random number be higher or lower than " + randomNum1 + "? ", "Hi Lo Game", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Higher", "Lower", "Exit" }, null);

			int randomNum2 = r.nextInt(20);

			if (randomNum2 < randomNum1 && guess == 1) {
				JOptionPane.showMessageDialog(null, "Correct! The next number number was " + randomNum2 + ". ");
			} else if (randomNum2 > randomNum1 && guess == 0) {
				JOptionPane.showMessageDialog(null, "Correct! The next number number was " + randomNum2 + ". ");
			} else if (randomNum1 < randomNum1 && guess == 0) {
				JOptionPane.showMessageDialog(null, "Incorrect. The next number number was " + randomNum2 + ". ");
			} else if (randomNum2 > randomNum1 && guess == 1) {
				JOptionPane.showMessageDialog(null, "Incorrect. The next number number was " + randomNum2 + ". ");
			}

		} while (guess != 2);
	}

}
