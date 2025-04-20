ublic class AsteriskPatterns {
public static void main(String[] args) {
        // Pattern (a)
  for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= i; j++) {
    System.out.print("*");
}
     System.out.println(); // Move to the next line 
}
        // Pattern (b)
   for (int i = 5; i >= 1; i--)
   for (int j = 1; j <= i; j++) {
     System.out.print("*");
}
     System.out.println();
}

        // Pattern (c)
  for (int i = 1; i <= 5; i++) {
          // Print spaces
  for (int k = 1; k <= 5 - i; k++) {
  System.out.print(" ");
}
           // Print asterisks
  for (int j = 1; j <= i; j++) {
  System.out.print("*");
}
  System.out.println();
}

        // Pattern (d)
  for (int i = 5; i >= 1; i--) {
           // Print spaces
  for (int k = 1; k <= 5 - i; k++) {
  System.out.print(" ");
}
            // Print asterisks
  for (int j = 1; j <= i; j++) 
{
  System.out.print("*"); }
  
}
}
}