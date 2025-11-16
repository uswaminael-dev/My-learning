import java.util.Scanner;
public class L8T1 {
	public static void main(String[] args){ 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
    int num = input.nextInt();
	int z = sumDigits(num);
	System.out.println(sumDigits(num));
	}

	 public static int sumDigits(long n){
	 int sum = 0;
	while (n != 0){
	sum += n % 10;
	n/= 10;
	}
	return sum; 
	}
}
	
