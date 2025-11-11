public class L4T1{
	public static void main(String [ ] args){
	int x = 10;
	int y = 15;
	int z = 20;

	boolean condition1 = (x > 10);
	System.out.println ("The condition x > 10 is " + condition1);
	
	boolean condition2 = (x <= 5 || y < 15 );
	System.out.println ("The condition x <= 5 || y < 15 is " + condition2);
	
	boolean condition3 = (x != 5  && y != z);
	System.out.println ("The condition (x != 5 ) && (y != z) is " + condition3);

	boolean condition4 = (x >= z || x + y >= z);
	System.out.println ("The condition x >= z || (x + y >= z) is " + condition4);

	boolean condition5 = (x <= y - 2) && (y >= z) || (z - 2 != 20);
	System.out.println ("The condition (x <= y - 2) && (y >= z) || (z - 2 != 20) is" + condition5);

	}
}



