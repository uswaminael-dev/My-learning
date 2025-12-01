import java.util.*;
public class L10T3 {	
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];
        int maxPrimes = 0;
        int rowWithMax = -1;
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter array elements of row " + (i + 1));
            int primeCount = 0;  
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
                if (isPrime(array[i][j])) {
                    primeCount++;  }    }
            if (primeCount > maxPrimes) {
                maxPrimes = primeCount;
                rowWithMax = i + 1;   }    }
        System.out.println("The row having maximum prime numbers is: " + rowWithMax);}
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;}
        return true;  }}
