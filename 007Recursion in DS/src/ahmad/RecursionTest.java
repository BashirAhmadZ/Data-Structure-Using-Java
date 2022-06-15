package ahmad;
/**
 * @author Bashir Ahmad
 */
public class RecursionTest {
    
    public static void main(String[] args) {
        System.out.println(iterativeFunction(3));
        System.out.println(recursiceFunction(3));
    }
    
    public static int recursiceFunction(int num){
        if(num == 0){
            return 1;
        }
        
        return num * recursiceFunction(num-1);
    }
    
    public static int iterativeFunction(int num){
        if(num == 0){
            return 1;
        }
        
        int factorial = 0;
        for(int i = 1; i<= num; i++){
            factorial += i;
        }
        
        return factorial;
    }
}
