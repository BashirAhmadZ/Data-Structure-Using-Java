package ahmad.it;
/**
 * @author Bashir Ahmad
 */
public class FirstArray {
    
    public static void main(String[] args) {
        int[] intArray = new int[7];
        
        intArray[0] = 20;
        intArray[1] = 34;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            //System.out.println(intArray[i]);
            if(intArray[i] == 55){
                index = i;
                break;
            }
        }
        System.out.println("Index = "+index);
    }
}
