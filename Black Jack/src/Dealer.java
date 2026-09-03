import java.util.ArrayList;

public class Dealer {

    private int points;
    private int aceCount;
    private boolean aceLow;

    private ArrayList<Card> hand = new ArrayList<>();

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int totalPoints() {
        
        points = 0;
        aceCount = 0;
        aceLow = false;
        
        for(int i = 0; i < hand.size(); i++) {
            points = points + hand.get(i).getPoints();

            if(hand.get(i).getPoints() == 11) {
                aceCount++;
            }
        }

        while(points > 21 && aceCount > 0) {
            points = points -10;
            aceCount--;
            aceLow = true;
        }

        System.out.println(points);
        return points;
    }

    public boolean isSoft() {

        boolean soft = false;

        if(aceLow == false && aceCount > 0) {
            soft = true;
        }

        return soft;
    }

}
