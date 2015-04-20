// Kathryn Kundrod
// CSE2 LAB12

import java.util.Random;

public class MultidimensionalArrays{
    public static void main(String[] args){
        
        Random randNum=new Random();
        int randWidth1=randNum.nextInt(4)+1;
        int randHeight1=randNum.nextInt(4)+1;
        int randWidth2=randNum.nextInt(4)+1;
        int randHeight2=randNum.nextInt(4)+1;

        System.out.println("Generating a matrix with width "+randWidth1+" and height "+randHeight1+": ");
        int[][] array1Filled=increasingMatrix(randWidth1, randHeight1, true);
        printMatrix(array1Filled, true);
        System.out.println("Generating a matrix with width "+randWidth1+" and height "+randHeight1+": ");
        int[][] array2Filled=increasingMatrix(randWidth1, randHeight1, false);
        printMatrix(array2Filled, false);
        System.out.println("Generating a matrix with width "+randWidth2+" and height "+randHeight2+": ");
        int[][] array3Filled=increasingMatrix(randWidth2, randHeight2, true);
        printMatrix(array3Filled, true);
        System.out.println("Sum of first and second matrix is: ");
        int[][] sum1And2=addMatrix(array1Filled, true, array2Filled, false);
        printMatrix(sum1And2,true);
        System.out.println("Sum of first and third matrix is: ");
        int[][] sum1And3=addMatrix(array1Filled, true, array3Filled, false);
        printMatrix(sum1And3, true);
        
    }
    
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][] array1=new int[width][];
        
        for (int widthCounter=0; widthCounter<width; widthCounter++){
            array1[widthCounter]=new int[height];
        }
        int counter=1;
        if (format==true){
            for (int i=0; i<height; i++){
                for (int j=0; j<width; j++){
                    array1[j][i]=counter;
                    counter++;
                }
            }
        }
        else{
            for (int i=0; i<width; i++){
                for (int j=0; j<height; j++){
                    array1[i][j]=counter;
                    counter++;
                }
            }
        }
        return array1;
    }
    public static void printMatrix(int[][]array,boolean format){
        if (array==null){
            System.out.println("The array was empty!");
        }
        else{
            int height=array[0].length;
            int width=array.length;
            if (format==true){
                for (int k=0; k<height; k++){
                    for (int l=0; l<width; l++){
                        System.out.print(array[l][k]+" ");
                    }
                    System.out.println();
                }
            }
            else{
                array=translate(array);
                for (int k=0; k<height; k++){
                    for (int l=0; l<width; l++){
                        System.out.print(array[l][k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    
    public static int[][] translate(int[][]array){
        int[][] translatedArray=new int[array.length][];
        for (int widthCounter=0; widthCounter<array.length; widthCounter++){
            translatedArray[widthCounter]=new int[array[0].length];
        }
        int counter=1;
        for (int i=0; i<array[0].length; i++){
            for (int j=0; j<array.length; j++){
                translatedArray[j][i]=counter;
                counter++;
            }
        }
        return translatedArray;
    }
    
    public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
        if (formata==false){
            a=translate(a);
        }
        if(formatb==false){
            b=translate(b);
        }
        int heightA=a[0].length;
        int widthA=a.length;
        int heightB=b[0].length;
        int widthB=b.length;
        if (heightA==heightB&&widthA==widthB){
            int[][] arraySum=new int[widthA][heightA];
            for(int j=0; j<heightA; j++){
                for (int i=0; i<widthA; i++){
                    arraySum[i][j]=a[i][j]+b[i][j];
                }
            }
            return arraySum;
        }
        else{
            System.out.println("The arrays cannot be added!");
            return null;
        }
    }
    

}