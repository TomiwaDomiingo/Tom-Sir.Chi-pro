import java.util.Scanner;

public class CopiesCalculatorDriver{
public static void main(String[] args){
Scanner usersChoice = new Scanner(System.in);

int numberOfCopies = 0;
double price = 0.0;


System.out.print("Hello How Many Copies would you like?: ");
numberOfCopies = usersChoice.nextInt();

price = CopiesCalculator.calculatePrice(numberOfCopies);
System.out.println("Total for  " + numberOfCopies + " copies is: #" + price); 
}
}