import java.util.Random;
import java.util.Scanner;

public class GameOfLuck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computerChoice = random.nextInt(11)+1;
       
System.out.print("Take a guess sucker: ");
int userChoice = input.nextInt();

 System.out.print("Computer chose: " + computerChoice);
        
        if (computerChoice == 2) {
            if (userChoice == 3) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == 3) {
            if (userChoice == 4) {
                System.out.println("You are wrong");
            }
        }
 if (computerChoice == 4) {
            if (userChoice == 5) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == 5) {
            if (userChoice == 6) {
                System.out.println("You are wrong");
            }
        }
 if (computerChoice == 6) {
            if (userChoice == 7) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == 7) {
            if (userChoice == 8) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == 8) {
            if (userChoice == 9) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == 9) {
            if (userChoice == 10) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == 10) {
            if (userChoice == 1) {
                System.out.println("You are wrong");
            }
        }
        if (computerChoice == userChoice) {
            System.out.println("You are correct!");
        }
input.close();
    }
}

