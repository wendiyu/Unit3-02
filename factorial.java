/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: April 2018
 * Created for: ICS4U
 * This program is to recursive factorial program
 *
 ****************************************************************************/

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Please! Enter a positive integer (greater than 0): ");
		
		if(userInput.hasNextInt()) {
			
			int fatoriNumber = userInput.nextInt();
			
			if(fatoriNumber > 0) {
				
				int Answer = calculate(fatoriNumber);
				System.out.println("The factorial of " + fatoriNumber + " is " + Answer + ".");
			}
			else {
				
				System.out.println("Error");
			}
		}
		else {
			System.out.println("Error");
		}
	}
	
	public static int calculate(int num) {
		
		// returns factorial of given number
		int result;
		
		if(num == 0) {
			
			result = 1;
			
			return result;
		}
		else {
    
			result = num * calculate(num - 1);
      
			return result;
		}
	}
}
