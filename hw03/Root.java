// Kathryn Kundrod
// February 10, 2015
// CSE2 HW3 Program 2

import java.util.Scanner; // Allows for user inputs

public class Root { // Main method
    public static void main(String[] args) {
        
    Scanner myScanner; // Declares an instance of the Scanner object
    myScanner=new Scanner ( System.in ); // Takes input from STDIN
        
    System.out.print("Enter a double, and I print its cube root: "); // User enters a double
    double value=myScanner.nextDouble();
    
    double guess=value/3; // Crude guess of the cube root of the user's entered value
    double firstImprovement=(guess*guess*guess+value)/(3*guess*guess); // Iterations of improvement on the cube root guess
    double secondImprovement=(firstImprovement*firstImprovement*firstImprovement+value)/(3*firstImprovement*firstImprovement);
    double thirdImprovement=(secondImprovement*secondImprovement*secondImprovement+value)/(3*secondImprovement*secondImprovement);
    // double thirdImprovementCubed=(thirdImprovement*thirdImprovement*thirdImprovement);
    double fourthImprovement=(thirdImprovement*thirdImprovement*thirdImprovement+value)/(3*thirdImprovement*thirdImprovement);
    double fifthImprovement=(fourthImprovement*fourthImprovement*fourthImprovement+value)/(3*fourthImprovement*fourthImprovement);
    double fifthImprovementCubed=fifthImprovement*fifthImprovement*fifthImprovement;
    
    System.out.println("The cube root is "+fifthImprovement+": "+fifthImprovement+"*"
        +fifthImprovement+"*"+fifthImprovement+"="+fifthImprovementCubed+".");
        
    }
}