/**
 * 
 */
package firstpackage;
import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author CK121642
 *
 */
public class SouthChoice {

	/**
	 * @param argswhy 
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
		 int n = JOptionPane.showConfirmDialog(
		            null,
		            "Yes to serch the gas staion?",
		            "No to set up camp out side",
		            JOptionPane.YES_NO_OPTION);

		        if(n == JOptionPane.YES_OPTION)
		        {
		            JOptionPane.showMessageDialog(null, "You walk inside and turn on your flash light and begin yo search the area,"
		            		+ "\n you find a lockpick do you want to keep it?");
		        }
		        else {
		            JOptionPane.showMessageDialog(null, "You set up a fire out side, but you hear a noise");
		        }

		
		        
		        
		        
	}

}
