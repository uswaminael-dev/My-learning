import java.util.*;
public class L3T2{
    static Scanner sc = new Scanner (System.in);
    public static void main (String [] args){
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of apples:");
        int apples = sc.nextInt();
        int applesPerStudent = apples / students;
        System.out.println("Each student gets " + applesPerStudent + " apples");
        int remainingApples = apples % students;
        System.out.println("Number of remaining apples is: " + remainingApples);
        
    }
}
