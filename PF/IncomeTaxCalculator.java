import java.util.*;
public class IncomeTaxCalculator{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
      
	
        System.out.print("Enter Monthly Salary (0 to exit): ");
        double income = sc.nextDouble();
	
	double annualIncome = income * 12;
	System.out.print("Annual Income: " + annualIncome);
	

	if (income <= 600000){
		double annualTax = 0;
		System.out.println("Annual Tax: " + annualTax);
		System.out.println("Monthly Tax Deduction: " + (income - annualTax);}
	else if((income > 600000) $$ (income <= 1200000)){
		annual tax = income * 0.01;
		System.out.println("Annual Tax: " + annualTax);
		System.out.println("Monthly Tax Deduction: " + (income - annualTax);}
	else if((income > 1200000) $$ (income <= 2200000)){
		annual tax = 6000 + (income * 0.11);
		System.out.println("Annual Tax: " + annualTax);
		System.out.println("Monthly Tax Deduction: " + (income - annualTax);}
	else if((income > 2200000) $$ (income <= 3200000)){
		annual tax = 116000 + (income * 0.23);
		System.out.println("Annual Tax: " + annualTax);
		System.out.println("Monthly Tax Deduction: " + (income - annualTax);}
	else if((income > 3200000) $$ (income <= 4100000)){
		annual tax = 346000 + (income * 0.30);
		System.out.println("Annual Tax: " + annualTax);
		System.out.println("Monthly Tax Deduction: " + (income - annualTax);}
	else{
		annual tax = 616000 + (income * 0.35);
		System.out.println("Annual Tax: " + annualTax);
		System.out.println("Monthly Tax Deduction: " + (income - annualTax);}
	
	}
}		
	
	