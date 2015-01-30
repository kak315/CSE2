// Kathryn Kundrod
// January 30, 2015
// CSE2

// Cyclometer reports on bike trip data

public class Cyclometer {
        public static void main (String[] args) {
            
            // our input data
            int secsTrip1=480; // Trip 1 length in seconds
            int secsTrip2=3220; // Trip 2 length in seconds
            int countsTrip1=1561; // Trip 1 wheel rotations
            int countsTrip2=9037; // Trip 2 wheel rotations
            
            // our intermediate variables for output data
            double wheelDiameter=27.0, // Wheel diameter in inches
            PI=3.14159, // Value of Pi
            feetPerMile=5280, // Conversion factor
            inchesPerFoot=12, // Conversion factor
            secondsPerMinute=60; //Conversion factor
            double distanceTrip1, distanceTrip2, totalDistance; // Calculated trip distance values
            
            // print output data
            System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
                " minutes and had "+countsTrip1+" counts.");
            System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
                " minutes and had "+countsTrip2+" counts.");
                
            // calculate trip distances
            distanceTrip1=countsTrip1*wheelDiameter*PI; //Gives Trip 1 distance in inches
            distanceTrip1/=inchesPerFoot*feetPerMile; //Gives Trip 1 distance in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Gives Trip 2 distance in miles
            totalDistance=distanceTrip1+distanceTrip2; //Gives total distance
            
            // print output data
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");
            
            
        }
}