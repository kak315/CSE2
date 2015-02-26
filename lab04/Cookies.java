// Kathryn Kundrod
// CSE2
// February 13, 2015

// Cookies.java takes user input on number of people attending party, 
// number of cookies wanted for each person, and how many cookies the user
// is going to purchase. Output tells user if he/she is buying enough cookies 
// (and if not, how many more the user must buy), whether they will divide evenly,
// or that he/she entered invalid information.

import java.util.Scanner; // Import scanner class to take user inputs


// Declare class and main method
public class Cookies {
    public static void main (String[] args) {
        
        Scanner myScanner; // Declare instance of scanner object
        myScanner = new Scanner (System.in); // Construct scanner to take user inputs
        
        // Request and validate user input on number of people and cookies for event
        System.out.print("Enter the number of people: "); // Asks user for number of people attending event
            if (myScanner.hasNextInt()) { // Runs program if the input was a valid int
                int numberOfPeople = myScanner.nextInt();
                if (numberOfPeople>0) { // Runs program if the input was >0
                    
                    System.out.print("Enter the number of cookies you are planning to buy: "); // Asks user for number of cookies
                    if (myScanner.hasNextInt()) { // Runs program if the input was a valid int
                        int numberOfCookies=myScanner.nextInt();
                        if (numberOfCookies>0) { // Runs program if the input was >0
    
                            System.out.print("How many cookies would you like each person to get? "); // Asks user for cookies per person
                                if (myScanner.hasNextInt()) { // Runs program if the input was a valid int
                                    int cookiesPerPerson = myScanner.nextInt();
                                    int divisible = numberOfCookies%numberOfPeople;
                                    if (cookiesPerPerson>0) { // Runs program if the input was >0
                                        
                                        
                                        if ((numberOfCookies/numberOfPeople)>=cookiesPerPerson && divisible==0){
                                            System.out.println("You have enough cookies, and they will divide evenly.");
                                        }
                                        else if ((numberOfCookies/numberOfPeople)>=cookiesPerPerson && divisible!=0){
                                            System.out.println("You have enough cookies, but they will not divide evently.");
                                        }
                                        else if ((numberOfCookies/numberOfPeople)<cookiesPerPerson){
                                            int cookiesNeeded=cookiesPerPerson*numberOfPeople-numberOfCookies;
                                            System.out.println("You do not have enough cookies. You need to buy at least "
                                                +cookiesNeeded+" more.");
                                        }
                            
                                } //Ends if statement checking for positive value for cookies per person
                                else { // Terminates program if input was not >0
                                    System.out.println("You did not enter an int >0.");
                                    return; 
                                }
                            } //Ends if statement checking for valid int for cookies per person
                            else { // Terminates program if input was not a valid int
                                System.out.println("You did not enter a valid int.");
                                return;
                            }
                        } //Ends if statement checking for positive value for number of cookies
                        else { // Terminates program if input was not >0
                            System.out.println("You did not enter an int >0.");
                            return; 
                        }
                        
                    } //Ends if statement checking for valid int for number of cookies
                    else { // Terminates program if input was not a valid int
                        System.out.println("You did not enter a valid int.");
                        return;
                    }
        
                } //Ends if statement checking for positive value for number of people
                else { // Terminates program if input was not >0
                    System.out.println("You did not enter an int >0.");
                    return; 
                }
                
            } //Ends if statement checking for valid int for number of people
            else { // Terminates program if input was not a valid int
                System.out.println("You did not enter a valid int.");
                return;
            }
        
        
    } // End of main method
} // End of class