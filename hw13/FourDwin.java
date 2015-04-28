// kathryn kundrod
// cse2 hw13
// april 28, 2015


	
// OBJECTIVE: create a 4d random array of doubles, sort it, and evaluate statistics

import java.util.Scanner; // allows for user input
import java.util.Random; // allows for random number generation

public class FourDwin{ //class
    public static void main(String[] args){ //main method
        int counter=0; //controls first while loop
        int input1=0, input2=0; //defines inputs outside of while loops to avoid scope errors
        Scanner scan=new Scanner(System.in); //declares new scanner
        System.out.println("Please enter an integer: "); //asks for integer
        while (counter<1){ //loop will run until a positive integer is entered
            if (!scan.hasNextInt()){ // if input is not an integer
                System.out.print("Not an integer. Please enter again: "); //user will be prompted to enter another
                scan.next(); //allows for re-input
            } //ends if statement
            else{ //users input is an integer
                input1=scan.nextInt(); //integer is stored as first input
                if(input1<0){ //height must be positive or zero if not...
                    System.out.println("Integers must be positive. Please enter again: "); //error message will print and prompt for another input
                } //ends if statement
                else{ //means input was appropriate
                    counter++; //increases counter to break while loop
                } //ends else statement
            } //ends else statement
        } //ends while loop
        int counter2=0; //controls second while loop
        System.out.println("Please enter a second integer that is greater than the first: "); //prompts for input
        while (counter2<1){ //loop will run until a positive integer is entered
            if (!scan.hasNextInt()){ // if input is not an integer
                System.out.print("Not an integer. Please enter again: "); //user will be prompted to enter another
                scan.next(); //allows for re-input
            } //ends if statement
            else{ //users input is an integer
                input2=scan.nextInt(); //integer is stored as second input
                if(input2<0){ //height must be positive or zero if not...
                    System.out.println("Integers must be positive. Please enter again: "); //error message will print and prompt for another input
                } //ends if statement
                else{ //means input was a positive int
                    if (input2<=input1){ //second integer must be greater than first
                        System.out.println("Second integer must be greater than first. Please enter again: ");
                    } //ends if statement
                    else {//means input was appropriate
                        counter2++; //increases counter to break while loop
                    }//ends else statement
                } //ends else statement
            } //ends else statement
        } //ends while loop
        
        Random randNum=new Random(); //declares random number generator
        double[][][][] x=new double[3][][][]; //creates space for 4D array
        
        for (int i=0; i<3; i++){ //for each member of first dimension
            int rand1=randNum.nextInt(input2-input1)+input1;
            x[i]=new double[rand1][][]; //creates second dimension
            for (int j=0; j<x[i].length; j++){ //for each member of second dimension
                x[i][j]=new double[rand1][]; //creates third dimension
                for (int k=0; k<x[i][j].length; k++){ //for each member of third dimension
                    x[i][j][k]=new double [rand1]; //creates fourth dimension
                    for (int l=0; l<x[i][j][k].length; l++){
                        double randDoub=randNum.nextDouble()*30;
                        int randDoubInt=(int)(randDoub*10);
                        double randDoubFinal=randDoubInt/10.0;
                        x[i][j][k][l]=randDoubFinal; //generate random double up to 30
                    }
                } //ends for loop (k)
            }//ends for loop (j)
        } //ends for loop (i)
        
        
        printArray(x);
        statArray(x);
        System.out.println();
        System.out.println();
        //System.out.println("4D Sorted Array:");
        //System.out.println();
        //System.out.println();
        System.out.println("Sorted Array:");
        printArray(sort3DArray(sort4DArray(x)));
    } //end main method
       
    public static void printArray(double[][][][]x){ 
       
       System.out.print("{");
        for (int i=0; i<3; i++){
            System.out.print("{");
            for (int j=0; j<x[i].length; j++){ //for each member of second dimension
                System.out.print("{");
                for (int k=0; k<x[i][j].length; k++){ //for each member of third dimension
                    System.out.print("{");
                    for (int l=0; l<x[i][j][k].length; l++){
                        System.out.print(x[i][j][k][l]+",");
                    }
                    System.out.print("}");
                } //ends for loop (k)
                System.out.println("}");
            }//ends for loop (j)
            System.out.print("}");
            System.out.println();
            System.out.println();
        }
        System.out.print("}");
        System.out.println();
    }


    public static void statArray(double[][][][]y){ //method prints sum, mean, number of elements
        int elementCounter=0;
        double sum=0;
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[i].length; j++){
                for (int k=0; k<y[i][j].length; k++){
                    for (int l=0; l<y[i][j][k].length; l++){
                        sum+=y[i][j][k][l]; //adds element value to sum
                        elementCounter++; //increments element counter for each element
                    }
                }
            }
        }
        double mean=sum/elementCounter;
        System.out.println();
        System.out.println();
        System.out.println("Stats: ");
        System.out.println("elements: "+elementCounter);
        System.out.println("sum: "+sum);
        System.out.println("mean: "+mean);
        System.out.println();
        System.out.println();
    } //ends statsArray method
        

    public static double[][][][] sort4DArray(double[][][][] z){
        for (int i=0; i<2; i++){
                if(z[i+1].length<z[i].length){
                    double[][][] temp = z[i+1];
                    z[i+1]=z[i];
                    z[i]=temp;
                }
                else if(z[i+1].length==z[i].length){ //if 3D arrays are the same length
                    double min=z[i][0][0][0]; //sets min value as first value in array
                    int minIndex=i; //defines index of min number
                    for (int n=i; n<=i+1; n++){ //goes through first and second 3D array being compared
                        for (int m=0; m<z[n].length; m++){ //
                            for (int k=0; k<z[n][m].length; k++){
                                for (int l=0; l<z[n][m][k].length; l++){
                                    if (z[n][m][k][l]<min){
                                        minIndex=n;
                                    }
                                }
                            }
                        }
                        if (minIndex==(i+1)){
                            double[][][] temp2=z[i];
                            z[i]=z[i+1];
                            z[i+1]=temp2;
                        }
                    }
                }
        }
        return z;
    }
    
    public static double[][][][] sort3DArray(double[][][][] z){
        for (int i=0; i<z.length; i++){
            for (int j=0; j<z[i].length; j++){
                for (int k=0; k<z[i][j].length; k++){
                    for (int l=0; l<z[i][j][k].length-1; l++){
                        int minIndex=l;
                            for (int m=l+1; m<z[i][j][k].length; m++){
                                
                                if (z[i][j][k][minIndex]>z[i][j][k][m]){
                                    minIndex=m;
                                }
                            }
                            if (minIndex!=l){
                                double temp=z[i][j][k][l];
                                z[i][j][k][l]=z[i][j][k][minIndex];
                                z[i][j][k][minIndex]=temp;
                            
                            }
                    }
                }
            }
        }
        return z;
    }
    
} //end class