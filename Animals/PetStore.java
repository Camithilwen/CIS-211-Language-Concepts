
/**
 * Write a description of class PetStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetStore
{
    public static void main() {
        main(null);
    }
    public static void main(String[] args) {
        Animal dog, cat;
        dog = new Dog();
        cat = new Cat();
        talk(dog);
        talk(cat);
    }
    public static void talk (Animal pet) {
        pet.makeNoise();
    }
}
