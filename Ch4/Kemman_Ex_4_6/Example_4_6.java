
/**
 * Example 4-6 from the ThinkJava textbook.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Example_4_6
{
    public static double multadd(double a, double b, double c) {
        
        double computation = a * b + c;
        return computation;

    }
    
    public static void main() {
        
        final double NIL = 1.0; //replaces multadd variable a in cases where multiplication is not required.
        
        //test values
        double testA = 1.0;
        double testB = 2.0;
        double testC = 3.0;
        
        double testResult = multadd(testA, testB, testC);
        System.out.printf("multadd test: %.1f * %.1f + %.1f = %.1f\n",
        testA, testB, testC, testResult);
        
        //adding two radian values
        double radianB = Math.sin(Math.PI / 4);
        double radianC = (Math.cos(Math.PI / 4)) / 2;
        double radianResult = multadd(NIL, radianB, radianC);
        System.out.printf("radian value addition: %.3f + %.3f = %.3f\n",
        radianB, radianC, radianResult);
        
        //adding two logarithmic values with base 10
        double logB = Math.log10(10);
        double logC = Math.log10(20);
        double logResult = multadd(NIL, logB, logC);
        System.out.printf("logarithmic value addition: %.3f + %.3f = %.3f\n",
        logB, logC, logResult);
    
        //call expSum with an input of 3.0
        double expSumInput = 3.0;
        double expSumResult = expSum(expSumInput);
        System.out.printf("expSum method return with an input value\nto the formula of 3.0: %f\n",
        expSumResult);
    }
    
    
    public static double expSum(double input) {
        
        final double INVERSE = -1.0;
        double expSumA = input;
        double expSumB = Math.exp(INVERSE * input);
        double expSumC = Math.sqrt(1 - Math.exp(INVERSE * input));
        double computation = multadd(expSumA, expSumB, expSumC);
        return computation;
        
        
        
    }
    
}
