import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private int suits;
    private int cardPerSuit;

    Random rand = new Random();
    ArrayList<Card> deck = new ArrayList<>();

    //Constructs the deck
    Deck(int deckSuits, int deckCPS) {
        suits = deckSuits;
        cardPerSuit = deckCPS;
    }

    //Makes the specific deck based on peramerters from the constructor
    void buildDeck() {

        //Loop that creates each card
        for (int i = 1; i <= suits; i++) {

            String objectSuit;
            switch (i) {
                case 1:
                    objectSuit = "_clubs";
                    break;
                case 2:
                    objectSuit = "_spades";
                    break;
                case 3:
                    objectSuit = "_hearts";
                    break;
                case 4:
                    objectSuit = "_diamonds";
                    break;
                default:
                    objectSuit = "error";
            }

            for (int j = 1; j <= cardPerSuit; j++) {

                String objectValue;
                switch (j) {
                    case 1:
                        objectValue = "ace";
                        break;
                    case 2:
                        objectValue = "two";
                        break;
                    case 3:
                        objectValue = "three";
                        break;
                    case 4:
                        objectValue = "four";
                        break;
                    case 5:
                        objectValue = "five";
                        break;
                    case 6:
                        objectValue = "six";
                        break;
                    case 7:
                        objectValue = "seven";
                        break;
                    case 8:
                        objectValue = "eight";
                        break;
                    case 9:
                        objectValue = "nine";
                        break;
                    case 10:
                        objectValue = "ten";
                        break;
                    case 11:
                        objectValue = "jack";
                        break;
                    case 12:
                        objectValue = "queen";
                        break;
                    case 13:
                        objectValue = "king";
                        break;
                    default:
                        objectValue = "error";
                }

                String objectName = objectValue + objectSuit;

                Card newCard = new Card (i, j, objectName);
                deck.add(newCard);
            }
        }
    }

    //Lists the deck in order
    void getDeck() {

        for(int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).toString() + " ");
        }
    }

    void shuffleDeck() {
        
        for(int i = 0; i < deck.size() * 4; i++) {
            int randomIndex = rand.nextInt(deck.size());
            int swapIndex = rand.nextInt(deck.size());

            Card randomCard = deck.get(randomIndex); 

            deck.set(randomIndex, deck.get(swapIndex));
            deck.set(swapIndex, randomCard);
        }

    }
}