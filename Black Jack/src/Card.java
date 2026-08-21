public class Card {

    private int value;
    private int suit;
    private String name;

    Card (int cardValue, int cardSuit, String cardName) {
        value = cardValue;
        suit = cardSuit;
        name = cardName;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}