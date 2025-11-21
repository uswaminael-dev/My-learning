import java.util.*;
public class Task4 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String [ ] args){
        System.out.print("Enter the number of minutes that is passed since midnight: ");
        int minutesPassed = sc.nextInt();
        int hours = minutesPassed / 60 ;
        int minutes = minutesPassed % 60;

        System.out.println("Now the time is :" + hours + ":" + minutes );

    }
    
}
