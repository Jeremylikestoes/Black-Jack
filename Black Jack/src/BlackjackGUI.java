import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

public class BlackjackGUI {
    public static void main(String[] args) {

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
        window.add(playerPanel, BorderLayout.SOUTH);

        // Window Creation
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
