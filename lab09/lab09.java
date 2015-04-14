//Kathryn Kundrod
//CSE2
//Lab09

// The purpose of this lab is to practice methods

import java.util.Random;
import java.util.Scanner;

public class lab09{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int counter=0;
        while (counter<1){
            System.out.println("The "+adjective()+" "+subject()+" "+verb()+" by the "+adjective()+" "+object()+".");
            System.out.print("Would you like to generate another sentence? Enter Y or y to continue or any other key to quit:");
            String userInput=scan.next();
            if(userInput.equals("Y")||userInput.equals("y")){
            }
            else{
                counter++;
            }
        }
        
    }
    public static String adjective(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String adjOutput="";
        switch (randomInt){
            case 0: adjOutput="quick";
                    break;
            case 1: adjOutput="slow";
                    break;
            case 2: adjOutput="sly";
                    break;
            case 3: adjOutput="fun";
                    break;
            case 4: adjOutput="sneaky";
                    break;
            case 5: adjOutput="tired";
                    break;
            case 6: adjOutput="bright";
                    break;
            case 7: adjOutput="old";
                    break;
            case 8: adjOutput="young";
                    break;
            case 9: adjOutput="new";
                    break;
        }
        return adjOutput;
    }
    
    public static String subject(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String subjOutput="";
        switch (randomInt){
            case 0: subjOutput="dog";
                    break;
            case 1: subjOutput="cat";
                    break;
            case 2: subjOutput="mouse";
                    break;
            case 3: subjOutput="tiger";
                    break;
            case 4: subjOutput="bear";
                    break;
            case 5: subjOutput="bird";
                    break;
            case 6: subjOutput="turtle";
                    break;
            case 7: subjOutput="fish";
                    break;
            case 8: subjOutput="octopus";
                    break;
            case 9: subjOutput="shark";
                    break;
        }
        return subjOutput;
    }
        
    public static String verb(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String verbOutput="";
        switch (randomInt){
            case 0: verbOutput="ran";
                    break;
            case 1: verbOutput="skipped";
                    break;
            case 2: verbOutput="swam";
                    break;
            case 3: verbOutput="flew";
                    break;
            case 4: verbOutput="jumped";
                    break;
            case 5: verbOutput="leaped";
                    break;
            case 6: verbOutput="cried";
                    break;
            case 7: verbOutput="walked";
                    break;
            case 8: verbOutput="crawled";
                    break;
            case 9: verbOutput="slept";
                    break;
        }
        return verbOutput;
    }
    
    public static String object(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String objOutput="";
        switch (randomInt){
            case 0: objOutput="puppy";
                    break;
            case 1: objOutput="kitten";
                    break;
            case 2: objOutput="child";
                    break;
            case 3: objOutput="baby";
                    break;
            case 4: objOutput="joey";
                    break;
            case 5: objOutput="bunny";
                    break;
            case 6: objOutput="tadpole";
                    break;
            case 7: objOutput="goldfish";
                    break;
            case 8: objOutput="bug";
                    break;
            case 9: objOutput="ant";
                    break;
        }
        return objOutput;
    }
}