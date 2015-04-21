// Kathryn Kundrod
// CSE2 HW12
// 4/21/15

// Objective: Implement matrix multiplication on random matrices


import java.util.Random; //allows for random number generation
import java.util.Scanner; //allows for user input

public class Multiply { //class declaration


// following method is to generate a random matrix:

    public static int[][] randomMatrix(int width, int height){ //method to output random matrix, takes width and height as inputs
        int[][] outputMatrix=new int[width][height]; //creates space for a new matrix of the designated dimensions
        Random randNum=new Random(); //allows for random number generation
        for (int j=0;j<width; j++){ //fills by column second
            for (int i=0;i<height;i++){ //fills by row first
                outputMatrix[j][i]=randNum.nextInt(20)-10; //fills each spot with a random number btw -10 and 10
            } //ends for loop
        } // ends for loop
        return outputMatrix; //returns filled matrix out of method
    } //ends randomMatrix method
    
    
    //following method is a print a matrix:
    
    public static void printMatrix(int[][]array){ //printMatrix method takes an array as input
        if (array==null){ //if array is null
            System.out.println("The array was empty."); //error message is printed
        } //ends if statement
        else{ //if array is not null
            int height=array[0].length; //stores height of array
            int width=array.length;//stores width of array
            for (int k=0; k<height; k++){ //goes through rows second
                for (int l=0; l<width; l++){ //goes through columns first
                    System.out.print(array[l][k]+" "); //print statement that prints array
                } //ends for loop
                System.out.println(); //skips a line after each row
            } //ends for loop
        } //ends else statement
            
    }//ends printMatrix method
    
    
    //following method is to multiply matrices:
    
    public static int[][] matrixMultiply(int[][]array1, int[][]array2){ //matrixMultiply method takes two arrays as input
        if(array1.length==array2[0].length){ //checks to make sure dimensions match for multiplication
            int[][]multipliedMatrix=new int[array1[0].length][array2.length]; //creates new matrix - dimension: array1 height and array2 width
            for (int i=0; i<array1[1].length; i++){ //increases by row from array 1
                for (int j=0; j<array2.length; j++){ //increases by column from array 2
                    for (int k=0; k<array1.length; k++){ //incrases by column from array 1
                        multipliedMatrix[i][j]+=array1[k][i]*array2[j][k]; //adds products to matrix position
                } //end for loop
            } //end for loop
            } // end for loop
            return multipliedMatrix; //returns matrix
        } //ends if statment
        else{ // if matrix dimensions are not valid for multiplication,
            System.out.println("Matrix dimension mismatch - can't multiply!"); //error message prints
            return null; //returning null makes it so the print method still always works
        } //end else statement
    }//end matrixMultiply method
    
    
    //following method is main method: 
    
    public static void main (String[] args){ //main method declaration
        Scanner scan=new Scanner(System.in); //allows for user input (scanner construction)
        int counter=0; //initializes counter for while loop that checks for appropriate inputs
        System.out.println("Please enter an integer for the height of the first matrix: "); //asks user for input
        int height1=0; //initializes value outside while loops to avoid scope issues
        int width1=0;//initializes value outside while loops to avoid scope issues
        int height2=0;//initializes value outside while loops to avoid scope issues
        int width2=0;//initializes value outside while loops to avoid scope issues
        while (counter<1){ //loop will run until a positive integer is entered
            if (!scan.hasNextInt()){ // if input is not an integer
                System.out.print("Not an integer. Please enter again: "); //user will be prompted to enter another
                scan.next(); //allows for re-input
            } //ends if statement
            else{ //users input is an integer
                height1=scan.nextInt(); //integer is stored as first height
                if(height1<0){ //height must be positive or zero if not...
                    System.out.println("Integers must be positive. Please enter again: "); //error message will print and prompt for another input
                } //ends if statement
                else{ //means input was appropriate
                    counter++; //increases counter to break while loop
                } //ends else statement
            } //ends else statement
        } //ends while loop
        int counter2=0; //initializes counter for while loop that checks for appropriate inputs
        System.out.println("Please enter an integer for the width of the first matrix: "); //asks user for width input
        while (counter2<1){ //loops runs until appropriate integer is entered
            if (!scan.hasNextInt()){ //if input is not an integer...
                System.out.print("Not an integer. Please enter again: "); //user prompted to enter int
                scan.next(); //allows for next input
            } //ends if statement
            else{ //means user input was an inte
                width1=scan.nextInt(); //stores int as width1
                if(width1<0){ //if int was negative...
                    System.out.println("Integer must be positive. Please enter again: "); //error message prints and user is prompted to enter a positive or zero int
                }//ends if statement
                else{ //means input was appropriate
                    counter2++; //counter incremented to break while loop
                } //ends else statement
            } //ends else statement
        } //ends while loop
        int counter3=0;//initializes counter for while loop that checks for appropriate inputs
        System.out.println("Please enter an integer for the height of the second matrix: "); //user prompted to enter int
        while(counter3<1){ //loop runs until appropriate integer is input
            if (!scan.hasNextInt()){ //means input was not an int
                System.out.print("Not an integer. Please enter again: "); //user prompted to enter int
                scan.next(); //takes next input
            } //ends if statement
            else{ // means input was an int
                height2=scan.nextInt(); //input stored as height2
                if(height2<0){ //if input was negative...
                    System.out.println("Integer must be positive. Please enter again: "); //error message printed & prompts for another int
                } //ends if statement
                else{ //input was positive or zero
                    if (width1!=height2){ //if width1 doesn't equal height2, matrices can't be multiplied...
                        System.out.println("Width of first matrix must equal height of second matrix. Please enter second matrix height again: "); //error message printed and user prompted to enter an appropriate int
                    }//ends if statement
                    else{//means input was appropriate
                    counter3++; //increments counter to break while loop
                    } //ends else statement
                } //ends else statement
            }//ends else statement
        }//ends while loop
        System.out.println("Please enter an integer for the width of the second matrix: "); //prompts user for width of 2nd matrix
        int counter4=0;//initializes counter for while loop that checks for appropriate inputs 
        while(counter4<1){ //loop runs until appropriate integer is entered
            if (!scan.hasNextInt()){ //means input was not an integer
                System.out.print("Not an integer. Please enter again: "); //user prompted to input again
                scan.next(); //takes next input
            }//ends if statement
            else{ //means input was an integer
                width2=scan.nextInt();//integer stored as width2
                if(width2<0){ //if width2 is negative...
                    System.out.println("Integer must be positive. Please enter again: ");//user is prompted to enter positive or zero int
                }//ends if statement
                else{//means input was appropriate
                    counter4++; //counter incremented to break while loop
                }//ends else statement
            }//ends else statement
        }//ends while loop

        int[][] matrix1=randomMatrix(width1, height1);//stores random matrix created in randomMatrix method that uses inputs for width and height
        System.out.println("Matrix 1: "); //identifies that matrix 1 will be printed
        printMatrix(matrix1); //prints matrix 1 using printMatrix method
        int[][] matrix2=randomMatrix(width2, height2);//stores random matrix created in randomMatrix method that uses inputs for width and height
        System.out.println("Matrix 2: "); //identifies that matrix 2 will be printed
        printMatrix(matrix2); //prints matrix 2 using printMatrix method
        System.out.println("Matrices multiplied equals: "); //identifies that product will be printed
        printMatrix(matrixMultiply(matrix1, matrix2));//product is calculated in matrixMultiply method and printed with printMatrix method
        
    } //ends main method


} //ends class