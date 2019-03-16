
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "September 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
				String input=JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		// 4. if user asked for "mom"
			//print mom's birthday
				
				if (input.equals("mom")) {JOptionPane.showInputDialog("Your moms birthday is on January 24th!!");
				
				}
		// 5. if user asked for "dad"
			// print dad's birthday
				else if (input.equals("dad")) {JOptionPane.showInputDialog("Your dads birthday is on June 9th!!!!!");
				}
				
		// 6. if user asked for your name
				else if (input.equals("my birthday")) {JOptionPane.showInputDialog("Your birthday is on September 1st!!!!!!");
				}

				
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	
				else if (input.equals("any other birthday")) {JOptionPane.showInputDialog("Sorry I do not remember that birthday!!!!!");
				}
	
				
				
				
				
	} 
}