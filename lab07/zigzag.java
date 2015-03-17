// Kathryn Kundrod
// CSE2 LAB07
// March 6, 2015

import java.util.Scanner;
public class zigzag {
    public static void main (String[] args){
        
        // Step 1
        // Print 10 '*'s on a line using a for loop and nStars=10 as the sentinal variable
        int nStars=-1; //sentinal variable declaration and initialization
        int counter=0; //first counter declaration and initialization
        int infiniteLoopCounter=0;
        
        Scanner myScanner= new Scanner (System.in);
        
        while (infiniteLoopCounter<1){
        System.out.println("Enter an integer between 3 and 33 inclusive: ");

        
        int counter4=0;
        while (counter4<1){
        if (!myScanner.hasNextInt()){
            System.out.println("Invalid input. Enter again: ");
            myScanner.next();
        }
        else{
            nStars=myScanner.nextInt();
            if (nStars<3||nStars>33){
                System.out.print("Integer is out of range [3,33]. Enter again: ");
            }
            else {
                counter4++;
            }
        }
        }

        while (counter<nStars){ //while loop prints 10 stars
            System.out.print("*");
            counter++;
        }
        System.out.println(""); //starts next loop on the next line

        //Step 2
        //Print '*'s on a downward diagonal
        String space=" ";
        String spaceString="";
        int counter2=0;
        while (counter2<(nStars-2)){
            spaceString+=space;
            System.out.println(spaceString+"*");
            counter2++;
        }
        
        //Step 3
        //Print '*'s on a line
        
        int counter3=0;
        while (counter3<nStars){
            System.out.print("*");
            counter3++;
        }
        System.out.println("");
        
        System.out.print("Enter Y or y to go again: ");
        String userInput=myScanner.next();
        String y="y";
        String Y="Y";
        if (userInput.equals(y)||userInput.equals(Y)){
            counter=0;
            counter2=0;
            counter3=0;
            counter4=0;
        }
        else{
            infiniteLoopCounter++;

        }
        }
    
        
}
}
