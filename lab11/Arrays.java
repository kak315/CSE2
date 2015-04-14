// Kathryn Kundrod
// CSE2 Lab11

import java.util.Scanner;
import java.util.Random;

public class Arrays{
    public static void main (String[] args){
        int[] array1 = new int[50];
        Random randNum=new Random();
        for (int i=0; i<50; i++){
            array1[i]=randNum.nextInt(100);
        }
        int linearMin1=array1[0];
        for (int j=0; j<50; j++){
            if (array1[j]<linearMin1){
                linearMin1=array1[j];
            }
        }
        int linearMax1=array1[0];
        for (int k=0; k<50; k++){
            if (array1[k]>linearMax1){
                linearMax1=array1[k];
            }
        }
        System.out.println("The min value of array1 is "+linearMin1);
        System.out.println("The max value of array1 is "+linearMax1);
        
        int[] array2=new int[50];
        array2[0]=randNum.nextInt(100);
        for (int l=1; l<50; l++){
            int randNumToAdd=randNum.nextInt(100);
            array2[l]=array2[l-1]+randNumToAdd;
        }
        
        int linearMin2=array2[0];
        for (int m=0; m<50; m++){
            if (array2[m]<linearMin2){
                linearMin2=array2[m];
            }
        }
        int linearMax2=array2[0];
        for (int n=0; n<50; n++){
            if (array2[n]>linearMax2){
                linearMax2=array2[n];
            }
        }
        System.out.println("The min value of array2 is "+linearMin2);
        System.out.println("The max value of array2 is "+linearMax2);
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an int: ");
        if (!scan.hasNextInt()){
            System.out.println("You did not enter an int.");
        }
        else{
            int userInput=scan.nextInt();
            if (userInput<0){
                System.out.println("You did not enter an int>=0.");
            }
            else{
                int counter=0;
                int low=0; //method for binary search adapted from method found online at http://www.cs.toronto.edu/~reid/search/bincode.html
                int high=49;
                while (high>=low && counter<1){
                    int middle =(low+high)/2;
                    if (userInput==array2[middle]){
                        System.out.print(userInput+" was found in the list.");
                        counter++;
                    }
                    else if(userInput>array2[middle]){
                        low=middle+1;
                    }
                    else{
                        high=middle-1;
                    }
                }
                System.out.println(userInput+" was not found in the list.");
                System.out.println("The number above the key was "+array2[low]);
                System.out.println("The number below the key was "+array2[high]);
            }
            
        }
        
        
    }
}