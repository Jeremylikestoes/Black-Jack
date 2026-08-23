public class Game {
    public static void main(String[] args) throws Exception {
        Deck myDeck = new Deck(4, 13);
        myDeck.buildDeck();
        myDeck.shuffleDeck();
        myDeck.dealCards();
        myDeck.getDeck();
    }
}
