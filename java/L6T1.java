import java.util.Scanner;
public class L6T1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 1;
int number;
int SENTINEL = 0;
int max = 0;
System.out.print("Enter a list of integers ending with 0: " );
number = input.nextInt();
while (number != SENTINEL) {
number = input.nextInt();
if (number > max){
max = number;
counter++;}
}
System.out.println("Index of largest element of sequence is " + counter);}
}
