import java.util.*;
public class L5T1b{
    static Scanner sc= new Scanner(System.in);
    public static void main(String [] args){

    int num1, num2;
    System.out.print("Enter first number: ");
    num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    num2 = sc.nextInt();

    while (num1 < num2){
    System.out.println(num1);
    num1++;
    }

    while (num1 >= num2){
    System.out.println(num2);
    num2++;
    }
    System.out.print("Program Ended!");
            }
}

