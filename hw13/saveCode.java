    public static void statArray(double[][][][]y){ //method prints sum, mean, number of elements
        int elementCounter=0;
        double sum=0;
        for (int i=0; i<y.length; i++){
            for (int j=0; j<y[].length; j++){
                for (int k=0; k<y[][].length; k++){
                    for (int l=0; l<y[][][].length; l++){
                        sum+=y[i][j][k][l]; //adds element value to sum
                        elementCounter++; //increments element counter for each element
                    }
                }
            }
        }
        double mean=sum/elementCounter;
        System.out.println("elements: "+elementCounter);
        System.out.println("sum: "+sum);
        System.out.println("mean: "+mean);
    } //ends statsArray method
    
    
    
    
    
    
    

    public static double[][][][] sort4DArray(double [][][][]z){
        for (int i=0; i<3; i++){
            java.util.Arrays.sort(z[i]); //change to insertion sort
        }
        return z;
    } //ends sort 4DArray method
    
    {{{{16.0,0.8,}{25.0,16.5,}}{{7.6,25.4,}{19.3,18.1,}}}{{{22.2,5.1,}{9.8,24.3,}}{{22.5,20.0,}{27.5,15.5,}}}{{{1.6,2.2,}{29.1,7.7,}}{{26.4,28.7,}{3.5,17.1,}}}}
    
    {{{{3.1, 28.3}}, {{24.7, 14.3}}}, {{{26.5, 9.8}}, {{14.3, 16.5}}}, {{{21.8, 26.2}}, {{12.0, 24.9}}}}
    {{{{13.1,18.5,}}{{20.1,7.8,}}}{{{7.6,17.2,}}{{6.2,4.3,}}}}{{{{8.6,15.0,}}{{18.5,24.7,}}}{{{20.9,27.9,}}{{19.9,25.2,}}}}{{{{26.9,0.2,}}{{2.6,13.3,}}}{{{18.8,26.0,}}{{13.5,7.0,}}}}
    {{{{1.6,14.3,}{18.5,21.2,}}{{15.5,12.0,}{3.4,19.6,}}}{{{6.0,16.3,}{14.9,2.9,}}{{13.9,17.5,}{28.4,8.5,}}}{{{11.0,22.8,}{2.4,14.7,}}{{17.4,18.3,}{3.2,7.9,}}}}