// Kathryn Kundrod
// February 10, 2015
// CSE2 HW3 Program 2

import java.util.Scanner; // Allows for user inputs

public class Root { // Main method
    public static void main(String[] args) {
        
    Scanner myScanner; // Declares an instance of the Scanner object
    myScanner=new Scanner ( System.in ); // Takes input from STDIN
        
    System.out.print("Enter a double, and I print its cube root: "); // User enters a double
    double value=myScanner.nextDouble(); // Stores user's double as "value"
    
    // Calculate cube root estimate in iterations
    double guess=value/3; // Crude guess of the cube root of the user's entered value
    double firstRoot=(2*guess*guess*guess+value)/(3*guess*guess); // First improvement on the cube root guess
    double secondRoot=(2*firstRoot*firstRoot*firstRoot+value)/(3*firstRoot*firstRoot); // Second improvement
    double thirdRoot=(2*secondRoot*secondRoot*secondRoot+value)/(3*secondRoot*secondRoot); // Third improvement
    double fourthRoot=(2*thirdRoot*thirdRoot*thirdRoot+value)/(3*thirdRoot*thirdRoot); // Fourth improvement
    double fourthRootCubed=fourthRoot*fourthRoot*fourthRoot;
    
    System.out.println("The cube root is "+fourthRoot+": "+fourthRoot+"*"
        +fourthRoot+"*"+fourthRoot+"="+fourthRootCubed+".");
        
    }
}