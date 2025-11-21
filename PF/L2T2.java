import java.util.*;
public class L2T2{
static Scanner console= new Scanner (System.in);
	public static void main(String [] args){
	int length;
	System.out.println("Enter the length: ") ;
	length=console.nextInt();

	int width;
	System.out.println("Enter the width: "); 
	width=console.nextInt();

	int area;
	area= length * width;
	System.out.println("Area = " + area); 

	int perimeter;
	perimeter=2 * (length + width);
	System.out.println("Perimeter = " + perimeter); 

	}
}
