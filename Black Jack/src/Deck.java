import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private int suits;
    private int cardPerSuit;

    Random rand = new Random();
    
    
    ArrayList<Card> deck = new ArrayList<>();


    Deck(int deckSuits, int deckCPS) {
        suits = deckSuits;
        cardPerSuit = deckCPS;
    }

    
    void buildDeck() {

        // -------Card-Creator-Loop-------
        for (int i = 1; i <= suits; i++) {

            String objectSuit;

            // ---------Suit-Picker-------
            switch (i) {
                case 1:
                    objectSuit = " ♣";
                    break;
                case 2:
                    objectSuit = " ♠";
                    break;
                case 3:
                    objectSuit = " ♥";
                    break;
                case 4:
                    objectSuit = " ♦";
                    break;
                default:
                    objectSuit = "error";
            }

            for (int j = 1; j <= cardPerSuit; j++) {

                String objectValue;
                int objectPoints;
                boolean aceHigh = true;

                // -------Value-Picker-------
                switch (j) {
                    case 1:
                        objectValue = "A";
                        if(aceHigh) {
                            objectPoints = 11;
                        } 
                        else {
                            objectPoints = 1;
                        }
                        break;
                    case 2:
                        objectValue = "2";
                        objectPoints = 2;
                        break;
                    case 3:
                        objectValue = "3";
                        objectPoints = 3;
                        break;
                    case 4:
                        objectValue = "4";
                        objectPoints = 4;
                        break;
                    case 5:
                        objectValue = "5";
                        objectPoints = 5;
                        break;
                    case 6:
                        objectValue = "6";
                        objectPoints = 6;
                        break;
                    case 7:
                        objectValue = "7";
                        objectPoints = 7;
                        break;
                    case 8:
                        objectValue = "8";
                        objectPoints = 8;
                        break;
                    case 9:
                        objectValue = "9";
                        objectPoints = 9;
                        break;
                    case 10:
                        objectValue = "10";
                        objectPoints = 10;
                        break;
                    case 11:
                        objectValue = "J";
                        objectPoints = 10;
                        break;
                    case 12:
                        objectValue = "Q";
                        objectPoints = 10;
                        break;
                    case 13:
                        objectValue = "K";
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

    void dealCards(Player dealPlayer, Dealer dealDealer) {
        for(int i = 0; i < 2; i++) {
           dealPlayer.addCard(deck.remove(deck.size() - 1));
           dealDealer.addCard(deck.remove(deck.size() - 1));
        }
    }

    void hit(Player hitPlayer) {
        hitPlayer.addCard(deck.remove(deck.size() - 1));
    }
}