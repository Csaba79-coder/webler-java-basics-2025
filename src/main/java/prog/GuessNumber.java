package prog;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your name: ");
        String name = scanner.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Welcome, "  + name + "!");

        boolean playAgain = true;
        while (playAgain) {
            int userGuess;
            int pcGuess;

            // Generate random number for the PC
            pcGuess = random.nextInt(10) + 1; // generate a random number between 1 and 10

            System.out.print("Guess the number between 1 and 10 (or enter 0 to exit): ");
            userGuess = scanner.nextInt();

            if (userGuess == 0) {
                System.out.println("Thank you for playing, " + name + "!");
                break;
            }

            if (userGuess == pcGuess) {
                System.out.println("Congratulations, " + name + "! You guessed the number!");
            } else {
                System.out.println("Sorry, " + name + "! The number was: " + pcGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainAnswer = scanner.next();

            if (playAgainAnswer.equalsIgnoreCase("no")) {
                playAgain = false;
                System.out.println("Thank you for playing, " + name + "!");
            }

            /*if (!playAgainAnswer.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing, " + name + "!");
            }*/

            /*if (playAgainAnswer.equalsIgnoreCase("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
                System.out.println("Thank you for playing, " + name + "!");
            }*/
        }
    }
}
