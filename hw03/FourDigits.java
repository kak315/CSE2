// Kathryn Kundrod
// February 10, 2015
// CSE2 HW3 Program 3

import java.util.Scanner; // Allows for user inputs

// Define class and main method
public class FourDigits {
    public static void main(String[] args) {
        
        Scanner myScanner; // Declares an instance of the scanner object
        myScanner = new Scanner ( System.in ); // Takes input
        
        // Ask user for a double
        System.out.print("Enter a double, and I display the four digits to the right of the decimal point: ");
        double input=myScanner.nextDouble();
        
        // Define variables for storing digits to the right of decimal point
        int tenths,
            hundredths,
            thousandths,
            tenThousandths;
        
        // Isolate and store individual digits as ints
        tenths=(int)(input*10)%10; //Stores tenths place
        hundredths=(int)(input*100)%10; //Stores hundredths place
        thousandths=(int)(input*1000)%10; //Stores thousandths place
        tenThousandths=(int)(input*10000)%10; //Stores ten-thousandths place
        
        //Print the four digits to the right of the decimal point
        System.out.println("The four digits are "+tenths+hundredths+thousandths+tenThousandths); 

        
    }
}

