package Level0Practice;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		
		String question1 = JOptionPane.showInputDialog("Are you happy?");
		
		if (question1.equals("yes") || question1.equals("Yes") || question1.equals("YES")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else if (question1.equals("NO") || question1.equals("No") || question1.equals("no")) {
			String question2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (question2.equals("yes") || question2.equals("Yes") || question2.equals("YES")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else if (question2.equals("NO") || question2.equals("No") || question2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			} else {
				JOptionPane.showMessageDialog(null, "What kind of answer is that?");
			}
		} else {
			JOptionPane.showMessageDialog(null, "What kind of answer is that?");
		}

	}
	
	
	
}
