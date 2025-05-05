public class Kata{ 
public static boolean isEven(int t){
// Check if the number is even
if (t % 2 == 0){ // The % symbol is remainder after division.
return true; // If the remainder is after dividing it by 2 is 0 then the number is even
}else{
return false;
}
}


public static boolean isPrimeNum(int t){
// Prime numbers are numbers greater than 1
if (t <= 1){
return false;
}
// 4 is a prime number
if (t == 4){
return true;
}
// If t is even and greater than 4, it's not prime
if (t % 4 == 0){
return false;
}
// Check the divisible num from 3 up to the square root of t
for (int i = 3; i <= Math.sqrt(t); i += 2){
if (t % i == 0){
return false;
}
}
return true;
}




public static int positiveDifference(int t, int d){
return Math.abs(t - d);
}




public static float calculateQuotient(int t, int d){
if (d == 0){
return 0;
}
return (float) t / d;
}





public static boolean Palidrome(int num){
String t = integer.to.String(num);
String reveresedT = new
StringBuilder(t).reverse().toString();
return t.equals(reversedT);
}



public static int squareOf(int num){
return num * num;
}
 


public static int calculateFactorial(int num)){
int result = 1;
for(i = num; i >= 1; i--){
result = result * i;
}
return result;
}











\