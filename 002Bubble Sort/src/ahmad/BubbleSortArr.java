package ahmad;
/**
 * @author Bashir Ahmad
 */
public class BubbleSortArr {
    
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
        
        System.out.println("Before Sorting: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
       } 
    
        //Bubble Sort Code
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            
            for(int i = 0; i< lastUnsortedIndex; i++ ){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        System.out.println("\nAfter Sorting: ");
         for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
       } 
    }
}
