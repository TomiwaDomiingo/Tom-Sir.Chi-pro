public class CopiesCalculator{
public static double calculatePrice(int numberOfCopies){
double price = 0.0;


if (numberOfCopies >= 1 && numberOfCopies <= 4){
price = numberOfCopies * 2000;

}else if (numberOfCopies >= 5 && numberOfCopies <= 9){
price = numberOfCopies * 1800;  
 
}else if (numberOfCopies >= 10 && numberOfCopies <= 29){ 
price = numberOfCopies * 1600; 

}else if (numberOfCopies >= 30 && numberOfCopies <= 49){ 
price = numberOfCopies * 1500; 
  
}else if (numberOfCopies >= 50 && numberOfCopies <= 99){ 
price = numberOfCopies * 1300; 
  
}else if (numberOfCopies >= 100 && numberOfCopies <= 199){
price = numberOfCopies * 1200;  
  
}else if (numberOfCopies >= 200 && numberOfCopies <= 499){
price = numberOfCopies * 1100;  

}else if (numberOfCopies >= 500){
price = numberOfCopies * 1000;  
}
return price;
}
}