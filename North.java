/**
 * 
 */
package javafinal;
import javax.swing.JOptionPane;
/**
 * @author Kress
 *
 */
public class North {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		
		//Story elements 		
		JOptionPane.showMessageDialog(null, "You head the direction the citizen pointed you towards");
						
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
	    	   				JOptionPane.showMessageDialog(null, "You approach the compound, seeing the guards outside you hide behind the wall in front of you."
	    	   					+ "\nYou look at the wall and see it riddled with bullet holes and arrows.");
	    	   				JOptionPane.showMessageDialog(null, "You flank around the guards, covering your tracks."
	    	   						+ "\nYou come up behind the guard with a sniper and slit his throat, taking this rifle."
	    	   						+ "\nThe man chokes on his own blood, trying to say something while you take aim at the other raiders. "
	    	   						+ "\nWhich raider do you with to shoot at first? ");
	    	   				
	    	   							//another player choice		
	    	   							String[] options1 = new String[] {"Large brute with a mingun", "Small agile looking man with two combat knifes.", "Other"};
	    	   							int response1 = JOptionPane.showOptionDialog(null, "What do you do?", "Player Choice",
	    	   							JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	    	   							null, options1, options1[0]);
	    	   				
	    	   							if(response1 == 0)
	    	   							{
	    	   								JOptionPane.showMessageDialog(null, "You fire at the large man, hitting him in the back of the head, killing him instantly,"
	    	   										+ "\nhis grey matter spattering all the other the wall.The smaller man is alerted by your shot, running your way."
	    	   										+ "\nYou aim at the smaller man, pulling the trigger, all you here is a click: Out of ammo.");
	    	   								JOptionPane.showMessageDialog(null, "The smaller man rushes you, tackling you to the ground, hitting you relentlessly in the face and body.");
				    	   					
	    	   								//another player choice		
					    	   							String[] options2 = new String[] {"Bare the hits, and wait for the perfect time to strike.", "Leave yourself open, and reach for your gun."};
					    	   							int response2 = JOptionPane.showOptionDialog(null, "What do you do?", "Player Choice",
					    	   							JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					    	   							null, options2, options2[0]);
					    	   							
					    	   							if(response2 == 0)
					    	   							{
					    	   								JOptionPane.showMessageDialog(null, "You see your chance to strike, you ready yourself to throw a jab. "
					    	   										+ "\n*crack*The man falls to the ground, dead."
					    	   										+ "You get up wondering where it was from. Crouched down, you exit the compound.");
					    	   								JOptionPane.showMessageDialog(null,"You head back to Gecko, greeting the man whom gave you your mission."
					    	   										+ "\nHe thanks you for your help, handing you 1,000 bottle caps, and he tells you that his name is Harold."
					    	   										+ "\nYou look at the caps you just recieved, wondering what you will do. Harold suggests that you go to New Reno."
					    	   										+ "\nHe also tells you that New Reno is quite a walk, and that it may take you a few weeks to get there."
					    	   										+ "\nBefore you leave,  he winks at you tell you to watch your back out there, and that those smaller men are dangerous."
					    	   										+ "\nYou start heading to New Reno, excited that you are about to start a whole now adventure.");
					    	   								
					    	   							}
					    	   							else if(response2 == 1)
					    	   							{
					    	   								JOptionPane.showMessageDialog(null,"You leave yourself open as you reach for your flashlight."
					    	   										+ "\nThe man hit your in the head with a blunt object, knocking you unconscious."
					    	   										+ "\nYou wake up some time later. You see that you're in a jail cell"
					    	   										+ "\nThe guard says you're never getting out"
					    	   										+ "\nYou eventually die of starvation...");
					    	   								
					    	   								
					    	   							}
		    	   							
	    	   							}
	    	   							else if(response1 == 1)
	    	   							{
	    	   								JOptionPane.showMessageDialog(null, "You fire at the smaller man, the bullet piercing his chest, going through his heart."
	    	   										+ "\nHe collapses to the ground. The brutish man aims his minigun in your direction, hitting you in the head."
	    	   										+ "\nYou are knocked down, extremely dazed, but somehow still awake. (Thud thud) The large man is coming up toward you. "
	    	   										+ "\nWhat do you do?");
	    	   				 
	    	   											//player choice
	    	   											String[] options2 = new String[] {"Inject a few stimpacks, and get up and fight.", "Try your best"};
	    	   											int response2 = JOptionPane.showOptionDialog(null, "What do you do?", "Player Choice",
	    	   											JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	    	   											null, options2, options2[0]);
	    	   											
	    	   											if(response2== 0)
	    	   		    	   							{
	    	   		    	   								JOptionPane.showMessageDialog(null, "You stand up, the man comes into your vision, he is charging at you."
	    	   		    	   									+ "\nYou take aim, and prepare for the worst. He trips and falls off the side the building.");
	    	   		    	   								JOptionPane.showMessageDialog(null, "You head back to Gecko, greeting the man whom gave you your mission."
	    	   		    	   										+ "\nHe thanks you for your help, handing you 1,000 bottle caps, and he tells you that his name is Harold."
	    	   		    	   										+ "\nYou look at the caps you just recieved, wondering what you will do. Harold suggests that you go to New Reno."
	    	   		    	   										+ "\nHe also tells you that New Reno is quite a walk, and that it may take you a few weeks to get there."
	    	   		    	   										+ "\nYou start heading to New Reno, excited that you are about to start a whole new adventure.");

	    	   		    	   							}
	    	   		    	   							else if(response1== 1)
	    	   		    	   							{
	    	   		    	   								JOptionPane.showMessageDialog(null, "You lay there and you give it your best effort!");
	    	   		    	   								JOptionPane.showMessageDialog(null, "You still die...");
	    	   		    	   							}	 		
	    	   				
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

	}

}

