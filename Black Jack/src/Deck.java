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
                int objectPoints;
                boolean aceHigh = false;
                switch (j) {
                    case 1:
                        objectValue = "ace";
                        if(aceHigh) {
                            objectPoints = 11;
                        } 
                        else {
                            objectPoints = 1;
                        }
                        break;
                    case 2:
                        objectValue = "two";
                        objectPoints = 2;
                        break;
                    case 3:
                        objectValue = "three";
                        objectPoints = 3;
                        break;
                    case 4:
                        objectValue = "four";
                        objectPoints = 4;
                        break;
                    case 5:
                        objectValue = "five";
                        objectPoints = 5;
                        break;
                    case 6:
                        objectValue = "six";
                        objectPoints = 6;
                        break;
                    case 7:
                        objectValue = "seven";
                        objectPoints = 7;
                        break;
                    case 8:
                        objectValue = "eight";
                        objectPoints = 8;
                        break;
                    case 9:
                        objectValue = "nine";
                        objectPoints = 9;
                        break;
                    case 10:
                        objectValue = "ten";
                        objectPoints = 10;
                        break;
                    case 11:
                        objectValue = "jack";
                        objectPoints = 10;
                        break;
                    case 12:
                        objectValue = "queen";
                        objectPoints = 10;
                        break;
                    case 13:
                        objectValue = "king";
                        objectPoints = 10;
                        break;
                    default:
                        objectValue = "error";
                        objectPoints = 0;
                }

                String objectName = objectValue + objectSuit;

                Card newCard = new Card (i, j, objectPoints, objectName);
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