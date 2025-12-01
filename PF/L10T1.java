import java.util.*;	        
public class L10T1{
    static Scanner sc = new Scanner (System.in);
    public static void main(String args[]){
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int [][] array = new int [rows][columns];
        int row=0;
        int sum=0;
        int max=0;
        for(int i=0 ; i<rows ; i++){
            System.out.println("Enter array elements of row " + (i+1));
            for (int j=0 ; j<columns ; j++){
                array [i][j] = sc.nextInt();}
        }
        for(int i=0 ; i<rows ; i++){
            for (int j=0 ; j<columns ; j++){
                sum = sum + array[i][j];
                if (sum >  max){
                    max = sum;
                    row = i+1;}
            }
        }
        System.out.print("The row having maximum sum is " + row);  }
}



