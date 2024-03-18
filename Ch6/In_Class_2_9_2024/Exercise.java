
/**
 * Write a description of class Exercise here.
 *
 * @author Jamie Kemman
 * @version V1.0
 */
public class Exercise
{
    public static void checkerboard (int x, int y) {
        
        for (int yprint = 1; yprint <= y; yprint++) {
            
            System.out.printf("\n");
            
            for (int xprint = 1; xprint <= (x/2); xprint++) {
                
                if ((x + yprint) % 2 == 0) {
                    
                    System.out.printf("* - ");
            
                }
                
                else if ((x + yprint) % 2 == 1) {
                    
                    System.out.printf("- * ");
                    
                }
                
            }
            
        }
        
    }
    
    public static void suffixes (String input) {
        
        for (int iteration = 0; iteration <= input.length(); iteration++) {
            
            System.out.printf("%s\n",(input.substring(input.length() - iteration)),input.length());
            
            
        }
        
        
        
    }
    
    public static void main () {
        
        //checkerboard
        checkerboard(10,10);
        
        System.out.printf("\n");
        
        //suffixes
        suffixes("Shepherd");
        
    }
}
