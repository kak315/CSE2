// Kathryn Kundrod
// CSE2 HW6
// March 3, 2015

// MakeSymbols generates and prints a random integer between 0 and 100.
// If the number is even, MakeSymbols prints that many asterics (*).
// If the number is odd, MakeSymbols prints that many ampersand symbols (&).

public class MakeSymbols { //declares class
    public static void main (String[] args){ //declares main method
    
    int randomNumber=(int)(Math.random()*100)+(int)(Math.random()*10); //generates random number between 0 and 100
    System.out.println("Random number generated: "+randomNumber); //prints random number
    
    //Declare and initialize variables for generating patterns
    String asteric = "*"; //will be used to modify astericPattern
    String astericPattern = ""; //will be modified in loops
    String ampersand = "&"; //will be used to modify ampersandPattern
    String ampersandPattern = ""; //will be modified in loops
    
    int counter=0;
    if (randomNumber%2==0){
        do {
            astericPattern += asteric;
            counter++;
        } while (counter<randomNumber);
        System.out.println("The output pattern: "+astericPattern);
    }
    else {
        do {
            ampersandPattern += ampersand;
            counter++;
        } while (counter<randomNumber);
        System.out.println("The output pattern: "+ampersandPattern);
    }
    
    
} // ends main method
} //ends class