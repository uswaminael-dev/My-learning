import java.util.*;	
public class L10T4{
    static Scanner sc = new Scanner (System.in);
    public static void main(String args[]){
        System.out.print("Enter number of rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns1 = sc.nextInt();
        int [][] array1 = new int [rows1][columns1];
        for(int i=0 ; i<rows1 ; i++){
            System.out.println("Enter array elements of row " + (i+1));
            for (int j=0 ; j<columns1 ; j++){
                array1 [i][j] = sc.nextInt();}   }
        System.out.print("Enter number of rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns2 = sc.nextInt();
        int [][] array2 = new int [rows2][columns2];
        for(int i=0 ; i<rows2 ; i++){
            System.out.println("Enter array elements of row " + (i+1));
            for (int j=0 ; j<columns2 ; j++){
                array2 [i][j] = sc.nextInt();}}
        int [][] array3 = new int [3][3];
        for(int i=0 ; i< 3 ; i++){ 
            for (int j=0 ; j<3 ; j++){
                array3[i][j] = 0;
                for(int k=0 ; k<4 ; k++){
                array3 [i][j] += array1[i][k] * array2[k][j];}}}
        System.out.println();
        for(int i=0 ; i< 3 ; i++){ 
            for (int j=0 ; j<3 ; j++){
                System.out.print(array3[i][j] + "\t");}
            System.out.println();}}}
            

