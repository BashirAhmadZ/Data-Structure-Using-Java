package com.ahmad;
/**
 *
 * @author Bashir Ahmad
 */
public class Main {
    
    public static void swap(int[] array, int i, int j){
       
        if(i == j){
            return;
        }
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        
        int[] intArray = {20, 34, -15, 7, 55, 1, -22};
        
        System.out.println("Before Selection Sort: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        } 
        
        //Selection Sort
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            
            int largest = 0;
            
            for(int i = 1; i<= lastUnsortedIndex; i++ ){
                if(intArray[i] > intArray[largest]){
                    largest=i;
                }
            }
            
            swap(intArray, largest, lastUnsortedIndex);
        }
        System.out.println("\nAfter Sorting: ");
         for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
       }
   }
}

