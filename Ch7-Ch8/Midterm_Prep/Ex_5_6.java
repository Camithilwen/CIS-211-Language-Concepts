
/**
 * Write a description of class Ex_5_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ex_5_6
{
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args) {
        
        double a = userInput("a");
        System.out.println(a);
        double b = userInput("b");
        System.out.println(b);
        double c = userInput("c");
        System.out.println(c);
        quadratic(a,b,c);
    }
    public static double userInput(String variable_name) {
double userEntry = Double.MIN_VALUE;
        try{
        
        Scanner input = new Scanner(System.in);
        System.out.printf("\nEnter a numeric value for %s:", variable_name);
        
        if (input.hasNextDouble()) {
            userEntry = input.nextDouble();
            System.out.println(userEntry);
        }
        
        else if (!input.hasNextDouble()) {
            
            String error = input.next();
            System.err.printf("\n%s is not a valid input.", error);
        }
    }
        
    catch (Exception InputMismatchException) {
        
        System.out.printf("Input mismatch caught. Please enter a valid numeric value.");
        userInput(variable_name);
    }
    System.out.println(userEntry);
   return userEntry;
}

public static void quadratic(double a, double b, double c) {
    double sqrt = Math.sqrt(b*b)-(4*a*c);
    double positive_x = ((b*-1) + sqrt) / (2*a);
    double negative_x = ((b*-1) - sqrt) / (2*a);
    
    
    System.out.println(positive_x);
    System.out.println(negative_x);
    
    
}
}
//codingbat
//leetcode
//good for small simple exercises