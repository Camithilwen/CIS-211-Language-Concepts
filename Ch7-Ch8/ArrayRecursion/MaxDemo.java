import java.util.Random;
import java.util.Arrays;
/**
 * Here is a solution to ThinkJava exercise 8-6.
 * Find the maximum element in an array of random ints.
 * First, do this by iteration.
 * Second, do this by recursion.
 * Finally, compare the two results.
 * 
 * @author Jason Miller
 */
public class MaxDemo { 

    public static void main() {
        main(null);
    }

    public static void main(String [] args) {
        int SIZE = 8;
        int MAX = 100;
        int TRIALS = 50;
        for (int i=0; i<TRIALS; i++) {
            System.out.printf("Trial #%d \n",i);
            int[] ary = makeArray(SIZE, MAX);
            System.out.println(Arrays.toString(ary));
            int maxI = iterationMax(ary);
            System.out.printf("By iteration, max=%d \n", maxI);
            int maxR = recursiveMax(ary, 0, ary.length-1); // trick
            System.out.printf("By recursion, max=%d \n", maxR);
            if (maxI != maxR) {
                System.err.println("Values did not match!");
                break;
            }
        }
        System.out.println("Success every time!");
    }

    public static int[] makeArray (int size, int max) {
        int[] a = new int[size];
        // While debugging, I wanted the same numbers every time.
        // int SEED = 42; // use seed during debugging
        // Random generator = new Random(SEED);  // always same

        Random generator = new Random();  // always different
        for (int i=0; i<size; i++) {
            a[i] = generator.nextInt(max);
        }
        return a;
    }

    public static int iterationMax(int[] a) {
        int maxSoFar = a[0];
        for (int i=0; i<a.length; i++) {
            if (a[i] > maxSoFar) {
                maxSoFar = a[i];
            }
        }
        return maxSoFar;
    }

    public static int recursiveMax(int[] a, int low, int high) {
        // Recursively find the max of the left half and right half.
        int half = low + (high-low)/2;
        // This diagnostic helped while I was debugging.
        // System.out.printf("Debug %d %d %d \n", low, half, high);

        // Here is the condition that stops the recursion.
        // When the range only has one element, 
        // the max is that element. 
        if (low >= high) {
            return a[high];
        }
        // Here are the recursive calls to self.
        int left = recursiveMax(a, low, half);
        int right = recursiveMax(a, half+1, high);
        // Here is the body of the recursion: find the max.
        return Math.max(left,right);
    }
}
