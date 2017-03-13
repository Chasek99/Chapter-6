/**
 * 
 */
package firstpackage;
import java.awt.Component;
import java.util.Scanner;

import javax.swing.*;
/**
 * @author CK121642
 *
 */
public class ChoiceSouth {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);	
		
		
		Scanner Input = null;
		Component frame = null;
		String name;
		String answer = null;
		String yes = null;
		String no = null;
		
		
		//Story elements 
		JOptionPane.showMessageDialog(null, "You choose to disregard the citizen and head south.");

		JOptionPane.showMessageDialog(null, "After a long day of traveling  you come across a destroyed gas station");
		
		JOptionPane.showMessageDialog(null, "What do you want to do? Set up camp outside or"
				+ "\n Search the gas station");
		
		//player choice being made
		 JFrame frame1 = new JFrame("InputDialog Example #1");

		String name1 = JOptionPane.showInputDialog(frame, "What do you want to do?"
				+ "\n  Yes to search the gas station. No to set up camp outside. ");
		
			
			if(answer ==yes)
			{
				JOptionPane.showMessageDialog(null, "You choose to search the gas station");
			}
			else if(answer ==no)
			{
				JOptionPane.showMessageDialog(null, "You choose to set up camp outside");
			}
			
			//story continued after choice
			if(answer ==yes)
			
			 JOptionPane.showMessageDialog(null, "You walk inside and turn on your flash light and begin to search the area,"
					+ "\n you find a lockpick!");
			
			 JFrame frame2 = new JFrame("InputDialog Example #1");
			 String name2 = JOptionPane.showInputDialog(frame, "Do you want to keep it?");
			
			if (answer ==yes)
			{	
				 JOptionPane.showMessageDialog(null, "you now have a lock pick.");
			}
			else if (answer ==no)
			{
				JOptionPane.showMessageDialog(null, "you do not have a lock pick.");
			}
	}

}
