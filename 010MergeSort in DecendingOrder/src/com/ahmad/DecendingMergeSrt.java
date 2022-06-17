package com.ahmad;
/**
 * 16 Jun 2022
 * @author Bashir Ahmad
 */
public class DecendingMergeSrt {
    
    public static void main(String[] args) {
        int[] intArray = {20, 34, -15, 7, 55, 1, -22};
        
        mergeSort(intArray, 0, intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        } 
        
    }
    
    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        
        int mid = (start + end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if(input[mid-1] >= input[mid]){
            return;
        }
        
        int i = start;
        int j = mid;
        int temIndex =0;
        
        int[] temp = new int[end-start];
        while (i<mid && j<end) {
            temp[temIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + temIndex, mid-i);
        System.arraycopy(temp, 0, input, start, temIndex);
    }
}
