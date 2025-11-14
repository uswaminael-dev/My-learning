import java.util.*;
import java.lang.Math;
public class L7T1{
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
        double radius = 6371.01;
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        
        double x1 = Math.toRadians(a1);
        double y1 = Math.toRadians(b1);
         
        double x2 = Math.toRadians(a2);
        double y2 = Math.toRadians(b2);
        
        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.print("The distance between the two points is " + d + " km.");
        
    }
}
