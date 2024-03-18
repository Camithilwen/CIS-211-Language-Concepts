import java.lang.String; //optional
import java.math.BigInteger;//required

/**
 * Write a description of class Class_Practice_2_21_2024 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class_Practice_2_21_2024
{
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args){
        // Looks like primitive type, but actually
        String name1 = "CIS 211";
        // the compiler converts that to
        String name2 = new String("CIS 211");
        // In OOP, we call object.method(parameter);
        //Instead of writing a program separate from the data, you write a class
            //which manages its own data.
        System.out.println(name2.charAt(4));
        //Careful with references!
        //Both of these are references to the same object.
        String name3 = name2;
        //Try another method.
        System.out.println(name1.equals(name2));
        System.out.println(name1.endsWith("11"));
        
        BigInteger x = new BigInteger("13");
        BigInteger y = new BigInteger("1234567890");
        System.out.println(x.add(y));
        BigInteger z = y.sqrt();
        System.out.println(z.pow(2)); //should equal y;
        
    
    }
}
