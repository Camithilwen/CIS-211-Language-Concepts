
/**
 * Initializes and runs Tile object methods for testing purposes.
 *
 * @author Jamie Kemman
 * @version 1.0
 */
public class Runner
{
    public static void main(){
        main(null);
    }
    public static void main(String[] args){
        Tile tile1 = new Tile('Z', 10);
        Tile tile2 = new Tile('Z', 10);
        Tile tile3 = new Tile('A', 1);
        
        System.out.println("printTile method on tile1: " + tile1.printTile());
        System.out.println("printTile method on tile2: " + tile2.printTile());
        System.out.println("toString method on tile3: " + tile3.toString());
        System.out.println("Equality of tile1 and tile3: " + tile1.equals(tile3));
        System.out.println("Equality of tile1 and tile2: " + tile1.equals(tile2));
        
        tile3.setLetter('Z');
        System.out.println("Updated tile3 letter: " + tile3.getLetter());
        
        tile3.setValue(10);
        System.out.println("Updated tile3 value: " + tile3.getValue());
        
        System.out.println("Equality of tile2 and tile3 after update: " + tile2.equals(tile3));
    }
}
