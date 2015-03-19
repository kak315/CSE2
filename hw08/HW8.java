// Kathryn Kundrod
// CSE2 HW8
// March 24, 2015

// The objective of this assignment is to create a game using multiple methods.

import java.util.Scanner; //allows for user inputs

public class HW8{ //creates class
    public static void main(String[] args) { //main method: provided in instructions & copied and pasted here
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    } // ends main method
    
    public static void giant() { //creates giant method; copied and pasted from instructions
    System.out.println("                                 ---------                    ");
    System.out.println("                                |  /    \\|                   ");
    System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
    System.out.println("                           H     -----------   H              ");
    System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
    System.out.println("                           H    HHHHHHHHHHH    H                      ");
    System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
    System.out.println("                                HHHHHHHHHHH                   ");
    System.out.println("                                HHH     HHH                   ");
    System.out.println("                               HHH       HHH                   ");
    }//ends giant method

    public static void cave() { //creates cave method; copied and pasted from instructions
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//ends cave method
    
    public static void box(){ //creates box method; copied and pasted from instructions
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    } //ends box method
    
    public static String getInput(Scanner scan, String Cc){ // checks for correct input to continue game
        //Scanner scan = new Scanner (System.in);
        String inputCc = scan.next();
        String C="C";
        String c="c";
        if (inputCc.equals(C)||inputCc.equals(c)){ //keeps going if user enters "C" or "c"
        } //ends if statement
        else{ // if any other key is entered
            System.out.println("Yea right LOSER!"); //prints this message
            System.exit(0); //found this method online as a way of exiting the program
        }//ends else statement
        return "Cc";
    }//ends getInput method
    
    public static String getInput(Scanner scan, String AaEe, int trial){
        String inputAaEe=scan.next();
        String A="A", a="a", E="E", e="e"; //defines possible acceptable inputs as strings
        int trial2=0;
        while (trial2<10){
            if (inputAaEe.equals(A)||inputAaEe.equals(a)){ //if input is A or a
                    int randomNumber =(int)(Math.random()*2);//generates either a zero or one and stores it as randomNumber
                    if (randomNumber==0){ //if a zero was generated,
                        System.out.println("Critical miss!"); // user is notified of a critical miss
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                        scan.next();
                    } //ends if statement for 0 value
                    else if (randomNumber==1){ // if a one was generated,
                        System.out.println("Critical hit!"); //user is notified of a critical hit
                        trial2++; //increments counter
                        if (trial2<10){
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                        scan.next();
                        }
                    } //ends else if statement for a 1 value
                } //ends if statement
            
            else if (inputAaEe.equals(E)||inputAaEe.equals(e)){ //if input is A or a
                int randomNumber2=(int)(Math.random()*10)+1;  //generates a random number between 1 and 10
                if (randomNumber2<10){ //if 10 was not generated,
                    System.out.println("Did not escape!"); // user is notified that they didn't escape
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    scan.next();
                } //ends if statement for <10 value
                else if (randomNumber2==10){ // if a one was generated,
                    System.out.println("You escaped!"); //user is notified they escaped
                    //controlEe++; //increments control counter and exits controlling while loop
                    break;
                } //ends else if statement for 10 value
            } //ends if statement statement for E or e entry
            
            else {
                System.out.println("Executed by the GIANT! Game Over!"); //for invalid input
            } //ends else statement
        } //ends while statement
        return "AaEe";
    }//ends getInput method
    
    public static String getInput(Scanner scan){
        int treasure=scan.nextInt();
        switch(treasure){ //defines treasure 
            case 1:
                System.out.println("You get a puppy!");
                break;
            case 2:
                System.out.println("You get a lifetime supply of coffee!");
                break;
            case 3:
                System.out.println("You get an A in CSE2!");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL.");
                break;
        }
        return "end";
    } //ends main method
    
} //ends class