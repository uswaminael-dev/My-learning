import java.util.*;
public class L5T5 {

static final int SENTINEL = 0;
public static void main(String [] args){
Scanner sc = new Scanner (System.in);

int max = 0;
int count = 0;
System.out.println("Enter a list of integers and end it with 0:");
int number = sc.nextInt();

while (number != SENTINEL) {
count++;
number = sc.nextInt();
while (number > max){
max = number;
}
}
System.out.println( "The maximum of the sequence is "+ max);
}
}


