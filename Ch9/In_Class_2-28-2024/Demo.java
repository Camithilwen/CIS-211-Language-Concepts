

public class Demo
{
    public static void main () {
        
        main (null);
        
    }
    
    public static void main(String[] args) {
        
        Text t = new Text();
        System.out.println("First instance");
        t.addChar('H');
        t.addChar('e');
        t.addChar('l');
        t.addChar('l');
        t.addChar('o');
        System.out.println(t.toString());
        System.out.println("Length = " + t.length());
        System.out.print ("Char at 5 is ");
        System.out.println(t.charAt(3));
        
        
        System.out.println("Second instance");
        Text s = new Text();
        s.addChar('H');
        s.addChar('e');
        s.addChar('l');
        s.addChar('l');
        s.addChar('o');
        System.out.println(s.toString());
        System.out.println("Length = " + s.length());
        
    }
}
