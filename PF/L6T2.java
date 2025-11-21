import java.util.Scanner;
public class L6T2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 0;
int number;
int SENTINEL = 0;
System.out.print("Enter a list of integers ending with 0: " );
number = input.nextInt();
while (number != SENTINEL) {
if (number % 2 == 0){
counter++;}
number = input.nextInt();}
System.out.println("Number of the even elements of sequence is " + counter);}
}
