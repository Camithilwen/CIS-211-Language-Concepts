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
public class ArrayWeirdness {
    public static void main () {
        main(null);
    }
    public static void main (String [] args) {
        System.out.println("Scalar integer variables.");
        int x = 100;
        int y = x;
        x += 1;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("They are separate integers!");
        //
        System.out.println("Integer array variables.");
        int[] ary_X = {1,2,3,4,5};
        int[] ary_Y = ary_X;
        ary_X[0] += 1;
        System.out.println("ary_X="+Arrays.toString(ary_X));
        System.out.println("ary_Y="+Arrays.toString(ary_Y));
        System.out.println("They are the same array!");
    }
}
