package monopoly;

/**
 * Players.java - to create players
 *
 * @author William Gore & Raden Pablo
 * @since 23-May-2019
 */
public class Players {

    private int cash = 1500;
    public int roll;
    public int people;

    public void Players() {

    }

    public void Dice() {
       int dice1 = random(1, 6);
        System.out.println(dice1);
    }

    public void Dice2() {
       int dice2 = random(1, 6);
        System.out.println(dice2);
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
