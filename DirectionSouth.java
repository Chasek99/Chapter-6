/**
 * 
 */
package javafinal;

import javax.swing.JOptionPane;

/**
 * @author Kress
 *
 */
public class DirectionSouth {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "You choose to disregard the citizin and head south.");

		JOptionPane.showMessageDialog(null, "After a long day of traveling you come across a destroyed gas station.");
		
		
				//First player choice for this direction
						 String[] options = new String[] {"Search the gas station", "Set up camp outside", "Other"};
						    int response = JOptionPane.showOptionDialog(null, "What do you want to do", "Player Choice",
						        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
						        null, options, options[0]);   
				
									    if(response == 0)
									    {//if the player chooses to search the gas station the program will run through that story option
									    	JOptionPane.showMessageDialog(null,"You walk inside and turn on your flash light and begin yo search the area, you find a lockpick do you want to keep it?");
									    	 String[] options1 = new String[] {"Yes", "No",};
											    int response1 = JOptionPane.showOptionDialog(null, "Do Want it?", "Player Choice",
											        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
											        null, options1, options1[0]);   
								    
														    if(response1 == 0)
														    {
														    	JOptionPane.showMessageDialog(null, "You now have a lockpick");
														    	JOptionPane.showMessageDialog(null, "You continue to explore the gas station and you enter the garage area.");
														    	JOptionPane.showMessageDialog(null, "There's a giant rat in the garage it starts to run towards you. ");
														    	
														    	JOptionPane.showMessageDialog(null,"Do you want to shoot it?");
														    	 String[] options2 = new String[] {"Yes", "No",};
																    int response2 = JOptionPane.showOptionDialog(null, "Do Want it?", "Player Choice",
																        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
																        null, options2, options2[0]);   
															    	
																	    if(response2 == 0)
																	    {
																	    	JOptionPane.showMessageDialog(null, "You hit the rat and it dies. You set up camp in the garage and go to sleep. ");
																	    	JOptionPane.showMessageDialog(null, "The next morning you continue on your journey until you come across a raider camp.  ");
																	    	JOptionPane.showMessageDialog(null, "You sneak your way inside and you find a locked door?  ");
																	    	JOptionPane.showMessageDialog(null, "You open it to discover a minigun! Do you keep it? ");
																		    	
																		    	 String[] options3 = new String[] {"Yes", "No",};
																				    int response3 = JOptionPane.showOptionDialog(null, "Do Want it?", "Player Choice",
																				        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
																				        null, options3, options3[0]);  
																				    
																				    if(response3 == 0)
																				    {					    
																				    	JOptionPane.showMessageDialog(null, "You continue looking around until a raider spots you!  ");
																				    	JOptionPane.showMessageDialog(null, "The raider alerts his friends ");
																				    	JOptionPane.showMessageDialog(null, "The raiders stand no chance with you and your minigun. You lay waste to them all."
																				    			+ "\nYou continue your journey after discovering the raiders were heading to a city call New Reno."
																				    			+ "\nYou decide to head there yourself. Its gonna be a long journey though...");
																				    }
										    else if(response3 == 1)
												   {
												    	JOptionPane.showMessageDialog(null, "You continue looking around until a raider spots you!  ");
												    	JOptionPane.showMessageDialog(null, "The raider alerts his friends and the shear numbers overwhelm you."
												    			+ "\nThe raiders wear you down and eventually  and kill you.   ");
												    }
										    		
										    }
										    else if(response2 == 1)
										    {
										    	JOptionPane.showMessageDialog(null, "It jumps on your face and starts attacking you. The rat eventually kills you. You should've just shot it...");
										    }
								    	
								    	
								    }
								    else if(response1 == 1)
								    {
								    	JOptionPane.showMessageDialog(null, "You don't have a lockpick");
								    	JOptionPane.showMessageDialog(null, "You continue to explore the gas station and you enter the garage area");
								    	JOptionPane.showMessageDialog(null, "There's a giant rat in the garage it starts to run towards you. do you want to shoot it? ");
								    	 String[] options2 = new String[] {"Yes", "No",};
										    int response2 = JOptionPane.showOptionDialog(null, "What do you do?", "Player Choice",
										        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
										        null, options2, options2[0]); 
										    if(response2 == 0)
										    {
										    	JOptionPane.showMessageDialog(null, "You hit the rat and it dies. You set up camp in the garage and go to sleep. ");
										    	JOptionPane.showMessageDialog(null, "The next morning you continue on your journey until you come across a raider camp.  ");
										    	JOptionPane.showMessageDialog(null, "You sneak your way inside and you find a locked door? ");
										    	JOptionPane.showMessageDialog(null, "You cannot pick the door ");
										    	JOptionPane.showMessageDialog(null, "You continue looking around until a raider spots you!  ");
										    	JOptionPane.showMessageDialog(null, "The raider alerts his friends and the shear numbers overwhelm you."
										    			+ "\nThe raiders wear you down and eventually  and kill you.  ");
										    }
										    
										    
										    else if(response2 == 1)
										    {
										    	JOptionPane.showMessageDialog(null, "It jumps on your face and starts attacking you. The rat eventually kills you. You should've just shot it...");
										    }
										    	
								    	
								    }
						    			
						    }
							//The option for if the player chooses to set up camp instead of searching the gas station
						    else if(response == 1)
						    {
						    	JOptionPane.showMessageDialog(null, "You start a fire and you hear a noise ");
						    	JOptionPane.showMessageDialog(null, "A Death claw appears out of no where");
						    	String[] options2 = new String[] {"Try to run", "Try ro fight",};
							    int response2 = JOptionPane.showOptionDialog(null, "What do you do?", "Player Choice",
							        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
							        null, options2, options2[0]); 
							    		if(response2 == 0)
							    		{
							    			JOptionPane.showMessageDialog(null, "You take off to a promising start but the creature is too fast and eventually catches up."
							    					+ "\nIt kills you. You should did more cardio... ");
							    		}
							    		else if(response2 == 1)
							    		{
							    			JOptionPane.showMessageDialog(null, "You didn't stand a chance, you should of went inside. The Death claw kills you instantly...   ");
							    		}
						    	
						    	
						    	
						    }
							// 3rd player option(just for fun)
						    else
						    {
						    	JOptionPane.showMessageDialog(null, "You just sit there all night and eventually freeze to death");
						    }
		 
	}
	
	


	}


