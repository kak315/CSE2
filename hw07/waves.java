// Kathryn Kundrod
// hw07 cse2
// March 17, 2015

//Objective: print waves of numbers up to an entered integer

import java.util.Scanner; //allows for user input

public class waves { //declares class
    public static void main (String[] args){ //declares main method
    
    
    Scanner myScanner; // Declare instance of scanner object
    myScanner = new Scanner (System.in); // Construct scanner to take user inputs
    
    System.out.print("Enter an integer between 1 and 30 inclusive: "); // prompts user for input
    
    
    for (int counter1=0; counter1<1; counter1++){
        if (!myScanner.hasNextInt()){
            System.out.println("Invalid input. Enter again: ");
            myScanner.next();
            counter1--;
        } //ends if statement that checks if input is an integer
        else{
            int userInput=myScanner.nextInt();
            if (userInput<1||userInput>30){
                System.out.print("Integer is out of range [1,30]. Enter again: ");
                counter1--;
            }//ends if statement that checks if integer is in right range
            
            //Above code is just checking that the integer is valid.
            //The following else statement contains all 3 methods of producing stacks,
            //i.e. exclusively using for loops, then while loops, then do-while loops.
            
            else {
                System.out.println("FOR LOOP: "); //the following section of code produces the wave pattern using only for loops
                for(int counter2=1; counter2<=userInput; counter2++){ //stops loop at user input value
                    if (counter2%2==1){ // for odd values
                        int oddLimit=counter2; //initiates the limit as counter2
                        for(int oddWaveCounter=1; oddWaveCounter<=counter2; oddWaveCounter++){ //defines number of lines
                            String oddLine=""; //defines content of oddLine to be added onto
                            for(int lineCounter=1; lineCounter<=oddLimit; lineCounter++){ //defines line content
                                oddLine+=counter2; //adds counter2 value in a string within loop
                            }//ends four loop that creates line output
                            oddLimit--;//decreases the number printed by 1 on the next line of the loop
                            System.out.println(oddLine); //prints each line
                    }//ends odd wave creater
                    
                    }//ends if statement -- odd numbers
                    else { //for even values
                        String evenLine="";
                        for(int evenWaveCounter=1; evenWaveCounter<=counter2; evenWaveCounter++){
                            evenLine+=counter2;
                            System.out.println(evenLine);
                        }//ends for loop for printing even lines
                }//ends even value else statement
                }//ends counter until userInput
                
                System.out.println("");
                System.out.println("");
                System.out.println("WHILE LOOP: "); // the following section of code produces the wave pattern using only the while loop
                int counter3=1;
                while (counter3<=userInput){
                    if(counter3%2==1){// for odd values
                        int oddLimit2=counter3; //initiates the limit as counter3
                        int oddWaveCounter2=1;
                        while(oddWaveCounter2<=counter3){ //defines number of lines
                            String oddLine2=""; //defines content of oddLine to be added onto
                            int lineCounter2=1;
                            while(lineCounter2<=oddLimit2){ //defines line content
                                oddLine2+=counter3; //adds counter3 value in a string within loop
                                lineCounter2++;
                            }//ends while loop that creates line output
                            oddLimit2--;//decreases the number printed by 1 on the next line of the loop
                            System.out.println(oddLine2); //prints each line
                            oddWaveCounter2++;
                    }//ends odd wave creater
                    
                    }//ends if statement -- odd numbers
                    else { //for even values
                        String evenLine2="";
                        int evenWaveCounter2=1;
                        while(evenWaveCounter2<=counter3){
                            evenLine2+=counter3;
                            System.out.println(evenLine2);
                            evenWaveCounter2++;
                        }//ends for loop for printing even lines
                }//ends even value else statement
                counter3++;
                }//ends counter until userInput
                
                System.out.println("");
                System.out.println("");
                System.out.println("DO WHILE LOOP: "); // the following section of code produces the wave pattern using only the do while loop
                int counter4=1;
                do{
                    if(counter4%2==1){// for odd values
                        int oddLimit3=counter4; //initiates the limit as counter4
                        int oddWaveCounter3=1;
                        do{ //defines number of lines
                            String oddLine3=""; //defines content of oddLine to be added onto
                            int lineCounter3=1;
                            do{ //defines line content
                                oddLine3+=counter4; //adds counter4 value in a string within loop
                                lineCounter3++;
                            }
                            while(lineCounter3<=oddLimit3); //ends do-while loop that creates line output
                            oddLimit3--;//decreases the number printed by 1 on the next line of the loop
                            System.out.println(oddLine3); //prints each line
                            oddWaveCounter3++;
                    }//ends do statement that defines number of lines
                    while(oddWaveCounter3<=counter4); //ends odd wave creater
                    
                    }//ends if statement -- odd numbers
                    else { //for even values
                        String evenLine3="";
                        int evenWaveCounter3=1;
                        do{
                            evenLine3+=counter4;//adds to even number strings
                            System.out.println(evenLine3);//prints even lines
                            evenWaveCounter3++; //increments counter
                        } //prints even lines
                        while(evenWaveCounter3<=counter4); //do-while conditional
                }//ends even value else statement
                counter4++; //increase do while statement counter
                } //ends outer do statement
                while(counter4<=userInput);//ends counter until userInput

            }//ends else statement that identifies input as being in the right range
        }//ends else statement that identifies input as an integer
    } //ends for loop that ensures number input is valid

    }//ends main method
}//ends class
