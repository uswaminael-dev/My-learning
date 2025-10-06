import java.util.*;
public class Practice04{
	
	static final int SENTINEL = 0;
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
	
		
		int count = 0;
		System.out.println("Enter a list of integers and end it with 0:");
		int number = sc.nextInt();
		
		while (number != SENTINEL) {
        	count++; 
        	number = sc.nextInt(); 
        	}
		
		
		System.out.println( "The number of numbers that is equal to 0 is "+ count);
	}
}