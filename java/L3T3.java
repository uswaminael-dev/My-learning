import java.util.*;
public class L3T3{
    static Scanner sc = new Scanner (System.in);
    public static void main (String [] args){
        System.out.print("Enter number of students in class A: ");
        int classA = sc.nextInt();
        System.out.print("Enter number of students in class B: ");
        int classB = sc.nextInt();
        System.out.print("Enter number of students in class C: ");
        int classC = sc.nextInt();
        int totalStudents = (classA  + 1)+ (classB + 1) + classC;
        int desksNeeded = (totalStudents ) / 2; 
        System.out.print("Total number of desks needed: " + desksNeeded);
    }
}
