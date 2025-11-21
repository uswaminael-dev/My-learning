import java.util.Scanner;
public class L7T9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String str = sc.nextLine();
		System.out.print("Correcr Answer: " + str.substring(0, str.indexOf('h'))  + str.substring(str.lastIndexOf('h') + 1, str.length()));
		}
	}
