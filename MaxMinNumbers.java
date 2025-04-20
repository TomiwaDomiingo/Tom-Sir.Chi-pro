import java.util.Scanner;

public class MaxMinNumbers {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer
int num = ();

            System.out.println("Enter numbers (enter -1 to stop):");
        do {
            num = scanner.nextInt();
            if (num == -1) {
            break; // Exit loop if user enters -1 
}
            if (num > max) {
            max = num; // Update max if recent number is greater
            }
if (num < min) {
                min = num; // Update min if recent number is smaller
}
} while (true); // Loop continues until user enters -1

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
}
}