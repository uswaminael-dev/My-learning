import java.util.*;
public class L3T1{
    static Scanner sc= new Scanner(System.in);
    public static void main(String [] args){
    System.out.print("Enter the amount as a decimal number: ");
    double amount = sc.nextDouble();
    int cents= (int)(amount*100);
    int dollars=cents / 100;
    System.out.println("Number of dollars is:" + dollars);
    int remainingCents=cents % 100;
    int quarter= remainingCents / 25;
    System.out.println("Number of quarters is:" + quarter);
    remainingCents=remainingCents % 25;
    int dimes= remainingCents / 10;
    System.out.println("Number of dimes is:" + dimes);
    remainingCents= remainingCents % 10;
    int nickels= remainingCents / 5;
    remainingCents=remainingCents % 5;
    System.out.println("Number of nickels is:" + nickels);
    System.out.println("Number of pennies:" + remainingCents);    }
}
