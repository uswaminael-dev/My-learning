import java.util.*;
public class L3T6 {
    static Scanner sc = new Scanner (System.in);
    public static void main (String [ ] args){

        System.out.print("Enter the pay rate for an hour: ");
        double payRate = sc.nextDouble();

        System.out.print("Enter number of hours worked each week: ");
        int numberOfHours = sc.nextInt();

        double totalIncome = payRate * numberOfHours ;
        System.out.println("Your total income before tax is: $" + totalIncome );

        // tax is 14%
        double tax = totalIncome  * 0.14 ;
        double incomeAfterTax = totalIncome - tax;
        System.out.println("Your remaining income after tax is: $" + incomeAfterTax );

        // 10% spent on clothes and accessories
        double moneyOnClothes = incomeAfterTax * 0.1;
        System.out.println("The money you spend on Clothes And Other Accessories is: $" + moneyOnClothes );

        // 1% spent on school supplies
        double moneyOnSupplies = incomeAfterTax * 0.01;
        System.out.println("The money you spend on School Supplies is: $" + moneyOnSupplies );

        // 25% spent on saving bonds
        double savingBonds = incomeAfterTax * 0.25;
        System.out.println("The money you spend on Saving Bonds is: $" + savingBonds );

        // $0.50 on each dollar to buy additional bonds
        double additionalBonds = savingBonds * 0.50;
        System.out.println("The money your parents spend on additional bonds is: $" + additionalBonds );
    }  
}
