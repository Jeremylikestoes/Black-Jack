public class App {
    public static void main(String[] args) throws Exception {
        Deck myDeck = new Deck(4, 13);
        myDeck.buildDeck();
        myDeck.getDeck();
    }
}
