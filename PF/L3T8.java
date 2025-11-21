import java.util.*;
public class L3T8{
    static Scanner sc= new Scanner (System.in);
    public static void main (String [] args){
        System.out.print("Enter a number between 0 and 1000:");
        int number = sc.nextInt();
        int sum = number % 10;
        while (number >= 10){
            number = number / 10;
            sum = sum + (number % 10);
        }
        System.out.print(sum);
    }
}
