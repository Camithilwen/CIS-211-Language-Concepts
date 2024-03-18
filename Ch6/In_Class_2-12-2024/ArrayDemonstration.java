
/**
 * Write a description of class ArrayDemonstration here.
 *
 * @author Jamie Kemman
 * @version V1.0
 */
import java.util.Random;
public class ArrayDemonstration
{
    public static void main() {
        
        main(null);
        
    }
    
    public static void main (String[] args) {
        
    int one_integer = 100;
    int[] array1 = new int[5]; //five zeros.
    int[] array2 = {1, 2, 3, 4, 5}; // another way to create an array.
    //
    printArray(array1);
    printArray(array2); //arrays can be printed using for loops
    //
    int sum1 = getSum(array1);
    int sum2 = getSum(array2);
    System.out.println("Sum of array1 = " + sum1);
    System.out.println("Sum of array2 = " + sum2);
    
    }
    
    
    public static void printArray(int[] ary) {
        
        for (int i = 0; i < ary.length; i++) {
            
            System.out.printf("\n%d \n", ary[i]);
            
        }
        
    }
    
    public static int[] getRandomArray (int size, int max) {
        
        int[] ary = new int [size];
        Random generator = new Random();
        for (int i = 0; i<size; i++) {
            
            ary[i] = generator.nextInt(max);
            
        }
        return ary;
    }
    
    
    public static int getSum(int[] ary) {
        
        int sum = 0;
        
        for (int n : ary) {
            
            
            
        }
        return sum;
        
    }
    
}
