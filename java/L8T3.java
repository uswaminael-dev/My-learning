import java.util.Scanner;
public class L8T3 {
	public static void main(String[] args){ 
	Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
	int num = input.nextInt();
	System.out.println(reverse(num));
	if ( isPalindrome(num) ){
	System.out.println("The " + num + " is a Palindrome"); }
	else{
	System.out.println("The number " + num + " is not a Palindrome"); }
	}
	
	public static int reverse(int number){
	int reversed = 0;
	while (number != 0){
	int digit = number % 10;
	
	reversed = reversed * 10 + digit ;
	number/=10;
	}
	return reversed;
 	}
	
	public static boolean isPalindrome(int number) {
	return(number) == reverse(number); }
}
