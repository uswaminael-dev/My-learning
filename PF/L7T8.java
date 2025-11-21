import java.util.Scanner;
public class L7T8{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Input: ");
       String input = sc.nextLine();
       System.out.print("Correct Answer:" + input.indexOf('f') + " " + input.lastIndexOf('f'));
       }
    }
