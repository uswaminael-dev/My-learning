import java.util.*;
public class Practice10{
	
	static final int SENTINEL = 0;
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
	
		int sum = 0;
		int count = 0;
		System.out.println("Enter a list of integers and end it with 0:");
		int number = sc.nextInt();
		
		while (number != SENTINEL) 
        {
        sum = sum + number; 
        count++; 
        number = sc.nextInt(); 
        }
		
		
		System.out.println( "The sum of the integers given is "+ sum);
	}
}