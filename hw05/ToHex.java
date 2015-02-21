// Kathryn Kundrod
// CSE2
// HW5
// February 23, 2015

import java.util.Scanner; // allows for user inputs

public class ToHex { // declares class
    public static void main (String[] args){ // declares main method
        
        Scanner scan = new Scanner (System.in); //declares and constructs Scanner "scan"
        
        System.out.println("Please enter three integer values representing RGB values: "); // requests RGB values

        
        
        
        if (scan.hasNextInt()){ // checks if first input is an integer
            int valueR = scan.nextInt(); // stores R value
            
            if(scan.hasNextInt()){ // checks if second input is an integer
                int valueG = scan.nextInt(); // stores G value
                
                if(scan.hasNextInt()){ // checks if third input is an integer
                    int valueB = scan.nextInt(); // stores B value
                    
                    if (valueR>=0 && valueR<=255 && valueB>=0 && valueB<=255 && valueG>=0 && valueG<=255){ // checks if all inputs are in the right range
                    
                    int zeroR = valueR%16; // stores hex value to be multiplied by 16^0 for R
                    int oneR = valueR/16;  // stores hex value to be multiplied by 16^1 for R
                    String zeroStringR=""; // declares string to be reassigned in switch statement based on user input
                    String oneStringR=""; // declares string to be reassigned in switch statement based on user input
                    
                    int zeroG = valueG%16; // stores hex value to be multiplied by 16^0 for G
                    int oneG = valueG/16;  // stores hex value to be multiplied by 16^1 for G
                    String zeroStringG=""; // declares string to be reassigned in switch statement based on user input
                    String oneStringG=""; // declares string to be reassigned in switch statement based on user input
                    
                    int zeroB = valueB%16; // stores hex value to be multiplied by 16^0 for B
                    int oneB = valueB/16;  // stores hex value to be multiplied by 16^1 for B
                    String zeroStringB=""; // declares string to be reassigned in switch statement based on user input
                    String oneStringB=""; // declares string to be reassigned in switch statement based on user input
                    
                    switch (zeroR) { // reassigns R value (for*16^0) to string type in hex convention
                        case 0:
                            zeroStringR="0";
                            break;
                        case 1:
                            zeroStringR="1";
                            break;
                        case 2:
                            zeroStringR="2";
                            break;
                        case 3:
                            zeroStringR="3";
                            break;
                        case 4:
                            zeroStringR="4";
                            break;
                        case 5:
                            zeroStringR="5";
                            break;
                        case 6:
                            zeroStringR="6";
                            break;
                        case 7:
                            zeroStringR="7";
                            break;
                        case 8:
                            zeroStringR="8";
                            break;
                        case 9:
                            zeroStringR="9";
                            break;
                        case 10:
                            zeroStringR="A";
                            break;
                        case 11:
                            zeroStringR="B";
                            break;
                        case 12:
                            zeroStringR="C";
                            break;
                        case 13:
                            zeroStringR="D";
                            break;
                        case 14:
                            zeroStringR="E";
                            break;
                        case 15:
                            zeroStringR="F";
                            break;
                    }
                            
                            switch (oneR) { // reassigns R value (for*16^1) to string type in hex convention
                                case 0:
                                    oneStringR="0";
                                    break;
                                case 1:
                                    oneStringR="1";
                                    break;
                                case 2:
                                    oneStringR="2";
                                    break;
                                case 3:
                                    oneStringR="3";
                                    break;
                                case 4:
                                    oneStringR="4";
                                    break;
                                case 5:
                                    oneStringR="5";
                                    break;
                                case 6:
                                    oneStringR="6";
                                    break;
                                case 7:
                                    oneStringR="7";
                                    break;
                                case 8:
                                    oneStringR="8";
                                    break;
                                case 9:
                                    oneStringR="9";
                                    break;
                                case 10:
                                    oneStringR="A";
                                    break;
                                case 11:
                                    oneStringR="B";
                                    break;
                                case 12:
                                    oneStringR="C";
                                    break;
                                case 13:
                                    oneStringR="D";
                                    break;
                                case 14:
                                    oneStringR="E";
                                    break;
                                case 15:
                                    oneStringR="F";
                                    break;
                            }
                    
                    
                                switch (zeroG) { // reassigns G value (for*16^0) to string type in hex convention
                                    case 0:
                                        zeroStringG="0";
                                        break;
                                    case 1:
                                        zeroStringG="1";
                                        break;
                                    case 2:
                                        zeroStringG="2";
                                        break;
                                    case 3:
                                        zeroStringG="3";
                                        break;
                                    case 4:
                                        zeroStringG="4";
                                        break;
                                    case 5:
                                        zeroStringG="5";
                                        break;
                                    case 6:
                                        zeroStringG="6";
                                        break;
                                    case 7:
                                        zeroStringG="7";
                                        break;
                                    case 8:
                                        zeroStringG="8";
                                        break;
                                    case 9:
                                        zeroStringG="9";
                                        break;
                                    case 10:
                                        zeroStringG="A";
                                        break;
                                    case 11:
                                        zeroStringG="B";
                                        break;
                                    case 12:
                                        zeroStringG="C";
                                        break;
                                    case 13:
                                        zeroStringG="D";
                                        break;
                                    case 14:
                                        zeroStringG="E";
                                        break;
                                    case 15:
                                        zeroStringG="F";
                                        break;
                                }
                                        
                                        switch (oneG) { // reassigns G value (for*16^1) to string type in hex convention
                                            case 0:
                                                oneStringG="0";
                                                break;
                                            case 1:
                                                oneStringG="1";
                                                break;
                                            case 2:
                                                oneStringG="2";
                                                break;
                                            case 3:
                                                oneStringG="3";
                                                break;
                                            case 4:
                                                oneStringG="4";
                                                break;
                                            case 5:
                                                oneStringG="5";
                                                break;
                                            case 6:
                                                oneStringG="6";
                                                break;
                                            case 7:
                                                oneStringG="7";
                                                break;
                                            case 8:
                                                oneStringG="8";
                                                break;
                                            case 9:
                                                oneStringG="9";
                                                break;
                                            case 10:
                                                oneStringG="A";
                                                break;
                                            case 11:
                                                oneStringG="B";
                                                break;
                                            case 12:
                                                oneStringG="C";
                                                break;
                                            case 13:
                                                oneStringG="D";
                                                break;
                                            case 14:
                                                oneStringG="E";
                                                break;
                                            case 15:
                                                oneStringG="F";
                                                break;
                                        }
                                                
                                                switch (zeroB) { // reassigns B value (for*16^0) to string type in hex convention
                                                    case 0:
                                                        zeroStringB="0";
                                                        break;
                                                    case 1:
                                                        zeroStringB="1";
                                                        break;
                                                    case 2:
                                                        zeroStringB="2";
                                                        break;
                                                    case 3:
                                                        zeroStringB="3";
                                                        break;
                                                    case 4:
                                                        zeroStringB="4";
                                                        break;
                                                    case 5:
                                                        zeroStringB="5";
                                                        break;
                                                    case 6:
                                                        zeroStringB="6";
                                                        break;
                                                    case 7:
                                                        zeroStringB="7";
                                                        break;
                                                    case 8:
                                                        zeroStringB="8";
                                                        break;
                                                    case 9:
                                                        zeroStringB="9";
                                                        break;
                                                    case 10:
                                                        zeroStringB="A";
                                                        break;
                                                    case 11:
                                                        zeroStringB="B";
                                                        break;
                                                    case 12:
                                                        zeroStringB="C";
                                                        break;
                                                    case 13:
                                                        zeroStringB="D";
                                                        break;
                                                    case 14:
                                                        zeroStringB="E";
                                                        break;
                                                    case 15:
                                                        zeroStringB="F";
                                                        break;
                                                }
                                                        
                                                        switch (oneB) { // reassigns B value (for*16^1) to string type in hex convention
                                                            case 0:
                                                                oneStringB="0";
                                                                break;
                                                            case 1:
                                                                oneStringB="1";
                                                                break;
                                                            case 2:
                                                                oneStringB="2";
                                                                break;
                                                            case 3:
                                                                oneStringB="3";
                                                                break;
                                                            case 4:
                                                                oneStringB="4";
                                                                break;
                                                            case 5:
                                                                oneStringB="5";
                                                                break;
                                                            case 6:
                                                                oneStringB="6";
                                                                break;
                                                            case 7:
                                                                oneStringB="7";
                                                                break;
                                                            case 8:
                                                                oneStringB="8";
                                                                break;
                                                            case 9:
                                                                oneStringB="9";
                                                                break;
                                                            case 10:
                                                                oneStringB="A";
                                                                break;
                                                            case 11:
                                                                oneStringB="B";
                                                                break;
                                                            case 12:
                                                                oneStringB="C";
                                                                break;
                                                            case 13:
                                                                oneStringB="D";
                                                                break;
                                                            case 14:
                                                                oneStringB="E";
                                                                break;
                                                            case 15:
                                                                oneStringB="F";
                                                                break;
                                                        }
                                            
                        // Print the product of hex conversion:
                        System.out.println("The decimal numbers R:"+valueR+", G:"+valueG+
                            ", B:"+valueB+" are represented in hexadecimal as "+oneStringR+
                            zeroStringR+oneStringG+zeroStringG+oneStringB+zeroStringB+".");
                                                      
                    }
                    else { // ends program if numbers are not valid RGB inputs
                        System.out.println("Invalid input: integer(s) not in RGB range.");
                        return;
                    }
                }
                else { //ends program if third input is not an integer
                    System.out.println("All inputs must be integers.");
                    return;
                }
            }
            else { //ends program if second input is not an integer
                System.out.println("All inputs must be integers.");
                return;
            }
        }
        else { //ends program if first input is not an integer
            System.out.println("All inputs must be integers.");
            return;
        }
    } // ends main method
} // ends class

        
    
