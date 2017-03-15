/**
 * 
 */
package firstpackage;

import java.awt.Component;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author CK121642
 *
 */
public class North {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Component frame = null;
		
		
		
		//Story elements 		
		JOptionPane.showMessageDialog(null, " You head the direction the citizen pointed you towards");
						
		JOptionPane.showMessageDialog(null, "You bring supplies with you when heading north, you know it will be some time before you find anything."
								+ "\nTwo days of walking later, you see a town in the distance,"
								+ "\nyou hear the tick of your Geiger counter as you come closer,"
								+ "\nbut the amount of radiation is not harmful."
								+ "\nYou enter the town, promptly called Gecko."
								+ "\nA man with a horridly disfigured face asks you to assist him with something.");
		
		
	     // player choice being made
		 String[] options = new String[] {"Yes", "No", "Other"};
		    int response = JOptionPane.showOptionDialog(null, "Do you choose to do so?", "Player Choice",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
		    	
		    	
		
	

	       if(response == 0){
	    	   JOptionPane.showMessageDialog(null, "The man thanks you hysterically."
	           		+ "\nHe tells you to head north to a town called Abbey."
	           		+ "\nHe states that the town is occupied by a few raiders that have killed all the residents of the town.");
	       }
	       
	       else if(response == 1){
	    	   JOptionPane.showMessageDialog(null, "The man frowns, but he perks up, looking into your soul, seeing your enthusiasm for adventure."
	           		+ " He points to the south-west an tells you there is a city called New Reno, and the area is amazing if you wish to explore.");
	    	   JOptionPane.showMessageDialog(null, "The player heads to New Reno");
	    	   JOptionPane.showMessageDialog(null, "You walk and walk for days, running low on supplies."
	    	   		+ "\nYou set up camp for the evening, and you see the bright glow of the city that you have been looking for...");
	       }
	       else{
	    	   JOptionPane.showMessageDialog(null,"You aim your 10mm pistol at his head and blow his brains out."
	           		+ "\nThe towns residents rush you, tackling you to the ground, and bludgeoning you until your skull is crushed,"
	           		+ "\n leaving grey matter and a large pool of blood on the ground.");
	           JOptionPane.showMessageDialog(null, "You Died");
	}
		
	}		
		


	public static void north()
	{
		
				

	}
}
