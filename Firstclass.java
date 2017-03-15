/**
 * 
 */
package firstpackage;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;

/**
 * @author CK121642
 *
 */
public class Firstclass {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		
		
	Scanner keyboard = new Scanner(System.in);	

	String choiceYes;
	String choiceNo;
	String Choice;
	String choiceNorth;
	String choiceSouth;
	String choiceWest;
	Scanner Input = null;
	

	
	
	
	//**Backstory                             
	JOptionPane.showMessageDialog(null, "You were born into the safety of Vault 8, or its more popular name Vault City."
			+ "\nCurrently you are 17 years, over the course of your short life you have gained a name for yourself."
			+ "\nYou are known as The Wanderer. It is early April of the year 2227, 150 years after the world was laid to ruin by nuclear fire. "
			+ "\nYou wish to leave due to your adventurous lifestyle, you step outside of your home, seeing the real world for the first time."
			+ "\nWhere will The Wanderer go?");

	//Player name
	 JFrame frame = new JFrame("InputDialog Example #1");

	 String name = JOptionPane.showInputDialog(frame, "What's your name?");
	
 
	
	//Weapons
	JOptionPane.showMessageDialog(null,   name + " grabs one weapon before he/she leaves. A 10mm pistol"					
	+ " \nWith 24 bullets. The player also gets 3 healing items(stimpacks), and a flashlight");
	

	
	
	//Resident tell you about a town.
	JOptionPane.showMessageDialog(null, "One of the other citizens of the vault tell you about a town called Gecko to the north."
			+ " \nHe smirks at you and wishes you luck on your travels.");
	

	
	JOptionPane.showMessageDialog(null, "What way would you like to go?"
										+ "\n To the west"
										+ "\n To the north"
										+ "\n Disregard the citizen and go south");
	
	
	
	
	
	 int n = JOptionPane.showConfirmDialog(
	            null,
	            "Press Yes to go North? No to go west. ",
	            "",
	            JOptionPane.YES_NO_OPTION);

	        if(n == JOptionPane.YES_OPTION)
	        {
	        	North.north();
	        }
	        if(n == JOptionPane.NO_OPTION)
	        {
	        	ChoiceWest.choiceWest();
	        }
	        else
	        {
	        	SouthChoice.Choicesouth();
	        }
	  
		
	
													

	
	
	
	

	
	

	
	}
	
	
	
	

}
