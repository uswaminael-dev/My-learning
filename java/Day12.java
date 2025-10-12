
import java.util.*;
public class Day12{
	static Scanner sc = new Scanner (System.in);
	
	public static boolean isEven (int n){
        if(n % 2 == 0)
            return true;
        else
            return false;
    }
    
    public static void showMessage(int num){
        if (isEven(num))
            System.out.println("Wow! You picked an even number.");
        else 
            System.out.println("That's an odd choice!");
    }
	
	public static void main(String [ ] args){
	 
    System.out.print("Enter a number:");
    int num = sc.nextInt();
    
    
    if (num > 0)
        System.out.println("Positive number");
    else if (num < 0)
        System.out.println("Negative number");
    else
        System.out.println("Zero");
        
    
    boolean even = isEven(num);
    System.out.println("Is the number even? " + even);
    
    
    int counter = 0;
    int sum = 0;
    while (counter <= num){
        sum = sum + counter;
        counter++;
        
    }
    
    System.out.println("Sum: " + sum);
    
    showMessage(num);
    
    for(int i=1 ; i <= num ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print("* " );
        }
    System.out.println();    
    }
	}
}