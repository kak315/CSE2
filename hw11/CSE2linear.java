// Kathryn Kundrod
// CSE2 hw11
// April 14, 2015

import java.util.Scanner; //allows for user input
import java.util.Random; //allows for random number generation
public class CSE2linear { //class declaration
    public static void main(String[] args){ //main method
        Scanner scan=new Scanner (System.in); //allows for user input by declaring new scanner
        int[] gradeArray=new int[15]; //creates an empty new array with length=15
        for (int i=0; i<15; i++){ //for loop to fill array
            System.out.print("Please enter a positive integer #"+(i+1)+": "); //asks for user input for each array item
            if (!scan.hasNextInt()){ //ensures input is an integer
                System.out.println("Invalid input. Enter again: "); //prints error statement if input is not an integer
                scan.next(); //allows for another user input
                i--; //repeats same cycle of the loop
            } // ends if statement that checks that input is an integer
            else{ // for loop directed here if input is an integer
                int userInput=scan.nextInt(); //assigns user's input to variable called userInput
                if (userInput<0||userInput>100){ //if user's input is outside a logical grade range,
                    System.out.println("Integer is out of range [0,100]. Enter again."); //error statement prints
                    i--; //loop reruns on same cycle
                } //ends if statement that checks for appropriate range
                else if (i>0&&userInput<gradeArray[i-1]){ //checks to make sure each integer entered is greater than the last
                    System.out.println("Integer is not greater than or equal to last grade entered. Enter again."); //prints error statement if it's not
                    i--; //loop reruns on same cycle
                } //ends if statement that checks for increasing values
                else { // user's input is appropriate
                    gradeArray[i]=userInput; //user's input is added to the array
                } //ends else statement for appropriate entries
            }// ends else statement for integer inputs
        } //ends for loop that builds array 
        
        System.out.print("The sorted grades are: "); //print line to identify grade array
        for (int j=0; j<15; j++){//prints out grades in ascending order (as entered)
            System.out.print(gradeArray[j]+" "); //prints each entry of the array
        } //ends for loop for printing sorted array
        System.out.println("");//enters to new line
        System.out.print("Enter a grade to search for: "); //prompts user to enter a grade to search for
        binarySearch(scan.nextInt(), gradeArray); //redirects to "binarySearch" method, which prints results from within the method
        int[] scrambleGradeArray= scramble(gradeArray); //redirects to scramble method and stores returned array into scrambleGradeArray variable
        System.out.println("Scrambled:"); //identifies that the scrambled grade array will be printed
        for (int k=0; k<15; k++){ //prints each item in the scrambled grade array in order
            System.out.print(scrambleGradeArray[k]+" "); //prints each item in the scrambled grade array
        } //ends for loop to print scrambled grade away
        System.out.println(); //enters to a new line
        System.out.print("Enter a grade to search for: "); //prompts user to enter a grade to search for
        linearSearch(scan.nextInt(), scrambleGradeArray); //redirects to linearSearch method, which prints results from within the method
        
    }
    
    public static void binarySearch(int key, int[] binaryArray){ //takes user's input and ordered array as input
        int counter=0; //counter used to activate "not found" print statement if value was not found in binary search
        int lowBoundary=0; //method for binary search adapted from method found online at http://www.cs.toronto.edu/~reid/search/bincode.html
        int highBoundary=14; //low and high boundaries are of length of array
        int iteration=0; //used to count iterations of searching for value
        while (highBoundary>=lowBoundary && counter<1){ //while statement keeps searching until the number is found or there are no more numbers left to search
            iteration++; //iteration counter is incremented so that each time through is recorded
            int middle =(lowBoundary+highBoundary)/2; //identifies the item in the array that will be checked in each iteration
            if (key==binaryArray[middle]){ //if the item in the array matches the number that the user entered,
                System.out.println(key+" was found in the list with "+iteration+" iteration(s)."); //User is notified grade was found
                counter++; //breaks while statement
            }//ends if statement
            else{ //if checked item does not match user's input
                if(key>binaryArray[middle]){ //if user's input was greater than the checked value
                    lowBoundary=middle+1;//next search iteration will only check top half of values
                } //ends if statement
                else{ //if user's input was less than the checked value
                    highBoundary=middle-1; //next search iteration will only check bottom half of values
                } //ends else statement
            } //ends else statement for non-matching searches
        }//ends while loop
        if(counter==0){ //if value was not found
            System.out.println(key+" was not found in the list with "+iteration+ " iterations."); //user is notified grade was not found
        } //ends if statement for not found case
       return; //void method returns nothing
    }//ends binarySearch method
    
    public static int[] scramble(int[] scrambleArray){ //method adapted from lecture 18 slides
        for (int i=0; i<scrambleArray.length; i++){ //loop runs until length of array is reached
            int target = (int)(scrambleArray.length*Math.random()); //sets target in array randomly
            int valueHolder = scrambleArray[target]; //ensures that value in original array target entry is not lost
            scrambleArray[target]=scrambleArray[i]; //sets target entry as original entry
            scrambleArray[i]=valueHolder; //switches original entry with the entry that was in the target entry's spot
        } // ends loop that scrambles array
        return scrambleArray; //returns scrambled array to main method
    }//ends scrambleArray method
    
    public static void linearSearch(int userInput, int[] linearArray){ //takes a user's input and the scrambled array as inputs
        int iterationCounter=1; //initializes and declares counter for search iterations
        int foundGrade=0; //counter that will activate "not found" print statement if grade is not found
        for(int i=0; i<linearArray.length; i++){ //for loop that linearly searchs array
            if (linearArray[i]==userInput){ //each entry is checked to see if it matches user's input
                System.out.println(userInput+" was found with "+iterationCounter+" iteration(s)."); //if found, user is notified here
                foundGrade++; //ensures "not found" statement is not printed
            } //ends if statement that checks entry
            else{ //entry is not found
                iterationCounter++; //iteration counter is incremented for next loop through checking
            } //ends else statement
        }//ends for loop that checks for entered grade
        if (foundGrade==0){ //if grade was not found, 
            System.out.println(userInput+" was not found with "+iterationCounter+" iterations.");// user is notified here
        } //ends if statement
    }//ends linearSearch method
    
}//ends class