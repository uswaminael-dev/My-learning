import java.util.*;
public class L5T2{
static Scanner sc=new Scanner (System.in);
public static void main(String [] args){
System.out.print("Enter a number : ");
int num = sc.nextInt();
int counter = 1;
int factorial=1;

while (num >= counter){
factorial = factorial * counter;
counter++;
}
System.out.println("Factorial of " + num + " is " + factorial);
}
}
