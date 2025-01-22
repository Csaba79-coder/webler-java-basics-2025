package prog;

import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {

        // Dobókocka számai: 1, 2, 3, 4, 5, 6
        Random random = new Random();

        // Simulate rolling a six-sided dice
        int diceRoll = random.nextInt(6) + 1; // 0-5 -> 1-6 (inclusive)

        System.out.println("Dobás: " + diceRoll);
    }
}
