import java.util.*;
public class ReverseOrder{
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
        
        
        System.out.print("Enter a five digit number: ");
        int number = sc.nextInt();
        
        int num1 = number % 10;
        number = number / 10;
        
        int num2 = number % 10;
        number = number / 10;
        
        int num3 = number % 10;
        number = number / 10;
        
        int num4 = number % 10;
        number = number / 10;
        
        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);
        System.out.print(num4);
        System.out.print(number);
        
    }
}