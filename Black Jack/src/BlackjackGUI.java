import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class BlackjackGUI {

    Player player;
    Dealer dealer;

    BlackjackGUI(Player guiPlayer, Dealer guiDealer) {
        player = guiPlayer;
        dealer = guiDealer;

        JFrame window = new JFrame("Blackjack");
        JPanel panel = new JPanel();
        JLabel text = new JLabel("BLACKJACK");

        // Dealer 
        JPanel dealerPanel = new JPanel();
        JLabel dearlerText = new JLabel("DEALER");
        JPanel dealerCardsPanel = new JPanel();
        
        JPanel gamePanel = new JPanel();

        // Player
        JPanel playerPanel = new JPanel();
        JLabel playerText = new JLabel("PLAYER");

        JPanel playerCardPanel = new JPanel();

        
        for(int i = 0; i < player.getHand().size(); i++) {
            JLabel card = new JLabel(player.getHand().get(i).toString());
            JPanel cardPanel = new JPanel();

            cardPanel.setPreferredSize(new Dimension(100, 140));
            cardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            card.setFont(new Font("Arial", Font.BOLD, 30));

            playerCardPanel.add(cardPanel);
            cardPanel.add(card);
            cardPanel.add(card);
        }
        
        playerCardPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Colors
        dealerPanel.setBackground(Color.RED);
        gamePanel.setBackground(Color.BLUE);
        playerPanel.setBackground(Color.GREEN);

        panel.add(text);
        window.add(panel);

        dealerPanel.add(dearlerText);
        dealerPanel.add(dealerCardsPanel);

        window.add(dealerPanel, BorderLayout.NORTH);

        window.add(gamePanel, BorderLayout.CENTER);

        playerPanel.add(playerText);
        playerPanel.add(playerCardPanel);
    
        window.add(playerPanel, BorderLayout.SOUTH);

        // Window Creation
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}