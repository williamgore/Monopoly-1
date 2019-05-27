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
        System.out.println(dice1);
        int dice2 = random(1, 6);
        // second dice
        System.out.println(dice2);
        // add the two dice together
        int sum = dice1 + dice2;
        System.out.println(sum);
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

   

}
