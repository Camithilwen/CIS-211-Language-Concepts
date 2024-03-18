/**
 * Chapter 6 was called Methods and Testing.
 * It was all about writing methods and testing them.
 * As shown in the book, computational methodds take parameter
 * values and return the solution value -- without printing!
 * (Professionals do print for debugging as shown in the book.
 * But they delete the I/O before the code goes into production.)
 * Methods are designed to be used and reused over and over.
 * Your main method provides a test and demo for others. 
 * 
 * The textbook explained that one purpose of this exercise is to
 * practice pattern-matching: the ability to recognize a specific
 * problem as an instance of a general category of problems.
 * Did you find all the instances where multAdd() could be used?
 *
 * The slides shown in class demonstrated mathematical transformations
 * such as transforming "divide by 4" into "multply by 1/4".
 * They also showed that 1 and 0 are the multiplicative
 * and additive identities, respectively.
 * With all these hints, students should have recognized
 * that cos/2+sin can be computed with one multAdd().
 * 
 * The chapter also talked about functional composition, i.e.
 * using one function call as the parameter to another function call.
 * The professor's slides showed that this concept can be extended
 * to an entire paradigm called functional programming. 
 * With all these hints, students should have recognized
 * that expSum() can be computed with a multAdd() of a multAdd().
 * 
 * @author Jason Miller
 * This code written by Jason Miller at Shepherd University.
 * Reference Think Java 2nd edition chapter 4 exercise 6.
 * 
 * 4.6 part 1
 * Use a class name that starts uppercase.
 **/
public class Multadd {

    /**
     * 4.6 part 2
     * Use a method name that starts lowercase.
     * A computational method returns a value without I/O.
     * No Scanner inputs. No System outputs.
     **/
    public static double multadd(
    double a, double b, double c) {
        return a*b+c;  // PEMDAS does the mult first
    }

    /**
     * This is a utility function.
     * It was not required but it will come in handy.
     * This prints the results of each computation.
     **/
    public static void show
    (double a, double b, double c, double answer) {
        System.out.printf("multadd(%.2f,%.2f,%.2f)=%.2f\n",
            a,b,c,answer);
    }

    /**
     * This is a pass-thru function for convenience.
     * Though main(String[] args) is more professional,
     * main() is quicker to run and test in BlueJ.
     **/
    public static void main () {
        main(null); // pass-thru to the Strings version
    }

    /**
     * Here is the test and demo.
     * This shows many ways to use multAdd().
     **/
    public static void main (String [] args) {
        double a,b,c;

        // 4.6 part 3, test multadd
        // You must invoke your own method.
        // You must show the results.
        System.out.println("Part 3. Test with 1, 2, 3.");
        a=1; b=2; c=3;
        show(a,b,c, multadd(a,b,c));
        System.out.println("Extra: test with 4, 5, 6.");
        a=4; b=5; c=6;
        show(a,b,c, multadd(a,b,c));

        // 4.6 part 4, first example.
        // It is necessary to reorganize terms to use multadd.
        // Convert division by 2 into multiplication by 1/2.
        // sin(PI/4) + cos(PI/4)/2          not multadd form
        // = 1/2 * cos(PI/4) + sin(PI/4)    in multadd form
        System.out.println("Part 4, first part, with sin and cos.");
        double angle = Math.PI/4;
        a = 1.0/2.0;  // avoid integer division
        b = Math.cos(angle);
        c = Math.sin(angle);
        show(a,b,c, multadd(a,b,c));

        // 4.6 part 4, second example
        // The only way to use multadd is trivially with 0 or 1.
        // log(10) + log(20)          not multadd form
        // = 1 * log(10) + log(20)    this is one multadd form
        // = log (10*20+0)            this is another multadd form
        // This chapter uses Math.log() for natural log base e.
        System.out.println("Part 4, second part, with logs.");
        a = 1.0;
        b = Math.log(10);
        c = Math.log(20);
        show(a,b,c, multadd(a,b,c));

        // test of 4.6 part 5
        System.out.println("Part 5, implementing expSum().");
        double x;
        // trivially, expSum(0) = 0*1 + sqrt(1-1) = 0+0
        x = 0;
        System.out.println("Test expSum(0) and expect 0");
        System.out.printf("expSum(%.2f)=%.2f\n",x,expSum(x));
        x = 1;
        System.out.println("Test expSum(1) and expect 1.16");
        System.out.printf("expSum(%.2f)=%.2f\n",x,expSum(x));
        x = 2;
        System.out.println("Test expSum(2) and expect 1.2");
        System.out.printf("expSum(%.2f)=%.2f\n",x,expSum(x));
    }

    /**
     * 4.6 part 5 extended
     * Use multadd twice. 
     * In fact, use multadd() of a multadd()!
     **/
    public static double expSum (double x) {
        double a,b,c;
        double exponential = Math.exp(-x);
        // compute the part that is under the square root sign
        a = -1.0;
        b = exponential;
        c = 1.0;
        double under = multadd(a,b,c);
        // compute the overall result
        a = x;
        b = exponential;
        c = Math.sqrt(under);
        double result = multadd(a,b,c);
        return result;
    }

}
