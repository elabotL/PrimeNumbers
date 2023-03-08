/*Author: L Castro
 * Date: 3/2/2023
 * Purpose: Print each prime number between 1 and 100
 * Assumptions:
 * - No user input
 * - No negative numbers 
 * */
package PrimeNumbers;

import javax.swing.*;

public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		// Declare and initialize variables
        final int LIMIT = 100;
        final String DIALOG_TITLE = "Prime Numbers";
       
        boolean bIsPrime = false;
        
        int iNumberToTest = 0, 
        	iPrimeCheck = 2;
        
        String sPrimeNumbers = "";
     
        // Write for loop to check every number between 1 and 100
        for (iNumberToTest = 1; iNumberToTest <= LIMIT; iNumberToTest++) 
        {
        	bIsPrime = true;// Set boolean value to check if iNumberToTest is a prime number
 
            for (iPrimeCheck = 2; iPrimeCheck * iPrimeCheck <= iNumberToTest; iPrimeCheck++) 
            {
                
            	if (iNumberToTest % iPrimeCheck == 0) // Test to see if the quotient between iNumberTest and iPrimeCheck is zero
                {
                    bIsPrime = false; // If bIsPrime is false then iNumberToTest is not prime
                    break;
                }
            }
 
            if (bIsPrime == true) // If bIsPrime is true then iNumberToTest is prime 
            {
                sPrimeNumbers+= iNumberToTest + "\n";// Add iNumberToTest to sPrimeNumbers string that will be printed to screen on newline
            }   
        }
        
        //Output
        JOptionPane.showMessageDialog(null, 
        							  sPrimeNumbers, 
        							  DIALOG_TITLE,
        							  JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);        
        
    }//end of main method
	
}//end of PrimeNumbers class


	


