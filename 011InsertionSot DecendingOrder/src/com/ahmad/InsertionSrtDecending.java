package com.ahmad;
/**
 * 16 Jun 2022
 * @author Bashir Ahmad
 */
public class InsertionSrtDecending {
    public static void main(String[] args) {
        int[] intArray = {20, 34, -15, 7, 55, 1, -22};
        
        System.out.println("Before Insertion Sort: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        } 
        
        insertionSort(intArray, intArray.length);
        
//      Instead of loop we can use recursion
        
//        for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
//            
//            int newElement = intArray[firstUnsortedIndex];
//            int i;
//            
//            for(i = firstUnsortedIndex; i>0 && intArray[i-1]<newElement; i-- ){
//                intArray[i] = intArray[i-1];
//            }
//            intArray[i] = newElement;
//        }
        
    }
    
    public static void insertionSort(int[] input, int numItems){
        
        if(numItems < 2){
            return;
        }
        
        insertionSort(input, numItems-1);
        int newElement = input[numItems-1];
        int i;
            
        for(i = numItems-1; i>0 && input[i-1]<newElement; i-- ){
            input[i] = input[i-1];
        }
        input[i] = newElement;
            
        System.out.println("\nResult of Call when NumItems = " + numItems);
        for(i = 0; i < input.length; i++) {
            System.out.print(input[i]+", ");
        } 
    }
}
