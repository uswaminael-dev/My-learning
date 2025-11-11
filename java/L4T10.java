import java.util.*;
public class L4T10 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	System.out.println("Enter number of books purchased this month:");
	int numOfBooks = sc.nextInt();

	switch(numOfBooks){
	case 0:
		System.out.println("You earned 0 points");
		break;
	case 1:
		System.out.println("You earned 5 points");
		break;
	case 2:
		System.out.println("You earned 15 points");
		break;
	case 3:
		System.out.println("You earned 30 points");
		break;
	default:
		System.out.println("You earned 60 points");
		break;
	}
	}
}
 
