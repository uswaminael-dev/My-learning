public class MonthlySavings {
    public static void main(String [] args){
        double income = 50000;
        double expenses = 37500;
        double saving = 50000 - 37500;
        
        double monthsRequired = 1000000 / saving; 
        System.out.println((int) monthsRequired + " months are required to save enough money to buy your desired laptop." );
    }
}