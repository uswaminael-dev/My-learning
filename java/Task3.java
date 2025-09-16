import java.util.*;
public class Task3{
    static Scanner sc = new Scanner (System.in);
    public static void main (String [] args){
        System.out.println("Enter number of students in class A: ");
        int classA = sc.nextInt();
        System.out.println("Enter number of students in class B: ");
        int classB = sc.nextInt();
        System.out.println("Enter number of students in class C: ");
        int classC = sc.nextInt();
        int totalStudents = classA + classB + classC;
        int desksNeeded = (totalStudents ) / 2; 
        System.out.println("Total number of desks needed: " + desksNeeded);
    }
}