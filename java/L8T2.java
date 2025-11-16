import java.util.Scanner;
public class L8T2 {
	public static void main(String[] args){ 
	Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
	int num = input.nextInt();
	reverse(num);
	}
	
	public static void reverse(int number){
	int digit;
	int sum = 0;
	while (number != 0){
	digit = number % 10;
	System.out.print(digit) ;
	number/=10;
	}
	System.out.println();
	}
}
