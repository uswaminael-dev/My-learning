import java.util.*;
public class L4T7 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	System.out.println("Enter length of 1st rectangle");
	double length1 = sc.nextDouble();
	System.out.println("Enter width of 1st rectangle");
	double width1 = sc.nextDouble();
	
	System.out.println("Enter length of 2nd rectangle");
	double length2 = sc.nextDouble();
	System.out.println("Enter width of 2nd rectangle");
	double width2 = sc.nextDouble();

	double area1 = length1 * width1;
	double area2 = length2 * width2;

	if (area1 > area2){
		System.out.println("Area of 1st rectangle is greater than 2nd rectangle");}

	else{
		System.out.println("Area of 2nd rectangle is greater than 1st rectangle");}

	if (area1 == area2){
		System.out.println("Area of both the triangles is same");}

	else{
		System.out.println("Area of both rectangles is different");}
	}
}


