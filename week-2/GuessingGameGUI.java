import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessingGameGUI extends JFrame {
    private int low = 1, high = 100;
    private int guess;
    private JLabel prompt;

    public GuessingGameGUI() {
        setTitle("Computer Guesses Your Number");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        prompt = new JLabel("", SwingConstants.CENTER);
        prompt.setFont(new Font("Arial", Font.BOLD, 16));
        add(prompt, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton higher = new JButton("Higher");
        JButton lower = new JButton("Lower");
        JButton correct = new JButton("Correct");

        buttonPanel.add(lower);
        buttonPanel.add(correct);
        buttonPanel.add(higher);
        add(buttonPanel, BorderLayout.SOUTH);

        higher.addActionListener(e -> {
            low = guess + 1;
            makeGuess();
        });

        lower.addActionListener(e -> {
            high = guess - 1;
            makeGuess();
        });

        correct.addActionListener(e -> {
            prompt.setText("🎉 I guessed it! It was " + guess);
            int option = JOptionPane.showConfirmDialog(this, "Play Again?", "Game Over", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                low = 1;
                high = 100;
                makeGuess();
            } else {
                System.exit(0);
            }
        });

        makeGuess();
        setVisible(true);
    }

    private void makeGuess() {
        if (low > high) {
            prompt.setText("😕 Are you cheating? No number fits!");
            return;
        }
        guess = low + (high - low) / 2;
        prompt.setText("Is it " + guess + "?");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GuessingGameGUI::new);
    }
}
