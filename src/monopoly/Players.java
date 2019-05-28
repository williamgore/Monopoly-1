package monopoly;

import javax.swing.JOptionPane;
import static monopoly.Monopoly.TITLE;

/**
 * Players.java - to create players
 *
 * @author William Gore & Raden Pablo
 * @since 23-May-2019
 */
public class Players {

    private int cash = 1500;
    public int turn;
    public int people;

    /**
     *
     */
    public void Players() {
        

    }

    /**
     * To create dices
     */
    public void Dice() {
        // first dice
        int dice1 = random(1, 6);
        // second dice
        int dice2 = random(1, 6);
        // add the two dice together
        int sum = dice1 + dice2;
        // first turn
        System.out.println(sum);
        if (dice1 == dice2) {
            // first dice
            int newRoll = random(1, 6);
            // second dice
            int newRoll2 = random(1, 6);
            // add the two dice together
            int sum2 = newRoll + newRoll2;
            System.out.println(sum2);
            // second turn
            if (newRoll == newRoll2) {
                // first dice
                int newRoll3 = random(1, 6);
                // second dice
                int newRoll4 = random(1, 6);
                // add the two dice together
                int sum3 = newRoll3 + newRoll4;
                System.out.println(sum3);
                //third turn
                if (newRoll3 == newRoll4) {
                    // go to jail
                    System.out.println("jail");
                } else {
                    nextTurn();
                }

            } else {
                nextTurn();
            }
        } else {
            nextTurn();
        }
    }

    /**
     * Generates a random number
     *
     * @param low lowest number in the range
     * @param high highest number in the range
     * @return random number in range
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double value = (H - L + 1) * seed + L;
        int answer = (int) value;
        return answer;

    }

    private void nextTurn() {
        turn++;

    }

}
