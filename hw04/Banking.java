// Kathryn Kundrod
// CSE2 HW4 Program 2
// February 17, 2015

import java.util.Scanner; // Import scanner class to take user inputs

// Declare class and main method
public class Banking {
    public static void main (String[] args){
        
        Scanner myScanner; // Declare instance of scanner object
        myScanner = new Scanner(System.in); // Construct scanner to take user inputs
        
        // Generate random number between 1000 and 5000
        double randomNumber = Math.random()*4000+1001;
        
        double balance = randomNumber; //generates balance
        double deposit = 0; //initializing value
        double withdrawal =0; //initializating value
        
        //Gives user choice of what they would like to do with their balance
        System.out.print("If you would like to deposit money, enter 1. ");
        System.out.print("If you would like to withdraw money, enter 2. ");
        System.out.print("If you would like to view your balance, enter 3. ");
        
        int choice = myScanner.nextInt(); // Defines input as variable "choice";
        
        switch (choice) {
            case 1: System.out.print("How much money would you like to deposit? "); //asks user for deposit amount
                deposit = myScanner.nextDouble(); //stores user input for deposit amount
                if (deposit>0) {
                    double newBalance = deposit + balance;
                    System.out.printf("Your resulting balance is $%5.2f\n", newBalance); //prints new balance
                }
                else {
                    System.out.println("Entry must be a positive number."); //indicates input error
                }
                break;
            case 2: System.out.print("How much money would you like to withdraw? "); //asks user for withdrawal amount
                withdrawal = myScanner.nextDouble(); //stores user input for withdrawal amount
                if (withdrawal>0) {
                    if (withdrawal <= balance){
                    System.out.printf("Your resulting balance is $%4.2f\n",balance-withdrawal); //prints new balance
                    }
                    else {
                        System.out.println("Withdrawal cannot exceed balance.");
                    }
                }
                else {
                    System.out.println("Entry must be a positive number."); //indicates input error
                }
                break;
            case 3: System.out.printf("Your balance is $%4.2f\n",balance);
                break;
            default: System.out.println("Error: invalid entry");
                return;
                
                }
    }
}