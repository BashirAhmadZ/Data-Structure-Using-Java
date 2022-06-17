package com.ahmad;
/**
 * 16 Jun 2022
 * @author Bashir Ahmad
 */
public class SortString {
    public static void main(String[] args) {
        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        
        //do radix sort
        radixSort(stringArray, 26, 5);
        
        System.out.println("After Insertion Sort: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]+" ");
        }
    }
    
    public static void radixSort(String[] input, int radix, int width){
    
        for (int i = width - 1; i >= 0; i--) {
            radixStringSrt(input, i, radix);
        }
    }

    public static void radixStringSrt(String[] input, int position, int radix) {
        
        int numItems = input.length;
        int[] countArray = new int[radix];
        
        for(String value: input){
            countArray[getIndex(position, value)]++;
        } 
        //Adjust the count array
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }
        
        String[] temp = new String[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }
        
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static  int getIndex(int position, String value){
        return value.charAt(position) - 'a';
    }
}
