//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101)+1;
		// 2. Print out the random variable above
			System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
				String input=JOptionPane.showInputDialog(null, "Do you have a guess?");
				
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int answer=Integer.parseInt(input);
			// 5. if the guess is correct
				if (answer==random) {JOptionPane.showInputDialog(null, "Correct,You winnn!!!");
				}
				// 6. win
			// 7. if the guess is high
				if  (answer<random) {JOptionPane.showInputDialog(null,"Wrong,your answer is toooooooo high!!!");
				}
				// 8. tell them it's too high
				JOptionPane.showInputDialog(null, "Wrong,your answer is toooooooo high!!!");
			// 9. if the guess is low
				if  (answer>random) {JOptionPane.showInputDialog(null,"Wrong,your answer is toooooooo low!!!");
				}
				// 10. tell them it's too low
				JOptionPane.showInputDialog(null, "Wrong,your answer is toooooooo low!!!");
		// 12. tell them they lose
				JOptionPane.showInputDialog(null, "Wrong,you lose!!!");
	}	
}


