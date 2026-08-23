import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand = new ArrayList<>();


    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }
}