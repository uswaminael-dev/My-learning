import java.util.Scanner;
public class L7T11{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("Input: ");
		input = sc.nextLine();
	
		System.out.println(input.charAt(2));
		System.out.println(input.charAt(input.length()-2));
		System.out.println(input.substring(0, 5));
		System.out.println(input.substring(0, input.length()-2));

		for(int i=0; i < input.length(); i += 2){
		System.out.print(input.charAt(i));
		}
		System.out.println();

		for(int j=1; j < input.length(); j += 2){
		System.out.print(input.charAt(j));
		}
		System.out.println();

		for(int l=input.length()-1; l>=0; l--){
		System.out.print(input.charAt(l));
		}
		System.out.println();

		for(int m=input.length()-1; m>=0; m-=2){
		System.out.print(input.charAt(m));
		}
		System.out.println();

		System.out.println(input.length());
	}
}

