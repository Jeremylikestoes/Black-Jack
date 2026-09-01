import java.util.ArrayList;

public class Dealer {

    private int points;
    private boolean soft;

    private ArrayList<Card> hand = new ArrayList<>();

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int totalPoints() {
        
        points = 0;

        for(int i = 0; i < hand.size(); i++) {
            points = points + hand.get(i).getPoints();
        }
        
        if(points > 22) {
            for(int i = 0; i < hand.size(); i++) {
                if(hand.get(i).getPoints() == 11) {
                    points = points - 10;
                }
            }
        }
        System.out.println(points);
        return points;
    }

    public boolean isSoft() {
        for(int i = 0; i < hand.size(); i++) {
            if(hand.get(i).getPoints() == 11) {
                soft = true;
            }
            else {
                soft = false;
            }
        }
        return soft;
    }

}
