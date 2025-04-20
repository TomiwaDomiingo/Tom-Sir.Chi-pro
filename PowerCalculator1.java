public class PowerCalculator1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the base number: ");
int base = input.nextInt();

System.out.print("Enter the exponent: ");
int exponent = scanner.nextInt();

int result = base;
for (int i = 1; i < exponent; i++) {
            result *= base;
}
System.out.println(base + " raised to the power of " + exponent + " is: " + result);
}
}