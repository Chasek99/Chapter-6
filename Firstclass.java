/**
 * 
 */
package javafinal;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;
/**
 * @author Kress
 *
 */
public class Firstclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//**Backstory                             
		JOptionPane.showMessageDialog(null, "You were born into the safety of Vault 8, or its more popular name Vault City."
				+ "\nYou are 17 years old, over the course of your short period in life you have gained a name for yourself."
				+ "\nYou are known as The Wanderer. It is early April of the year 2227, 150 years after the world was laid to ruin by nuclear fire."
				+ "\nYou wish to leave due to your adventurous lifestyle, you step outside of your home, seeing the real world for the first time."
				+ "\nWhere will you go?");

		//Player name
		 JFrame frame = new JFrame("InputDialog Example #1");

		 String name = JOptionPane.showInputDialog(frame, "What's your name?");
		
	 
		//Weapons
		JOptionPane.showMessageDialog(null,   name + " grabs one weapon before he/she leaves. A 10mm pistol"					
		+ " \nWith 24 bullets. The player also gets 3 healing items, and a flashlight");
		
		
		//Story elements
		JOptionPane.showMessageDialog(null, "Before you leave one of the other citizens tell you about a town called Gecko to the north."
				+ " \nHe smirks at you and wishes you luck on your travels.");
		
		
		//The decision that determines the story path the player will follow
		String[] options = new String[] {"West", "North", "South"};
	    int response = JOptionPane.showOptionDialog(null, "What direction would you like to go?", "Player Choice",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    	
	    	

       if(response == 0)
       {
    	   ChoiceWest.main(args);
       }
       
       else if(response == 1)
       {
    	   North.main(args);
       }
       else
       {
    	   DirectionSouth.main(args);
	   }
	}
}
