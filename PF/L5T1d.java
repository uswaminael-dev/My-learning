import java.util.*;
public class L5T1d{
static Scanner sc= new Scanner(System.in);
public static void main(String [] args){

int num ;
System.out.print("Enter a number: ");
num = sc.nextInt();

int counter = 0;
int sum = 0;

while (num >= counter){
int cube =(int) (Math.pow(counter , 3));
counter ++;
sum = sum + cube;
}


System.out.print("Sum of cubes is " + sum);
}
}
