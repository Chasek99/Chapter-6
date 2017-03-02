/**
 * 
 */
package Triangle;
import java.util.Scanner;
import java.math.*;
/**
 * @author CK121642
 *
 */
public class rightTriangle {

	private static Scanner input;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String choiceYes;
		int response;
		 
		
	do{	
		input = new Scanner(System.in);
		System.out.println(" Which side of the triangle do you need to solve, A, B, OR C?>>>>>> ");
		choiceYes = input.nextLine(); // saying that you want solve for a side of a triangle.
		if ("A".equals(choiceYes))
		{
			aside();
		}
		if ("B".equals(choiceYes))
		{
			bside();
		}
		if ("C".equals(choiceYes))
		{
			cside();
		}
		System.out.print(" Press one to continue or any other number to quit. >> ");
  	  	response = input.nextInt();
		
		}while(response == 1);
	}
	
	public static void aside()
	{
		double userEntryC, userEntryB, answerA;
		System.out.print(" Please enter a number for side C>>>>");
		userEntryC = input.nextInt();
		
		System.out.print(" Please enter a number for side B>>>>");
		userEntryB = input.nextInt();
		answerA = Math.sqrt(userEntryC * userEntryC - userEntryB * userEntryB);
		System.out.print(answerA);
		
	}
	public static void bside()
	{
		double userEntryC, userEntryA, answerB;
		System.out.print(" Please enter a number for side C>>>>");
		userEntryC = input.nextInt();
		
		System.out.print(" Please enter a number for side A>>>>");
		userEntryA = input.nextInt();
		answerB = Math.sqrt(userEntryC * userEntryC - userEntryA * userEntryA);
		System.out.print(answerB);
	}
	public static void cside()
	{
		double userEntryA, userEntryB, answerC;
		System.out.print(" Please enter a number for side A>>>>");
		userEntryA = input.nextInt();
		
		System.out.print(" Please enter a number for side B>>>>");
		userEntryB = input.nextInt();
		answerC = Math.sqrt(userEntryA * userEntryA - userEntryB * userEntryB);
		System.out.print(answerC);
	}
}
