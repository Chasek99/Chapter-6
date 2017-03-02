/**
 * 
 */
package youDoIt;

import javax.swing.JOptionPane;

/**
 * @author CK121642
 *
 */
public class randomguess {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int guess = 0;
		int result;
		String msg = null;
		final int LOW = 1;
		final int HIGH = 10;
		int counter = 0;
		
		result  = LOW + (int)(Math.random() * HIGH);
		while(result != guess)
		{
			guess = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Try to guess my number between " + LOW + " and " + HIGH));
			if(guess == result)
				msg = "\nRight!";
			else
				if(guess < result)
					msg = "\nYour guess was too low";
				else
					msg = "\nYour guess was too high";
				++counter;
		}
		JOptionPane.showMessageDialog(null,  "The number is " + result + msg + " in this many attempts " + counter);
		}
	}


