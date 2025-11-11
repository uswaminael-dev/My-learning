import java.util.*;
public class L4T8 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	System.out.print("Enter a month (in numeric form): ");
	int month = sc.nextInt();
    System.out.print("Enter a day (date): ");
	int day = sc.nextInt();
	System.out.print("Enter a year (in two-digit): ");
	int year = sc.nextInt();
	
	if (month * day == year){
	    System.out.println("THE DATE IS MAGIC");
	    System.out.println(day + "/" + month + "/" + year);}
	else{
	     System.out.println("THE DATE IS NOT MAGIC");
	     System.out.println(day + "/" + month + "/" + year);}
	
	}
}

