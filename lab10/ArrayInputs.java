//Kathryn Kundrod
//cse2 lab 10
//april 10, 2015

// Ask user to enter size of array and fill the array with ints
// If not a positive int, have user try again

import java.util.Scanner;
public class ArrayInputs {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        int arraySize=scan.nextInt();
        int[] userArray=new int[arraySize];
        for (int i=0; i<arraySize; i++){
            System.out.print("Please enter a positive integer: ");
            if (!scan.hasNextInt()){
                System.out.println("Invalid input. Enter again: ");
                scan.next();
                i--;
            } 
            else{
                int userInput=scan.nextInt();
                if (userInput<0){
                    System.out.print("Integer is not postive. Enter again: ");
                    scan.nextInt();
                    i--;
                }
                
                else {
                    userArray[i]=userInput;
                }
            }

        }
        String output1="The output array is ";
        for (int j=0; j<arraySize; j++){
  	        output1+=userArray[j]+" "; //return a string of the form "{2, 3, -9}"  
        }
  	    System.out.println(output1);
    }
}