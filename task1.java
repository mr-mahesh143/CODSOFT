import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int roundsPlayed = 0;
        int totalAttempts = 0;

        while (playAgain) {
            int rangeStart = 1;
            int rangeEnd = 100;
            int maxAttempts = 10;
            int numberToGuess = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Round " + (roundsPlayed + 1));
            System.out.println("Guess a number between " + rangeStart + " and " + rangeEnd);

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
            }

            totalAttempts += attempts;
            roundsPlayed++;

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Game over! You played " + roundsPlayed + " rounds with a total of " + totalAttempts + " attempts.");
        if (roundsPlayed > 0) {
            System.out.printf("Average attempts per round: %.2f%n", (double) totalAttempts / roundsPlayed);
        }

        scanner.close();
    }
}
