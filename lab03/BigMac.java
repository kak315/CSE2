// Kathryn Kundrod
// February 6, 2015
// CSE2

// BigMac.java calculates and displays cost of Big Macs by taking user input for:
    // Number of Big Macs
    // Cost per Big Mac
    // Percentage tax
    
import java.util.Scanner; // Allows for user inputs

public class BigMac { // Main method
    public static void main(String[] args) {
        
        Scanner myScanner; // Declares an instance of the Scanner object
        myScanner=new Scanner ( System.in ); // Takes input from STDIN
        
        // Asks for and stores user inputs
        System.out.print("Enter the number of Big Macs (an integer>0): "); 
        int nBigMacs=myScanner.nextInt(); 
        System.out.print("Enter the cost per Big Mac as"+
            "a double (in the form xx.xx): ");
        double bigMac$=myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        taxRate/=100; // Takes a users input in percent form and turns it into a fraction
        
        // Calculate cost
        double cost$;
        int dollars, // for storing whole dollar amount of cost
            dimes, pennies; // for storing cents
        cost$=nBigMacs*bigMac$*(1+taxRate); // caclulates cost of big macs in whole dollars
        dollars=(int)cost$; // Stores ones and tens places of cost
        dimes=(int)(cost$*10)%10; // Stores tenths place of cost
        pennies=(int)(cost$*100)%10; // Stores hundredths place of cost
        
        // Print cost
        System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $"
            +bigMac$+" per Big Mac, with a "+"sales tax of "+(int)(taxRate*100)+
            "%, is $"+dollars+'.'+dimes+pennies); 
            // Prints cost with tens, ones, tenths, and hundredths place
        
    }
}

