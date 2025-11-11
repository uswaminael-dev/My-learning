import java.util.*;
public class L4T9 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	System.out.print("Enter number of quarters: ");
	double quarters = sc.nextDouble();
    System.out.print("Enter number of dimes: ");
	double dimes = sc.nextDouble();
	System.out.print("Enter number of nickles: ");
	double nickles = sc.nextDouble();
	System.out.print("Enter number of pennies: ");
	double pennies = sc.nextDouble();
	
    double cents = (quarters * 25) + (dimes * 10) + (nickles * 5) + (pennies * 1);
    double dollar = cents / 100;
    
    if (dollar == 1.00){
        System.out.println("Woho ! You won.");
    }
    else if (dollar > 1){
        System.out.println("Amount entered was more than one dollar \nBetter luck next time.");
    }
	else{
	    System.out.println("Amount entered was less than one dollar \nBetter luck next time.");
	}
	}
}

