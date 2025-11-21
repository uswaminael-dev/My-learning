import java.util.*;
public class SavingCalculator {
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
        
        
        System.out.print("Enter number of units used from solar system: ");
        int units1 = sc.nextInt();
        System.out.print("Enter number of units used from electricity company: ");
        int units2 = sc.nextInt();
        
        int billFromSolar = units1 * 7;
        int billFromCompany = units2 * 60;
        int actualBill = billFromCompany + billFromSolar;
        
        int totalBillFromCompany = (units1 + units2) * 60;
        
        int saving =  totalBillFromCompany - actualBill;
        
        System.out.println("By using Solar System you are saving Rs." + saving);
    }
}