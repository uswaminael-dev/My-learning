import java.util.*;
public class Day9{
    static Scanner sc = new Scanner (System.in);
    public static void main (String... args){
        int [] ages = {20, 22, 19, 25, 18};
        float sum = 0;
        float avg ;
        int i;
        int length = ages.length;
        
        for( i=0 ; i<=length - 1 ; i++){
            sum = sum + ages[i];
        }
        
        avg = sum / length;
        
        if (avg > 20){
            System.out.println("Average age (" + avg + ") shows a mature class.");}
        else{ 
            System.out.println("Average age (" + avg + ") shows a young class.");}
            
        int roundedAvg = (int) avg;
        
        System.out.println("Rounded average age is: " + roundedAvg);
        
        if (roundedAvg > 21){
            System.out.println("Teacher says : You all can handle serious projects now.");}
        else{
            System.out.println("Teacher says: Enjoy your youth while lerning java.");
        }
    }
}