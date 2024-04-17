
/**
 * Checkerboard with 8x8 squares.
 *
 * @Jamie Kemman
 * @version 1.0
 */
public class Chessboard
{
    public static void main() {
        main(null);
    }
    public static void main(String[] args) {
        System.out.println("Checkerboard");
        for (int row = 0; row<8; row++) {
            System.out.println();
            for (int col=0; col<8; col++) {
                if((row + col) % 2 ==0) {
                    System.out.print("O   ");
                } else {
                System.out.print("X   ");
                }
            }
            System.out.println();
        }
    }
}
