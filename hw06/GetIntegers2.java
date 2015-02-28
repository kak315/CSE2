// Kathryn Kundrod
// CSE2 hw06
// March 3, 2015

// Asks user for five integers in a while loop
// Checks for valid integers along the way
// If an invalid integer is entered, the user will be prompted
// to enter another, and the program will continue

// This is a second variation of the GetIntegers.java file using similar logic
// but checking for criteria in the reverse order and using a while loop
// instead of a for loop.

import java.util.Scanner;

public class GetIntegers2 { //defines class
    public static void main (String[] args) { //defines main method
    
    Scanner myScanner; // Declare instance of scanner object
    myScanner = new Scanner(System.in); // Construct scanner to take user inputs
    
    System.out.print("Please enter five non-negative integers: "); // prompts user for five inputs
            
    int counter=0; // declares sentinal variable
    int sum=0; //initializes sum
    int userInput=0; //initializes input variable
    while(counter<5){ // will run loop until user inputs five integers
        if (!myScanner.hasNextInt()){ // checks if input is an integer
            System.out.println("Invalid input. Enter again."); //if not an int, asks for a different value
            myScanner.next(); //prevents infinite loop
        }
        else { //if input is an integer, program continues
            userInput=myScanner.nextInt(); //stores input as a variable
            if (userInput<0){ //checks if input is positive
                System.out.println("Invalid input. Enter again."); //if negative, asks for a different value
            }
            else{ //if input is positive, program continues
                sum+=userInput; // adds input to sum
                counter++; //if input is a non-negative int, counter adds one
            } // ends else statement checking for input being positive
        } // ends else statement checking for input being an integer
        
    } //ends while loop
    System.out.println("The sum is "+sum+"."); //prints sum
    } // ends main method
} //ends class
        
