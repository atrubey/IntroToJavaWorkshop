package Level0Practice;

import javax.swing.JOptionPane;

public class ChangeCalculator {
	public static void main(String[] args) {
		
		String stringPennies = JOptionPane.showInputDialog("Enter the number of pennies you have: ");
		int numPennies = Integer.parseInt(stringPennies); 
		
		String stringNickles = JOptionPane.showInputDialog("Enter the number of nickles you have: ");
		int numNickles = Integer.parseInt(stringNickles); 

		String stringDimes = JOptionPane.showInputDialog("Enter the number of dimes you have: ");
		int numDimes = Integer.parseInt(stringDimes); 
		
		String stringQuarters = JOptionPane.showInputDialog("Enter the number of quarters you have: ");
		int numQuarters = Integer.parseInt(stringQuarters); 
		
		int totalCents;
		totalCents = numPennies*1 + numNickles*5 + numDimes*10 + numQuarters*25; 
		
		double totalDouble = (double)totalCents / 100; 
		
		String output = "You have " + numPennies + " pennies, " + numNickles + " nickles, " + numDimes + " dimes, and " + numQuarters + " quarters. \nThe total amount of money you have is $" + totalDouble + ". ";
		
		JOptionPane.showMessageDialog(null, output);
	}
	
}
