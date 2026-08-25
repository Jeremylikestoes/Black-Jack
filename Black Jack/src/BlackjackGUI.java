import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.util.Random;

public class BlackjackGUI {

    // --------Colors---------
    Color walnut = new Color(74, 44, 26);
    Color tableGreen = new Color(11, 93, 59);
    Color beige = new Color(232, 220, 196);
    Color cream = new Color(243, 231, 207);
    Color red = new Color(128, 24, 32);
    Color navy = new Color(25, 45, 85);

    Random random = new Random();
    Player player;
    Dealer dealer;

    BlackjackGUI(Player guiPlayer, Dealer guiDealer) {

        player = guiPlayer;
        dealer = guiDealer;

        // -------Main-Panel-Setup---------
        JFrame window = new JFrame("Blackjack");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null );
        JLabel title = new JLabel("Black  Jack");
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(null );

        // -------Back-Card-Visuals-------
        JLabel spade = new JLabel("♠");
        JLabel heart = new JLabel("♥");
        JLabel club = new JLabel("♣");
        JLabel diamond = new JLabel("♦");
 
        JPanel dealerCardPanel = new JPanel();
        JPanel playerCardPanel = new JPanel();

        int randomColor = random.nextInt(2);

        // -------Dealer-Card-Loop-------
        for(int i = 0; i < dealer.getHand().size(); i++) {

            JLabel cardBack = new JLabel("<html><div style='text-align: center;'>Jeremy's<br>Casino</div></html>");
            JLabel card = new JLabel(dealer.getHand().get(i).toString());
            JPanel cardPanel = new JPanel();

            if(i == 1) {
                if(randomColor == 1) {
                    cardPanel.setBackground(navy);
                }
                else {
                    cardPanel.setBackground(red);
                }

                // -------Card-Back-Formating-------
                cardBack.setFont(new Font("Garamond", Font.BOLD, 18));
                cardBack.setForeground(cream);
                cardBack.setHorizontalAlignment(JLabel.CENTER);
                cardBack.setVerticalAlignment(JLabel.CENTER);
                cardPanel.setLayout(new BorderLayout());
                cardPanel.add(cardBack, BorderLayout.CENTER);
                cardPanel.add(cardBack);
            }
            else {
                
                card.setFont(new Font("Tahoma", Font.BOLD, 30));
                card.setHorizontalAlignment(JLabel.CENTER);
                card.setVerticalAlignment(JLabel.CENTER);
                cardPanel.setLayout(new BorderLayout());
                cardPanel.add(card, BorderLayout.CENTER);
                cardPanel.add(card);
            }
            cardPanel.setPreferredSize(new Dimension(100, 140));
            cardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            dealerCardPanel.add(cardPanel);
        }

        // -------Player-Card-Loop-------
        for(int i = 0; i < player.getHand().size(); i++) {

            JLabel card = new JLabel(player.getHand().get(i).toString());
            JPanel cardPanel = new JPanel();

            cardPanel.setPreferredSize(new Dimension(100, 140));
            card.setFont(new Font("Tahoma", Font.BOLD, 30));
            cardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            card.setHorizontalAlignment(JLabel.CENTER);
            card.setVerticalAlignment(JLabel.CENTER);
            cardPanel.setLayout(new BorderLayout());
            cardPanel.add(card, BorderLayout.CENTER);

            playerCardPanel.add(cardPanel);
            cardPanel.add(card);
        }
        
        // -------GUI-Formating-------
        mainPanel.setBackground(walnut);
        tablePanel.setBackground(tableGreen);
        dealerCardPanel.setOpaque(false);
        playerCardPanel.setOpaque(false);

        title.setBounds(380, 20, 200, 50);
        title.setFont(new Font("Georgia", Font.BOLD, 32));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(cream);

        tablePanel.setBounds(65, 100, 850, 600);
        tablePanel.setBorder(BorderFactory.createLineBorder(new Color(45, 28, 17), 6));

        dealerCardPanel.setBounds(155, 50, 550, 165);
        dealerCardPanel.setBorder(BorderFactory.createLineBorder(beige, 3));
        playerCardPanel.setBounds(155, 340, 550, 165);
        playerCardPanel.setBorder(BorderFactory.createLineBorder(beige, 3));

        tablePanel.add(dealerCardPanel);
        tablePanel.add(playerCardPanel);
        mainPanel.add(tablePanel);
        mainPanel.add(title);
        window.add(mainPanel);

        // -------Window-Creation-------
        window.setSize(1000, 800);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}