public class Demo2 {
    
    public static void main() {
        
        System.out.println("Step 1. A Java exception...");
        System.err.println("Step 1. A Java exception...");
        
        try {
            divide_by_zero();
        } catch (Exception e) {
            show_exception(e);
        }
        System.out.println("Step 2. My own exception...");
            System.err.println("Step 2. My own exception...");
            try {
                
                //create_my_own_exception();
            } catch (Exception e) {
                //show_exeption(e);
            
            }
            }
            
    public static void divide_by_zero() {
        
        System.out.println(0/0);
        
    }
    
    
    public static void show_exception(Exception e) {
        
     System.err.println("Exception message:");
     System.err.println(e);
     System.err.println("Stack trace:");
     e.printStackTrace();
        
    }
        
            
            
            
        }
        
    
    
        
    
