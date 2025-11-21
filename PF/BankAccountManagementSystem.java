import java.util.*;
public class BankAccountManagementSystem{
    public static int totalBalance = 10000;
    public static int depositedCash;
    public static int withdrawnCash;
    static Scanner sc = new Scanner (System.in);
    
    
    public static void main(String [] args){
        
        
        boolean logIn = validity();
        if(logIn == true){
            mainMenu();}
        else{
            logIn = validity();
        }
    }

    //sort of log in method    
    public static boolean validity(){
        String admin1 = "Uswa";
        String admin2 = "Maheen";
        String adminPassword = "050025";
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
    
    
        if (username.equalsIgnoreCase(admin1) || username.equalsIgnoreCase(admin2)){
            if (password.equals(adminPassword)) {
             System.out.println("Access Granted...Welcome");
                return true;
            }
            else{
                System.out.println("Wrong Password!");
                return false;
            }
           } 
        
        else{
            System.out.println("User not found!");
            return false;
        }
    
    }
    
    

    //to display main menu and options
    public static void mainMenu(){
        
        while(true){
            System.out.println("----- BANK ACCOUNT MANAGEMENT SYSTEM -----");
            System.out.println("1 ---> CHECK BALANCE ");
            System.out.println("2 ---> WITHDRAW MONEY ");
            System.out.println("3 ---> DEPOSIT MONEY ");
            System.out.println("0 ---> EXIT ");
      
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 0){
                System.out.println("Exiting....GOODBYE!");
                break;}
            else if (choice==1){
                checkBalance();}
            else if (choice==2){
                withdrawCash();}
            else if (choice==3){
                depositCash();}
            else{
                System.out.println("Invalid Input!...Try Again");
                }
        }
    }
    //checking the balance present in the account
    public static void checkBalance(){
        System.out.println("Current Balance: " + totalBalance );
    
    }
    //depositing amount in the account
    public static void depositCash(){
        
        System.out.print("Enter amount to deposit: ");
        depositedCash = sc.nextInt();
        if (depositedCash < 0){
            System.out.print("Invalid Input...Try Again");}
        else{
            totalBalance = totalBalance + depositedCash;
        }
    }
    //withdrawing amount from the account
    public static void withdrawCash(){
        System.out.print("Enter amount to withdraw: ");
        withdrawnCash = sc.nextInt();
        totalBalance = totalBalance - withdrawnCash;
    }
}