
public class Geometry2 {
    
    public static void main() {
        double a, b, c;
        a = 3;
        b = 4;
        c = hypotenuse(a, b);
        System.out.printf("the hypotenuse is %.1f", c);
        
    }
    
    public static double hypotenuse(double a, double b) {
        
        double c = Math.sqrt((a*a)+(b*b));
        return c;
        
    }
    
    
}