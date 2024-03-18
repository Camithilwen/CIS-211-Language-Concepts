
/**
 * Write a description of class Ex_7_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Arrays;
public class Ex_7_4
{
    
    public static void main () {
        
        main(null);
        
    }
    
    public static void main (String[] args) {
        
        int[] newIndex = randomIndex(11);
        
        System.out.println(Arrays.toString(newIndex));
        
        int indexMaximum = indexOfMax(newIndex);
        
        System.out.printf("Maximum value by for loop: %d\n", indexMaximum);
        //int index11 = indexMaximum[11];
        //System.out.printf("Index 11: %d\n",index11);
        
    }
    
    public static int[] randomIndex(int size){
        
        Random indexgen = new Random(42);
        int[] index = new int[size];
        for (int i = 0; i < index.length; i++) {
            
            index[i] = indexgen.nextInt(100); }
            
            return index;
            
        }
    
    public static int indexOfMax (int [] input) {
        int max = Integer.MIN_VALUE;
        int size = input.length;
        
        for (int i = 0; i < input.length; i++) {
            
            if (input [i] > max) {
                
                max = input[i];
            }
            
        }
        
        return max;
    }
    
    public static int maxindexbyRecursion (int [] input, int iterate) {
        
        int max = Integer.MIN_VALUE;
        int size = input.length - 1;
        
        
        if (size >= 0) {
            
            
            
        }
        
    }
    }

