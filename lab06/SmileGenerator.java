// Kathryn Kundrod
// CSE2 lab06
// March 6, 2015

// Smile Generator will print five smiley faces using:
// 1. non-nested for loops
// 2. while loops
// 3. do-while loops
// Then, the smile generator will take an input and 
// print that number of smiley faces.
// Third, the smile generator will print a max of
// 30 smiley faces per line
// Fourth, a fourth loop will increase the number of
// smiley faces per line by one on each line

public class SmileGenerator {
    public static void main (String[] args){
        // Step 1: print five smileys on one line using for, while, and do while loops
        System.out.println("Part 1: ");
        for (int i=1; i<6; i++){ // prints five smileys using a for loop
            System.out.print(":) ");
        }
        System.out.println(); //prints a new line after the five smileys
        
        int j=0; // initialize counter
        while (j<5){ // prints five smileys using a while loop
            System.out.print(":) ");
            j++;
        }
        System.out.println(); // prints a new line after the five smileys
        
        int k=0; // initialize counter
        do { // prints five smileys using a do while loop
            System.out.print(":) ");
            k++;
        } while (k<5);
        System.out.println(); // prints a new line after the five smileys
        
        //Step 2: generate a random number between 1 and 100  and print that many smileys
        System.out.println("Part 2: ");
        int numberOfSmileys = (int)(Math.random()*100)+(int)(Math.random()*10);
        int l=0; // initialize counter
        while (l<numberOfSmileys){
            System.out.print(":) ");
            l++;
        }
        System.out.println();
        
        //Step 3: limit the number of smileys on any line to 30
        System.out.println("Part 3: ");
        int m=0; // initialize counter
        int n=1; // initialize counter
        while(m<numberOfSmileys){
            
            if (numberOfSmileys<=30){ 
                System.out.print(":) ");
                m++;
            }
            
            else if (numberOfSmileys>30 && numberOfSmileys<=60){
                while (n<=30){
                    System.out.print(":) ");
                    n++;
                    m++;
                }
                System.out.println();
                while (n>30 && n<=numberOfSmileys){
                    System.out.print(":) ");
                    n++;
                    m++;
                }
                System.out.println();
            } // ends else if statement
            
            else if (numberOfSmileys>60 && numberOfSmileys<=90){
                while (n<=30){
                    System.out.print(":) ");
                    n++;
                    m++;
                }
                System.out.println();
                while (n>30 && n<=60){
                    System.out.print(":) ");
                    n++;
                    m++;
                }
                System.out.println();
                while (n>60 && n<=numberOfSmileys){
                    System.out.print(":) ");
                    n++;
                    m++;
                }
                System.out.println();
            } // ends else if statement
            
            else if (numberOfSmileys>90 && numberOfSmileys<=100){
                while (n<=30){
                    System.out.print(":) ");
                    n++;
                    m++;
                } //ends while loop
                System.out.println();
                while (n>30 && n<=60){
                    System.out.print(":) ");
                    n++;
                    m++;
                } // ends while loop
                System.out.println();
                while (n>60 && n<=90){
                    System.out.print(":) ");
                    n++;
                    m++;
                } // ends while loop
                System.out.println();
                while (n>90 && n<=numberOfSmileys){
                    System.out.print(":) ");
                    n++;
                    m++;
                } // ends while loop
                System.out.println();
            } // ends else if statement
            } // ends while loop
            System.out.println();
            
            // part 4: print ten lines of smileys using one loop with one additional smiley on each line
            System.out.println("Part 4: ");
            String smiley = ":) ";
            String smileyToAdd = ":) ";
            for (int o=1; o<=10; o++){ //stops at 10 lines
            System.out.println(smiley);
            smiley += smileyToAdd; // increments smileys printed on each line by 1 until 10 are printed
            }
            
        } // ends main method
        
        } // ends class
        
    
