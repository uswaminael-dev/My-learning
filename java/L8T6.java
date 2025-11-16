import java.util.Scanner;
public class L8T6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        System.out.println("The number of letters in the string is: " + countLetters(str));
    }

    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {   
                count++; }  }
        return count;}}
