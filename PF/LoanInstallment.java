public class LoanInstallment{
    public static void main(String... args){
        double loan = 1200000;
        double annualRate = 0.12;
        double monthlyRate = 0.12 / 12;
        int totalMonths = 60;
        
        double monthlyInstallment = (loan * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -totalMonths));

        System.out.printf("Your monthly car loan installment is: Rs. %.2f%n", monthlyInstallment);
    }
}

