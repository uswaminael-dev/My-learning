import java.util.*;
public class L9T2 {
    static Scanner sc= new Scanner (System.in);
    public static void main(String [] args){
        int [] array = new int[10];
        System.out.println("Enter 10 integers:");
        for(int i = 0 ; i<array.length ; i++){
            array[i]=sc.nextInt();
        }

        
        System.out.println("Modified Array is:" ) ;
        modify(array);
        
    }

    public static void modify(int[]array){
        for (int i = 0 ; i<array.length ; i++){
            array[i]=array[i]*3;
            System.out.println(array[i]);
    }
    
    }
}