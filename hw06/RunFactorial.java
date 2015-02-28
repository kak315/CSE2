// Kathryn Kundrod
// CSE2 hw06
// March 3, 2015

// Asks user integer between 9 and 16 inclusive
// If valid input, calculates factorial
// If invalid input, keeps prompting user for valid input until one is received

import java.util.Scanner;

public class RunFactorial { //defines class
    public static void main (String[] args) { //defines main method
    
    Scanner myScanner; // Declare instance of scanner object
    myScanner = new Scanner (System.in); // Construct scanner to take user inputs
    
    System.out.print("Enter an integer between 9 and 16 inclusive: "); // prompts user for input
    
    int i=0;
    while (i==0){ // creates while loop that will run until right input is entered
    if (myScanner.hasNextInt()){ // checks to make sure input is an int
        int userInput=myScanner.nextInt(); // stores user input if it's an int
        int counter=userInput; //turns user input into a separate variable
        long factorial=1; // declares and initializes factorial variable as a long (b/c 13! and above is out of range of an int)
        
        if (userInput>=9 && userInput<=16) {
                while (counter>1){ // Runs loop to calculate factorial without multiplying by zero
                    factorial*=counter*--counter; // calculates factorial in steps
                    counter--; // decrements counter to keep factorial calculation going
                } // ends nested while loop that calculates factorial
            System.out.println(userInput+"!="+factorial); // prints factorial
            break;
        } // ends if statement checking for integer being in right range
        else {
        System.out.println("Enter a valid integer."); // presents error message
        } //ends else statement for if integer is not in right range
    } // ends if statement checking for if input is an integer
    else {
        System.out.println("Enter a valid integer."); // presents error message
        myScanner.next(); // avoids infinite loop.
    } // ends else statement for if input is not an integer
    } // ends while loop
    } // ends main method
} // ends class