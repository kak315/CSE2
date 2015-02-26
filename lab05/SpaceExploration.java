// Kathryn Kundrod
// CSE2 lab05
// February 27, 2015

// SpaceExploration.java generates a random year from 2000 to 2010
// then prints out a timeline of significant events that happened
// in space exploration from 2000 until the generated year

public class SpaceExploration { //creates class
    public static void main (String[] args){ //creates main method
        int year =(int)(Math.random()*11) + 2000; // provides a randomly generated year between 2000 and 2010
        System.out.println("Here is a timeline of space exploration from "+year+" to 2000."); //prints context for user
        
        switch (year){ // starts with randomly generated year then prints all events dating back to 2000 
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back.");
            case 2009:
                System.out.println("2009: N/A.");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space.");
            case 2007:
                System.out.println("2007: N/A.");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet.");
            case 2005:
                System.out.println("2005: Spacecraft collies with comet.");
            case 2004:
                System.out.println("2004: N/A.");
            case 2003:
                System.out.println("2003: Largest infrared telescope released.");
            case 2002:
                System.out.println("2002: N/A.");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid.");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid.");
                break;
        } // ends switch statement

    } // ends main method
} // ends class