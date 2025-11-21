import java.util.*;
public class Task7{
    static Scanner sc =  new Scanner (System.in);
    public static void main (String [] args){
        int ticketA = 20;
        int ticketB = 15;
        int ticketC = 10;
        int ticketD = 5;

        System.out.print("How many tickets were sold for class A: ");
        int soldTicketsOfA = sc.nextInt();

        System.out.print("How many tickets were sold for class B: ");
        int soldTicketsOfB = sc.nextInt();

        System.out.print("How many tickets were sold for class C: ");
        int soldTicketsOfC = sc.nextInt();

        System.out.print("How many tickets were sold for class D: ");
        int soldTicketsOfD = sc.nextInt();

        int incomeFromA = ticketA * soldTicketsOfA ;
        System.out.println("Income from the tickets of Class A: $" + incomeFromA);
        int incomeFromB = ticketB * soldTicketsOfB;
        System.out.println("Income from the tickets of Class B; $" + incomeFromB);
        int incomeFromC = ticketC * soldTicketsOfC;
        System.out.println("Income from the tickets of Class C: $" + incomeFromC);
        int incomeFromD = ticketD * soldTicketsOfD;
        System.out.println("Income from the tickets of Class D: $" + incomeFromD);

        int totalIncome = incomeFromA + incomeFromB + incomeFromC + incomeFromD ;
        System.out.print("Total Income Is: $" + totalIncome);
    }
}