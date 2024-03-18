
/**
 * Write a description of class MaxDemo2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class MaxDemo2
{
    
    public static void main() {
        main(null);
    }
    
    public static void main(String[] args) {
        
        int SIZE = 8;
        int MAX = 100;
        int [] ary = makeArray (SIZE, MAX);
        //System.out.println(Arrays.toString(ary) );
        int maxI = maxbyIteration(ary);
        System.out.printf("Max by iteration = %d \n", maxI);
        int maxR = maxByRecursion(ary, 0, ary.length-1);
        System.out.printf("Max by recursion = %d \n", maxR);
    }
    public static int maxByRecursion(int[] a, int low, int high) {
        //example (8-4)/2 + 4 = 4/2+4 = 6 which is half way from 4 to 8.
        int half = (high-low)/2 + low;
        System.out.printf("Debug: %d %d %d \n", low, half, high);
        if (low >= high) {
            
            return a[high];
            
        }
        int maxLeft = maxByRecursion(a, low, half);
        int maxRight = maxByRecursion(a, half+1, high);
        return Math.max(maxLeft, maxRight);
        
    }
    public static int[] makeArray (int size, int max) {
        
        int[] a = new int[size];
        int SEED = 42;
        Random generator = new Random(SEED);
        for (int i=0; i<size; i++) {
            a[i] = generator.nextInt(max);
        }
        return a;
        
    }
    
    public static int maxbyIteration(int[] a) {
        
        int maxSoFar = a[0];
        for (int i=0; i<a.length; i++) {
            if (a[i] > maxSoFar) {
                maxSoFar = a[i];
            }
        }
        return maxSoFar;
    }
}
