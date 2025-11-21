import java.util.*;
public class L4T4 {
static Scanner sc = new Scanner (System.in);
public static void main(String [ ] args){System.out.print("Enter first integer: ");
int num1 = sc.nextInt();
System.out.print("Enter second integer: ");
int num2 = sc.nextInt();

    //(a) Minimum of two numbers
    if (num1 > num2){
        System.out.println("Minimum Value: " + num2);
    }
    //(b) Maximum of two numbers
    if (num1 > num2){
        System.out.println("Maximum Value: " + num1);
    }
    
    //(c) Sign Function
    System.out.print("Enter a number: ");
    int x = sc.nextInt();
    if (x > 0){
        System.out.println("1");
    }
    else if (x < 0){
        System.out.println("-1");
    }
    else{
        System.out.println("0");
    }

    //(d) Minimum of three numbers
    System.out.print("Enter first number: ");
    int number1= sc.nextInt();
    System.out.print("Enter second number: ");
    int number2= sc.nextInt();
    System.out.print("Enter third number: ");
    int number3= sc.nextInt();
    
    if (number1 < number2 && number1 < number3 ){
        System.out.println("Minimum of three numbers is: " + number1);
    }
    else if(number2 < number1 && number2 < number3){
         System.out.println("Minimum of three numbers is: " + number2);
    }
    else{
         System.out.println("Minimum of three numbers is: " + number3);
    }
    
	}
}
 
