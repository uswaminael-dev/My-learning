import java.util.*;
public class L9T3 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int [] array = new int[size];
        int [] reversedArray= new int [size];
        System.out.println("Enter integers:");
        for(int i = 0 ; i<array.length ; i++){
            array[i]=sc.nextInt();
        }

        for (int i=0;i<array.length;i++){
            reversedArray[i]=array[array.length-1-i];
            System.out.print(reversedArray[i] + "  ");
        }



    }
}
