import java.util.Random;
import java.util.Arrays;

/**
 * An array is a data structure
 * holding multiple values of the same type.
 * Array access by position is fast
 * because it holds a contiguous memory block.
 *
 * @author Jason Miller
 */
public class ArrayDemo {
    public static void main () {
        main(null);
    }
    public static void main (String [] args) {
        int one_integer = 100;
        int[] array1 = new int[5]; // all zero
        print_array(array1);
        int[] array2 = {1,2,3,4,5};
        print_array(array2);
        int sum = get_array_sum(array2);
        System.out.printf("Array sum: %d \n", sum);
        System.out.println("Random array:");
        int[] array3 = get_random_array(5, 10);
        print_array(array3);
    }
    public static void print_array(int[] ary) {
        System.out.println("Three-part for loop:");
        for (int i=0; i<ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.println();
        //
        System.out.println("Colon for loop:");
        for (int n : ary) {
            System.out.printf("%d ", n);
        }
        System.out.println();
        //
        System.out.println("Arrays utility:");
        System.out.println(Arrays.toString(ary));
    }
    public static int[] get_random_array(int size, int max) {
        int [] ary = new int[size];
        Random generator = new Random();
        for (int i=0; i<size; i++) {
            ary[i] = generator.nextInt(max);
        }
        return ary;        
    }
    public static int get_array_sum(int[] ary) {
        int sum = 0;
        for (int n : ary) {
            sum += n;
        }
        return sum;
    }
}
