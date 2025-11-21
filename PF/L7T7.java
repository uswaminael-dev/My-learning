import java.util.Scanner;
public class L7T7{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Input: ");
       String input = sc.nextLine();

       String first = input.substring(0, input.indexOf(' '));
       String second = input.substring(input.indexOf(' '), input.length());
       System.out.println("Correct Answer:" + second + " " + first);
    }
}
