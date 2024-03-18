import java.awt.Color;
public class Runner {
    
    public static void main () {
        main(null);
    }
    
    public static void main (String [] args) {
        // call the default constructor
        ColorRectangle cr1 = new ColorRectangle(5,3,10,13);
        ColorRectangle cr2 = new ColorRectangle(2,7,10,13);
        ColorRectangle cr3 = new ColorRectangle(2,7,11,13);
        ColorRectangle cr4 = new ColorRectangle(2,7,10,14);
        ColorRectangle cr5 = new ColorRectangle(5,3,11,14);
        System.out.println(cr1);
        System.out.println(cr2);
        System.out.println(cr3);
        System.out.println(cr4);
        System.out.println(cr5);
        System.out.println("cr1 and cr2 Equal? " + cr1.equals(cr2));
        System.out.println("cr2 and cr3 Equal? " + cr2.equals(cr3));
        System.out.println("cr2 and cr4 Equal? " + cr2.equals(cr4));
        System.out.println("cr1 and cr4 Equal? " + cr1.equals(cr4));
        cr2.setColor(Color.BLUE);
        System.out.println("Same color? " +
                            cr1.getColor().equals(cr2.getColor() ) );
    }
    
}
