// Kathryn Kundrod
// CSE2 lab08
// March 20, 2015

// This code calculates a super factorial, i.e. n!+(n-1)!+(n-2)!...1!
// where n is a user input, using methods.

import java.util.Scanner; //allows for user input

public class Factorials{ //creates class
    
    public static void main (String[] args){ //creates main method
        Scanner myScanner=new Scanner (System.in); //defines scanner
        System.out.print("Enter an integer: ");
        int input = myScanner.nextInt(); //takes user input and stores it as input
        int sum=0;
        for (int i=1;i<=input;i++){ //adds values incrementally up to the input value
            sum+=factorial(i); //calls factorial function to calculate individual factorials then adds them together
        } //ends for statement
        print(input, sum); //calls print method
    }
    
    public static int factorial(int i){ //creates  method that calculates factorial
        int counter=i; //initiates and defines counter as the same value as input so that counter can be incremented without affecting input
        int factorialCalculation=1;
        while (counter>1){ //makes sure factorial isn't multiplied by zero
            factorialCalculation*=counter*--counter; //decrements counter while multiplying to factorial value
            counter--; //further decrements counter
        } //ends while statement
        return factorialCalculation; //returns factorial value as output of this method
    } //ends factorial method
    
    public static void print(int input, int sum){ //creates second method to print super factorial
        System.out.println("The super factorial of "+input+" is: "+sum+"."); //prints super factorial value
        return; //exits this method
    } //ends second method of printing super factorial
            

}