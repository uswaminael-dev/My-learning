import java.util.*;
public class L2T3{
static Scanner console= new Scanner (System.in);
	public static void main(String [] args){
	
	int SECRET=11;
	double RATE=12.50;

	int num1;
	int num2;
	int newNum;
	float hoursWorked;
	double wages;

	System.out.println("Enter first integer: ");
	num1=console.nextInt();

	System.out.println("Enter second integer: ");
	num2=console.nextInt();

	System.out.println("The value of num1 = " + num1);
	System.out.println("The value of num2 = " + num2);

	newNum=(num1*2) + num2;
	System.out.println("The value of newNum = " + newNum);

	newNum=newNum + SECRET;
	System.out.println("The updated value of newNum = " + newNum);

    String name;
	System.out.println("Enter your name: ");
	name=console.next();

	System.out.println("Enter a decimal number between 0 and 70: ");
	hoursWorked=console.nextFloat();

	wages=RATE * hoursWorked;

	System.out.println("Name: " + name);
	System.out.println("Pay Rate: $" + RATE);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Salary: $" + wages);
	}
}
