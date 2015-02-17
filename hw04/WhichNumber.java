// Kathryn Kundrod
// CSE2 HW4 Program 1
// February 17, 2015

import java.util.Scanner; // Import scanner class to take user inputs

// Declare class and main method
public class WhichNumber {
    public static void main (String[] args){
        
        Scanner myScanner; // Declare instance of scanner object
        myScanner = new Scanner(System.in); // Construct scanner to take user inputs
        
        String y="y";
        String Y="Y";
        String n="n";
        String N="N";
        
        System.out.print("Think of a number between 1 and 10 inclusive: "); // Asks user for int
        
        if (myScanner.hasNextInt()) { // Checks that user input is an int
            int number = myScanner.nextInt(); // Defines input as variable "number";
            
            if (1<=number && number<=10) { // Checks that user input is between 1 and 10 inclusive
                System.out.print("Is your number even? Enter Y for yes or N for no. "); //Asks for feedback on whether number is even
                String answer1 = myScanner.next(); //Stores user input
                
                if(answer1.equals(y)||answer1.equals(Y)){ //number is even
                    System.out.print("Is your number divisible by 3? Enter Y for yes or N for no. ");
                    String answer2 = myScanner.next();
                    
                    if(answer2.equals(y)||answer2.equals(Y)){ //number is divisible by 3
                        System.out.print("Is your number 6? Enter Y for yes or N for no. ");
                        String answer3 = myScanner.next();
                        
                        if(answer3.equals(y)||answer3.equals(Y)){ //number is 6
                            System.out.println("Yay!"); //Correct guess
                            return; //ends program
                        }
                        else if (answer3.equals(n)||answer3.equals(N)){ //number is not 6
                            System.out.println("That is not consistent."); //Inconsistent inputs
                            return; //ends program
                        }
                        else {
                            System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                            return;
                        }
                    }
                        
                    else if (answer2.equals(n)||answer2.equals(N)){ //Number is not divisible by 3
                        System.out.print("Is your number divisible by 4? Enter Y for yes or N for no. ");
                        String answer4 = myScanner.next();
                        
                        if(answer4.equals(y)||answer4.equals(Y)){ //Number is divisible by 4
                            System.out.print("Is your number divided by 4 greater than 1? Enter Y for yes or N for no. ");
                            String answer5 = myScanner.next();
                            
                            if(answer5.equals(y)||answer5.equals(Y)){ //number divided by 4 is greater than 1
                                System.out.print("Is your number 8? Enter Y for yes or N for no. ");
                                String answer6 = myScanner.next();
                                
                                if(answer6.equals(y)||answer6.equals(Y)){ //number is 8
                                    System.out.println("Yay!");
                                    return;
                                }
                                else if (answer6.equals(n)||answer6.equals(N)){ //number is not 8
                                    System.out.println("That is not consistent.");
                                    return;
                                }
                                else {
                                    System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                    return;
                                }
                                }
                            else if (answer5.equals(n)||answer5.equals(N)){ //number divided by 4 is less than 1
                                System.out.print("Is your number 4? Enter Y for yes or N for no. ");
                                String answer7 = myScanner.next();
                            
                                    if(answer7.equals(y)||answer7.equals(Y)){ //number is 4
                                        System.out.println("Yay!");
                                        return;
                                    }
                                    else if (answer7.equals(n)||answer7.equals(N)){ //number is not 4
                                        System.out.println("That is not consistent.");
                                        return;
                                    }
                                    else {
                                        System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                        return;
                                    }
                                    
                            }
                            else {
                                System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                return;
                            }
                        }
                        else if (answer4.equals(n)||answer4.equals(N)){ //number is not divisible by 4
                            System.out.print("Is your number divisible by 5? Enter Y for yes or N for no. ");
                            String answer8 = myScanner.next();
                            
                            if(answer8.equals(y)||answer8.equals(Y)){ //number is divisble by 5
                                System.out.print("Is your number 10? Enter Y for yes or N for no. ");
                                String answer9 = myScanner.next();
                            
                                    if(answer9.equals(y)||answer9.equals(Y)){ //number is 10
                                        System.out.println("Yay!");
                                        return;
                                    }
                                    else if (answer9.equals(n)||answer9.equals(N)){ //number is not 10
                                        System.out.println("That is not consistent.");
                                        return;
                                    }
                                    else {
                                        System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                        return;
                                    }
                            }
                            else if (answer8.equals(n)||answer8.equals(N)){ // number is not divisible by 5
                                System.out.print("Is your number 2? Enter Y for yes or N for no. ");
                                String answer10 = myScanner.next();
                            
                                    if(answer10.equals(y)||answer10.equals(Y)){ // number is 2
                                        System.out.println("Yay!");
                                        return;
                                    }
                                    else if (answer10.equals(n)||answer10.equals(N)){ //number is not 2
                                        System.out.println("That is not consistent.");
                                        return;
                                    }
                            }
                            else {
                                System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                return;
                            }
                        }
                        else {
                            System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                            return;
                        }
                    }
                    else {
                        System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                        return;
                    }
                }
            
            else if (answer1.equals(n)||answer1.equals(N)){ // If number is odd
                System.out.print("Is your number divisible by 3? Enter Y for yes or N for no. ");
                String answer11 = myScanner.next();
                    
                if(answer11.equals(y)||answer11.equals(Y)){ //number is divisible by 3
                    System.out.print("Is your number divided by 3 greater than 1? Enter Y for yes or N for no. ");
                    String answer12 = myScanner.next();
                    
                    if(answer12.equals(y)||answer12.equals(Y)){ //number divided by 3 is greater than 1
                        System.out.print("Is your number 9? Enter Y for yes or N for no. ");
                        String answer13 = myScanner.next();
                        
                        if(answer13.equals(y)||answer13.equals(Y)){ //number is 9 
                            System.out.println("Yay!");
                            return; //ends program
                        }
                        else if(answer13.equals(n)||answer13.equals(N)){ //number is not 9
                            System.out.println("That is not consistent."); 
                            return; //ends program
                        }
                        else {
                            System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                            return;
                        }
                    }
                    else if(answer12.equals(n)||answer12.equals(N)){ //number divided by 3 is not greater than 1
                        System.out.print("Is your number 3? Enter Y for yes or N for no. ");
                        String answer14 = myScanner.next();
                        
                        if(answer14.equals(y)||answer14.equals(Y)){ //number is 3
                            System.out.println("Yay!");
                            return; //ends program
                        }
                        else if (answer14.equals(n)||answer14.equals(N)){ //number is not 3
                            System.out.println("That is not consistent.");
                            return; //ends program
                        }
                        else {
                            System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                            return;
                        }
                    }
                    else {
                        System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                        return;
                    }
                }
                else if (answer11.equals(n)||answer11.equals(N)){ //number is not divisible by 3
                    System.out.print("Is your number greater than 6? Enter Y for yes or N for no. ");
                    String answer15 = myScanner.next();
                    
                    if(answer15.equals(y)||answer15.equals(Y)){ //number is greater than 6
                        System.out.print("Is your number 7? Enter Y for yes or N for no. ");
                        String answer16 = myScanner.next();
                        
                        if(answer16.equals(y)||answer16.equals(Y)){ //number is 7
                            System.out.println("Yay!");
                            return; //ends program
                        }
                        else if (answer16.equals(n)||answer16.equals(N)){ //number is not 7
                            System.out.println("That is not consistent.");
                            return; //ends program
                        }
                        else {
                            System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                            return;
                        }
                    }
                    else if(answer15.equals(n)||answer15.equals(N)){ //number is not greater than 6
                        System.out.print("Is your number less than 3? Enter Y for yes or N for no. ");
                        String answer17 = myScanner.next();
                        
                        if(answer17.equals(y)||answer17.equals(Y)){ //number is less than 3
                        System.out.print("Is your number 1? Enter Y for yes or N for no. ");
                        String answer18 = myScanner.next();
                        
                            if(answer18.equals(y)||answer18.equals(Y)){ //number is 1
                                System.out.println("Yay!");
                                return; //ends program
                            }
                            else if(answer18.equals(n)||answer18.equals(N)){ //number is not 1
                                System.out.println("That is not consistent.");
                                return; //ends program
                            }
                            else {
                                System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                return;
                            }
                        }
                        else if(answer17.equals(n)||answer17.equals(N)){ //number is not less thatn 3
                            System.out.print("Is your number 5? Enter Y for yes or N for no. ");
                            String answer19 = myScanner.next();
                        
                            if(answer19.equals(y)||answer19.equals(Y)){ //number is 5
                                System.out.println("Yay!");
                                return; //ends program
                            }
                            else if(answer19.equals(y)||answer19.equals(Y)){ //number is not 5
                                System.out.println("That is not consistent.");
                                return; //ends program
                            }
                            else {
                                System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                                return;
                            }
                            
                        }
                        else {
                            System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                            return;
                        }
                    }
                    else {
                        System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                        return;
                    }
                }
                else {
                    System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                    return;
                }
            }
            else {
                System.out.println("That is not a valid input."); //invalid input (not y/Y or n/N)
                return;
            }
                
            }
            else { 
                System.out.println("That is not a valid input.");
                return;
            }
        }
        else {
            System.out.println("That is not a valid input.");
            return;
        }
    }
}
                                
                        