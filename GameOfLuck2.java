import java.util.Random;
import java.util.Scanner;

public class GameOfLuck2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computerChoice = random.nextInt(10) + 1;
        int userChoice;
        int numGuesses = 0;

        System.out.println("I'm thinking of a number between 1 and 10.");

        System.out.print("Guess a number: ");
        userChoice = input.nextInt();
        numGuesses++;

        while (userChoice != computerChoice) {
            if (userChoice < computerChoice) {
                System.out.println("Too low! Try again.");
            } else if (userChoice > computerChoice) {
                System.out.println("Too high! Try again.");
            }
 System.out.print("Guess a number: ");
            userChoice = input.nextInt();
            numGuesses++;
        }

        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
        input.close();
    }
}
