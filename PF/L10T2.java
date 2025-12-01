import java.util.*;
public class L10T2{
    static Scanner sc = new Scanner (System.in);
    public static void main(String args[]){
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int [][] array = new int [rows][columns];    
        int column=0;
        int count=0;
        int max=0;
        for(int i=0 ; i<rows ; i++){
            System.out.println("Enter array elements of row " + (i+1));
            for (int j=0 ; j<columns ; j++){
                array [i][j] = sc.nextInt();}
        }
        for(int j=0 ; j<columns ; j++){
            for (int i=0 ; i<rows ; i++){
                count = count + array[i][j];
                if (count >  max){
                    max = count;
                    column = j+1;}} 
        }
        System.out.print("The column having maximum sum is " + column);}
}




