import java.util.*;

public class Day11{
    static Scanner sc = new Scanner (System.in);
    public static void main (String... args){
        
        int [][] numbers = {{2,4,6,8,0} , {1,3,5,7,9,11,13,15}};
        System.out.println("Number of rows in this multi-dimensional array is:" + numbers.length);

        System.out.println("Number of columns in first row is:" + numbers[0].length);
        
        System.out.println("Number of columns in second row is:" + numbers[1].length);

        for (int[] num : numbers) {
            System.out.println(Arrays.toString(num));
        }
    }
}
