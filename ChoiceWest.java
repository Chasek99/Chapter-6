/**
 * 
 */
package firstpackage;

import javax.swing.JOptionPane;

/**
 * @author CK121642
 *
 */
public class ChoiceWest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
	
		//Story elements 
				JOptionPane.showMessageDialog(null, "You give the citizen the finger, and head west.");
				
				JOptionPane.showMessageDialog(null, "You look out into the waste and see a giant radscorpion stabing"
						+ "\n your cousin with his stinger! ");
				//player choice
				 int n = JOptionPane.showConfirmDialog(
				            null,
				            "Yes to fight the scorpion?",
				            "No to turn around back to the vault",
				            JOptionPane.YES_NO_OPTION);

				        if(n == JOptionPane.YES_OPTION)
				        {
				            JOptionPane.showMessageDialog(null, "You attempt to fight the scorpion but that was a huge mistake."
				            		+ "\nThe scorpion stabs you instantly leaving you on the ground next to your cousin. "
				            		+ "\nYou wonder where you went wrong as you slowly die.  ");
				        }
				        else {
				            JOptionPane.showMessageDialog(null, "After running away like coward, "
				            		+ "\nYou live your life in the vault, regretting not trying to help your cousin."
				            		+ "\nYou die of natural causes at the age of 92.");
				        }
						
	}		     
	}


