import java.util.Scanner;
public class L8T9 {
  static Scanner input = new Scanner(System.in);
  public static String capitalize(String str){
    char first = Character.toUpperCase(str.charAt(0));
    String capitalizedString = first + str.substring(1);
    return capitalizedString;
  }

    public static void main(String[] args){
        System.out.print("Enter a string: ");
        String str = input.next();
       
        while (true) {
            System.out.print(capitalize(str) + " ");
            str = input.next();
        }
    }
}
