// Kathryn Kundrod
// CSE2 hw06
// March 3, 2015

// Asks user for five integers in a for loop
// Checks for valid integers along the way
// If an invalid integer is entered, the user will be prompted
// to enter another, and the program will continue

import java.util.Scanner;

public class GetIntegers { //defines class
    public static void main (String[] args) { //defines main method
    
    Scanner myScanner; // Declare instance of scanner object
    myScanner = new Scanner(System.in); // Construct scanner to take user inputs
    
    System.out.print("Please enter five non-negative integers: "); //asks user for five integers
            
    
    int sum=0; // declares and initializes sum
    int userInput=0; // declares and initializes variable for storing inputs
    
    for (int counter=0; counter<5; counter++){ //runs loop five times
        if (myScanner.hasNextInt()){ // checks if input is an integer
            userInput=myScanner.nextInt(); // stores input as a variable called userInput
            if (userInput>=0){ // checks if input is non-negative
                sum+=userInput; //adds input to sum (keeping old sum value)
            } //ends if statement for if integer is positive
        
            else {
                System.out.println("Invalid input. Enter again."); //prompts user to enter a different input if invalid
                counter--; //stops counter from incrementing up if input is invalid
            } //ends else statement for if integer was positive
        } // ends if statement for if an integer was entered
        
            else {
            System.out.println("Invalid input. Enter again."); //prompts user to enter a different input if invalid
            counter--; // stops counter from incrementing if input is invalid
            myScanner.next(); // avoids infinite loop (why is this necessary here but not in the nested else statement?)
        } //ends else statement for if an integer was entered
        
        
    } //ends for loop
    System.out.println("The sum is "+sum+"."); //prints sum
    } // ends main method
} //ends class
        
