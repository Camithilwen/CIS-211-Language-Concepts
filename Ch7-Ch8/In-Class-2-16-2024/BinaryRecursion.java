
/**
 * Write a description of class BinaryRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryRecursion
{
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args){
        int test = 23;
        DecimaltoBinary(test);
        System.out.println();
        
    }
    public static void DecimaltoBinary (int input){
        
        if (input > 0) {
            
            DecimaltoBinary(input/2);
            System.out.print(input % 2);
        
        }
    }
            
        }
        

