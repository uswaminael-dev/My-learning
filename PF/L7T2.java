import java.util.*;
import java.lang.Math;
public class L7T2{
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
    System.out.print("Enter an ACII code: ");
    int code = sc.nextInt();
    char ch = (char)(code);
    System.out.println("The character for ACII code " + code + " is " + ch);
    
    System.out.print("Enter a character: ");
    char character = sc.next().charAt(0);
    int unicode = (int)(character);
    System.out.print("The Unicode for the character " + character + " is " + unicode);
    }
}	

