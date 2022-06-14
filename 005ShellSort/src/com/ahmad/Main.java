package com.ahmad;
/**
 * @author Bashir Ahmad
 */
public class Main {
    
    public static void main(String[] args) {
        int[] intArray = {20, 34, -15, 7, 55, 1, -22};
        
        System.out.println("Before Shell Sort: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
       } 
        
        //Shell Sort
        for(int gap = intArray.length/2; gap > 0; gap /=2){
            for(int i = gap; i<intArray.length; i++){
            
                int newElement = intArray[i];
                int j = i;
            
                while(j>= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                
                intArray[j] = newElement;
            }
        }
        System.out.println("\nAfter Sorting: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
    }
}