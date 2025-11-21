import java.util.Scanner;
public class L7T6{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String input = sc.next();
       String reverse = "";

       for(int i = input.length()-1; i>=0; i--){
       char ch = input.charAt(i);
       reverse = reverse + ch;
       }

       if(input.equals(reverse)){
       System.out.println(input + " is a palindrome");
       }
       else{
       System.out.println(input + " is not a palindrome");
       }
    }
}
