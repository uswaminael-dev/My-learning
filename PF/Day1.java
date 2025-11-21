import java.util.*;

public class Day1{
    static Scanner sc = new Scanner (System.in);
    public static void main(String [ ] args){
        
        System.out.print("Your Name:");
        String name = sc.next();
        System.out.print("Your Age:");
        int age = sc.nextInt();
    
    
        System.out.print("Your Section:");
        char section= sc.next().charAt(0);
        int totalMarks = 500;
        
        
         System.out.print("Do you want to know your accurate grade:");
        String response = sc.next();
        
        while (response.equalsIgnoreCase("yes")){
            System.out.print("Your Marks Out Of 500:");
            double  marks= sc.nextDouble();
        if (marks < 500){
            double percentage =(marks / totalMarks) * 100;
            if (percentage >= 90){
                System.out.println("Grade A");}
            else  if (percentage >=80){
                System.out.println("Grade B");}
             else if  (percentage >= 70){
                System.out.println("Grade C");}
            else if  (percentage >= 60){
                System.out.println("Grade D");}
            else if  (percentage >= 50){
                System.out.println("Grade E");}
            else{
                System.out.println("Grade F");}
        }
        else{
              System.out.println("Please select out of the total marks");}
    
         System.out.print("Do you want to know your accurate grade:");
         response = sc.next();
        
        }
    }
}