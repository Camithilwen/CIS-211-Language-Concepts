public class Game {
    public static void main () {
        main(null);
    }
    public static void main (String[] args) {
        compareTwoCards();
    }
    public static void compareTwoCards() {
        System.out.println("Compare two cards:");
        Card three_diamonds = new Card (3, Card.DIAMONDS);
        Card king_clubs = new Card(Card.KING, Card.CLUBS);
        System.out.println("Cards: " + three_diamonds.toString() + ", "
                                + king_clubs.toString());
        System.out.println(three_diamonds.compareTo(king_clubs));
        System.out.println(king_clubs.compareTo(three_diamonds));
    }
}