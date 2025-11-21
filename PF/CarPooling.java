import java.util.*;
public class CarPooling{ 
    static Scanner sc = new Scanner (System.in);
 public static void main(String... arg){ 
  
  System.out.print("Enter total miles driven per day: " );
  double totalMiles = sc.nextDouble();
  
  System.out.print("Enter cost per gallon of gasoline: " );
  double costPerGallon = sc.nextDouble();
  
  System.out.print("Enter average miles per gallon: " );
  double averageMiles = sc.nextDouble();
  
  System.out.print("Enter parking fees per day: " );
  double dailyParkingFees = sc.nextDouble();
  
  System.out.print("Enter tolls per day: " );
  double dailyTolls = sc.nextDouble();
  
  double dailyFuel = (totalMiles / averageMiles) * costPerGallon;
  
  float dailyCost = (float) (dailyFuel + dailyParkingFees + dailyTolls) ;
  
   System.out.println("Your cost per day of driving to work is $" + dailyCost );
 } 
}