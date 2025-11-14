import java.util.Scanner;
    public class L7T10{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Input: ");
       String str = sc.nextLine();
       
       String first = str.substring(0, str.indexOf('h') + 1);
       String second = str.substring(str.indexOf('h') + 1, str.lastIndexOf('h'));
       String third = str.substring(str.lastIndexOf('h'), str.length());

       String replaced = second.replace('h', 'H');
       System.out.print("Correct answer: " + first + replaced + third);
    }
}
