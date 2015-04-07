//Kathryn Kundrod
//CSE2 HW10
//April 7, 2015

import java.util.Scanner; 
public class RemoveElements{
  public static void main(String [] arg){ //main method was copied and pasted from HW instructions
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(){ //produces a random array with 10 entries
  	int [] randomArray = new int[10]; //declares an array with 10 entries
  	for (int i=0; i<10; i++){
  		randomArray[i]=(int)(Math.random()*10); //builds array with random numbers from 0-9
  	}
  	return randomArray; //returns random array
  }
  
  public static int[] delete(int[] list, int pos){ //method for deleting a position
  	if (pos>list.length||pos<0){ //checks for invalid input
  		System.out.println("The index is not valid.");
  		return list; //returns original array if input is invaled
  	}
  	else{ // if input is valid, entry in pos position is deleted
	  	int arraySize=list.length-1; //changes size of array to be one fewer than the entry (9)
	  	int[] arrayWithoutPos=new int[arraySize]; //declares new array with size 9
	  	for (int i=0; i<=arraySize; i++){ //creates new array
	  		if (i==pos){ // doesn't add an entry if in pos position
	  		}
	  		else if(i<pos){ //if i is less than the pos entry, copy entries from list
	  			arrayWithoutPos[i]=list[i];
	  		}
	  		else{ //if i is grater than pos entry, copy next position entries from list
	  			arrayWithoutPos[i-1]=list[i];
	  		}
	  	}
	  	return arrayWithoutPos; //return new array
  	}
  }
  
  public static int[] remove(int[] list, int target){ //deletes specific values from array
  	int counter=0; //counter to determine length of array
  	for(int i=0; i<list.length; i++){
  		if (list[i]==target){
  			counter++; //add one to counter if target value appears in array
  		}
  	}
  	int placeShifter=0; //counter to shift entries if target value is identified
  	int[] arrayWithoutTarget=new int[list.length-counter]; //new array of the right length
  	for (int j=0; j<=(list.length-counter); j++){ //creates new array
  		if (list[j]==target){
  			placeShifter++; //determines how many places should be shifted in copying array; doesn't do anything if target value is reached
  		}
  		else{
  			arrayWithoutTarget[j-placeShifter]=list[j]; //adds correctly shifted entries without adding target values
  		}
  	}
  	return arrayWithoutTarget; //returns new array
  }
}