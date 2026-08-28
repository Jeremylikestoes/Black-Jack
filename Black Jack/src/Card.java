public class Card {

    private int value;
    private int suit;
    private int points;
    private String name;

    Card (int cardValue, int cardSuit, int cardPoints, String cardName) {
        value = cardValue;
        suit = cardSuit;
        points = cardPoints;
        name = cardName;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return name;
    }
}