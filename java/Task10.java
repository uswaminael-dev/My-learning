
public class Task10 {
    public static void main(String[] args) { 
    
    System.out.println("Degrees   Sin       Cos       Tan");
    
    int degrees = 30; 
    double radians = Math.toRadians(degrees); 
    double sin = Math.sin(radians); 
    double cos = Math.cos(radians); 
    double tan = Math.tan(radians); 
    
    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, sin, cos, tan);
    
    degrees = 60; 
    radians = Math.toRadians(degrees); 
    sin = Math.sin(radians); 
    cos = Math.cos(radians); 
    tan = Math.tan(radians); 

    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, sin, cos, tan);
    }  
} 
