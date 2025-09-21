import java.util.*;
public class Task5 {
    static Scanner sc = new Scanner (System.in);
    public static void main (String [ ] args){
        System.out.print("Enter the total amount of milk produced in the morning: ");
        double milkProduced = sc.nextDouble();
        double cartonsNeeded = milkProduced / 3.78 ;

        System.out.print("The number of cartons needed is: " );
        System.out.printf("%.0f %n" , cartonsNeeded);
        
        
        double costOfMilk = milkProduced * 0.38 ;
        System.err.println("The cost of the milk produced is: " + costOfMilk + "$");

        double profit = cartonsNeeded * 0.27;
        System.out.println("The profit for producing milk is: " + profit);

    }
}
