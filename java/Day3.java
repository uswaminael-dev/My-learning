
import java.util.*;
public class Day3{
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	 
    System.out.println("ATM Stimulator");
    
    float balance = 10000.0f;
    int choice;
    float amount;
    
    System.out.println("Welcome to ATM Machine");
    
    try{
        do{
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    System.out.println("Your Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextFloat();
                    if (amount <= 0){
                        throw new Exception ("Invalid deposit amount. ");
                    }
                    else {
                        balance = balance + amount;
                    System.out.println("Deposit Successful. New Balance: " + balance);}
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextFloat();
                    if (amount <= 0){
                        throw new Exception ("Invalid withdrawal amount. ");
                    }
                    else if (amount > balance){
                        throw new Exception ("Insufficient Balance.");
                    }
                    else{
                        balance = balance - amount;
                        System.out.println("Withdrawal Successful. Remaining Balance: " + balance);}
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Try Again.");
            }
        }
        
        while (choice != 4);
    } 
    
    catch (InputMismatchException e){
         System.out.println("Input Error. Please enter a valid number.");
    }
    
    catch (Exception e){
         System.out.println("Error." + e.getMessage());
    }  
    
    finally {
        System.out.println("ATM Session Ended.");
    }  
    
    
	}
}