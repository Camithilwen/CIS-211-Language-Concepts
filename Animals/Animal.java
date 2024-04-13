
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    public String name;
    public int age;
    public String sound = "?";

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        
    }
    
    public void setName(String input) {
        name = input;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int input) {
        age = input;
    }
    
    public int getAge() {
        return age;
    }
    
    public void makeNoise() {
        System.out.println(sound);
    }
}
