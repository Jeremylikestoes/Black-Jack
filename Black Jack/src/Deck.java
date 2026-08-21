import java.util.ArrayList;

public class Deck {

    private int suits;
    private int cardPerSuit;

    ArrayList<Card> deck = new ArrayList<>();

    //Constructs the deck
    Deck(int deckSuits, int deckCPS) {
        suits = deckSuits;
        cardPerSuit = deckCPS;
    }

    //Makes the specific deck based on peramerters from the constructor
    void buildDeck() {

        //Loop that creates each card; i = suits and j = values
        for (int i = 1; i <= suits; i++) {

            String objectSuit;
            switch (i) {
                case 1:
                    objectSuit = "clubs_";
                    break;
                case 2:
                    objectSuit = "spades_";
                    break;
                case 3:
                    objectSuit = "hearts_";
                    break;
                case 4:
                    objectSuit = "diamonds_";
                    break;
                default:
                    objectSuit = "error";
            }

            for (int j = 1; j <= cardPerSuit; j++) {

                String objectValue;
                switch (j) {
                    case 1:
                        objectValue = "Ace";
                        break;
                    case 2:
                        objectValue = "Two";
                        break;
                    case 3:
                        objectValue = "Three";
                        break;
                    case 4:
                        objectValue = "Four";
                        break;
                    case 5:
                        objectValue = "Five";
                        break;
                    case 6:
                        objectValue = "Six";
                        break;
                    case 7:
                        objectValue = "Seven";
                        break;
                    case 8:
                        objectValue = "Eight";
                        break;
                    case 9:
                        objectValue = "Nine";
                        break;
                    case 10:
                        objectValue = "Ten";
                        break;
                    case 11:
                        objectValue = "Jack";
                        break;
                    case 12:
                        objectValue = "Queen";
                        break;
                    case 13:
                        objectValue = "King";
                        break;
                    default:
                        objectValue = "error";
                }

                String objectName = objectSuit + objectValue;

                Card newCard = new Card (i, j, objectName);
                deck.add(newCard);
            }
        }
    }

    void getDeck() {

        for(int i = 0; i < deck.size(); i++) {
            System.out.print(deck.get(i).toString() + " ");
        }
    }
}