
import java.util.*;
public class Day2{
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	 
	 int studentCount;
	 int i;
	 float totalMarks , percentage;
	 String name;
	 
	 System.out.print("Enter number of students:");
	 studentCount = sc.nextInt();
	 try{
    	 for (i=1;i<=studentCount;i++){
    	     System.out.print("Enter student name:");
    	       name = sc.next();
    	       
    	      System.out.print("Enter marks obtained (out of 500):");
    	       totalMarks = sc.nextFloat();
    	 
    	 int roundedMarks = (int)totalMarks;
    	 percentage = (totalMarks / 500) * 100;
    	 
    	 if (totalMarks <= 500){   
        	 if (percentage >= 80){
        	     System.out.println ( name + " got A grade.");}
        	 else if (percentage >= 60){
        	     System.out.println ( name + " got B grade.");}
        	 else if (percentage >= 40){
        	     System.out.println ( name + " got C grade.");}
        	 else{
        	     System.out.println ( name + " got Fail.");}
    	 }
    	 
    	 else{ 
    	     System.out.println ("Invalid input.You were supposed to enter marks out of 500");}
    	} 
	 }
	 
	 catch (InputMismatchException e){
	      System.out.println("Error: Invalid input type. Please enter a number where expected.");}
	 finally {
	      	System.out.println ("Grading Completed");
	 }
	 
    
	}
}
    

