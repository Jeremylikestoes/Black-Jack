public class Game {
    public static void main(String[] args) throws Exception {

        Player player = new Player();
        Dealer dealer = new Dealer();

        Deck myDeck = new Deck(4, 13);

        myDeck.buildDeck();
        myDeck.shuffleDeck();

        myDeck.dealCards(player, dealer);

        BlackjackGUI GUI = new BlackjackGUI(player, dealer, myDeck);
    }
}
