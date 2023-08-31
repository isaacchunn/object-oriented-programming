package Tutorial.Tutorial2.Dice;

// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;
// import javax.swing.JFrame;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialise new JFrame
        // JFrame jframe = new JFrame();
        // jframe.addKeyListener(new KeyAdapter() {
        // public void keyPressed(KeyEvent e) {
        // int keyCode = e.getKeyCode();
        // if (keyCode == KeyEvent.VK_SPACE) {
        // System.out.println("Space!");
        // }
        // }
        // });

        // jframe.setVisible(true);

        // Make two dices
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        boolean firstDice = false;
        while (true) {
            if (!firstDice) {
                System.out.println("Press <1> to roll the first dice");
                int number = scanner.nextInt();
                if (number == 1) {
                    // Set rolled first dice
                    firstDice = true;
                    // Call some dice related function
                    dice1.setDiceValue();
                    // Call dice print
                    dice1.printDiceValue();
                } else {
                    continue;
                }
            } else if (firstDice) {
                System.out.println("Press <2> to roll the second dice");
                int number = scanner.nextInt();
                if (number == 2) {
                    // Call some dice related function
                    dice2.setDiceValue();
                    // Call dice print
                    dice2.printDiceValue();
                    System.out.println("Your total number is: " + (dice1.getDiceValue() + dice2.getDiceValue()));
                    break;
                } else {
                    continue;
                }
            }
        }

        scanner.close();
    }
}
