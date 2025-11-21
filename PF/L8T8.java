import java.util.Scanner;

public class L8T8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int vowelCount;
        System.out.print("Enter a String: ");
        String str = input.nextLine();
	vowelCount = countVowels(str);

	System.out.println("Number of Vowels in the string: " + vowelCount);   }
	public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; }
        }
        return count;   }}
