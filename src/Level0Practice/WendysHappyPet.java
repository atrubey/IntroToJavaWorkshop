package Level0Practice;

import javax.swing.JOptionPane;

public class WendysHappyPet {

		// 2. Create a happinessLevel variable to store the pet's happiness number.
		//    Initialize to zero.
		static int happinessLevel = 0;

		public static void main(String[] args) {
			// 1. Ask the user what kind of pet they want to buy, and store in variable
			String petType = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
			
			// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			do {
				// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
				//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
				//    Make sure to customize the title and question too.
				int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy? ", "Tasks", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Cuddle", "Food", "Take a Walk" }, null);

				// 5. Use user input to call the appropriate method created in step 4.
				if (task == 0) {
					cuddleOption();
				} else if (task == 1) {
					foodOption();
				} else if (task == 2) {
					walkOption();
				}
				
				
				// 6. If you determine the happiness level is large enough, tell the
				//    user that he loves his pet and use break; to exit for loop.
			} while(happinessLevel < 15); 
			
			JOptionPane.showMessageDialog(null, "Your " + petType + " is completely happy now!");
		}

		// 4. Create methods to handle each of your user selections.
		//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
		//    and INCREMENT the pet's happiness Level
		
		static void cuddleOption() {
			
			JOptionPane.showMessageDialog(null, "Your pet is happier now. ");
			
			happinessLevel += 2;
		}
		
		static void foodOption() {
			
			JOptionPane.showMessageDialog(null, "Your pet is no longer hungry and happier now. ");
			
			happinessLevel += 5;
		}
	
		static void walkOption() {
			
			JOptionPane.showMessageDialog(null, "Your pet is tired and happier now. ");
			
			happinessLevel += 3;
		}
	
	
}
