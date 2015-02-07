// Kathryn Kundrod
// Febrary 10, 2015
// CSE2 HW3 Program 1

import java.util.Scanner; // Allows for user inputs

// Define class and main method
public class Bicycle {
    public static void main(String[] args) {
        
    Scanner myScanner; // Declares an instance of the Scanner object
    myScanner=new Scanner ( System.in ); // Takes input from user
        
    // Asks for and stores user inputs
    System.out.print("Enter the number of counts: "); // User enters number of counts on the cyclometer
    int counts=myScanner.nextInt();
    System.out.print("Enter the number of seconds: "); // User enters length of trip in seconds
    int timeInSeconds=myScanner.nextInt(); 
    
    // Define constants
    // Adapted from lab 02
    final double wheelDiameter=27.0,
  	PI=3.14159,
  	feetPerMile=5280,
  	inchesPerFoot=12,
  	secondsPerMinute=60,
  	minutesPerHour=60;
  	
  	// Define variables
	double distance;
	double timeInMinutes;
	double timeInHours;
	double milesPerHour;
	
	// Calculate distance, length, and speed of trip
	// Adapted from lab 02
	distance=(int)(100*counts*wheelDiameter*PI/inchesPerFoot/feetPerMile)/100.0; // Calculate distance in miles, limiting digits
	timeInMinutes=(int)(100*timeInSeconds/secondsPerMinute)/100.0; // Convert time from seconds to minutes, limiting digits
	timeInHours=(int)(100*timeInMinutes/minutesPerHour)/100.0; // Convert time from minutes to hours, limiting digits
	milesPerHour=(int)(100*distance/timeInHours)/100.0; // Calculate average speed, limiting digits

        
    // Print distance, time, and speed of trip
    System.out.println("The distance was " +distance+ " miles and took " +timeInMinutes+ " minutes.");
    System.out.println("The average speed was " +milesPerHour+ " MPH.");
        
    }
}
