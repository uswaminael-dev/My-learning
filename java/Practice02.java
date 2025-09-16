import java.util.*;

public class Practice02{
    static Scanner sc=new Scanner (System .  in);
    public static void main(String [ ] args){
       String name;
       int age;
        System.out.print("What is your name?");
        name=sc.next();
        System.out.print("What is your age?");
        age=sc.nextInt();
        LicenseEligibility(name, age);
        Loop(name);
    }

    public static void LicenseEligibility(String name, int age){

        if (age<18){
            System.out.print("You are not eligible for License yet");
            }
        else{
            System.out.print("Please enter your contact number;");
            String contact=sc.next();
            System.out.print("Our team will reach you out soon at  for further process");
        
        }
    }
    public static void Loop(String name){
        for(int i=0 ; i<=5 ; i++){
            System.out.println("Hello " + name);
            
        }
    }
    
}