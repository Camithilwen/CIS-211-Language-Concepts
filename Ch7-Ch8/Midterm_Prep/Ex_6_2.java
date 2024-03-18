
/**
 * Write a description of class Ex_6_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex_6_2
{
    public static void main() {
        
        main(null);
        
    }
    
    public static void main(String[] args) {
        
        double a = 9.0;
        double firstGuess = a/2;
        double x0 = (firstGuess + a/firstGuess)/2;
        //System.out.println(x0);
        double x1 = (x0 + a/x0)/2;
        //System.out.println(x1);
        for (int i=0; Math.abs(x0-x1) > 0.0001; i++) {
        double x2 = (x1 + a/x1)/2;
        //System.out.println(x2);
        double x3 = (x2 + a/x2)/2;
        //System.out.println(x3);
        x0 = x2;
        x1 = x3; 
        //System.out.println(Math.abs(x0-x1));
    }
    System.out.println(x0);
    System.out.println(x1);
    System.out.println(Math.abs(x0-x1));
}
}
