import java.util.*;
public class Assignment03{
    static Scanner sc = new Scanner (System.in);
    public static void mainMenu(){
        while(true){
            System.out.println();
            System.out.println("------Assignment 03------");
            System.out.println("1 ---> Question 1 ");
            System.out.println("2 ---> Question 2");
            System.out.println("3 ---> Question 3 ");
            System.out.println("4 ---> Question 4 ");
            System.out.println("5 ---> Question 5 ");
            System.out.println("0 ---> EXIT ");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 0){
                System.out.println("Exiting....GOODBYE!");
                break;}
            else if (choice==1){
                Q1();}
            else if (choice==2){
                Q2();}
            else if (choice==3){
                Q3();}
            else if (choice==4){
                Q4();}
            else if (choice==5){
                Q5();}
            else{
                System.out.println("Invalid Input!...Try Again");
                }
        }
    }
    
    
    public static void Q1() {
    System.out.print("Enter number of rows: ");
    int rows1 = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int columns1 = sc.nextInt();
    
    int [][] array1 = new int [rows1][columns1];
    for(int i = 0 ; i < rows1 ; i++){
        System.out.println("Enter array elements of row " + (i+1));
        for (int j = 0 ; j < columns1 ; j++){
            array1[i][j] = sc.nextInt();
        }
    }

    System.out.print("Enter number of rows: ");
    int rows2 = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int columns2 = sc.nextInt();
    
    int [][] array2 = new int [rows2][columns2];
    for(int i = 0 ; i < rows2 ; i++){
        System.out.println("Enter array elements of row " + (i+1));
        for (int j = 0 ; j < columns2 ; j++){
            array2[i][j] = sc.nextInt();
        }
    }

    if(columns1 == rows2){
        int [][] array3 = new int [rows1][columns2];

        for(int i = 0 ; i < rows1 ; i++){ 
            for (int j = 0 ; j < columns2 ; j++){
                array3[i][j] = 0;
                for(int k = 0 ; k < columns1 ; k++){
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println();
        for(int i = 0 ; i < rows1 ; i++){ 
            for (int j = 0 ; j < columns2 ; j++){
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }

    } else {
        System.out.print("Multiplication Not Possible!...");
    }
}

    
    
       
    public static void Q2(){
        System.out.print("Enter the size for the matrix: ");
        int size = sc.nextInt();
         int [][] array1 = new int [size][size];
        for(int i=0 ; i<size ; i++){
            for (int j=0 ; j<size ; j++){
                array1 [i][j] = (int)(Math.random()*2);}   }
        for(int i=0 ; i<size ; i++){
            for (int j=0 ; j<size ; j++){
                System.out.print(array1 [i][j] + "\t");}  
        System.out.println();  } 
        for(int i=0 ; i<size ; i++){
            int ZeroInRow=0;
            int OnesInRow=0;
            for (int j=0 ; j<size ; j++){
                if(array1[i][j]==0){
                    ZeroInRow += 1;}
                else{
                    OnesInRow += 1;
                }
            } 
        if(ZeroInRow == size ){
            System.out.println("All 0s in row " + i );}
        if(OnesInRow == size ){
            System.out.println("All 1s in row " + i );}    
        } 
        for(int j=0 ; j<size ; j++){
            int ZeroInColumn=0;
            int OnesInColumn=0;
            for (int i=0 ; i<size ; i++){
                if(array1[i][j]==0){
                ZeroInColumn += 1;}
                else{
                    OnesInColumn +=1;
                }
            }
        if(ZeroInColumn == size ){
            System.out.println("All 0s in column " + j );}
                    if(OnesInColumn == size ){
            System.out.println("All 1s in column " + j );}    
        }
        for(int i=0 ; i<size ; i++){
            int ZeroInDiagonal=0;
            int OnesInDiagonal=0;
            
                if(array1[i][i]==0){
                ZeroInDiagonal += 1;}
                else{
                    OnesInDiagonal +=1;
                } 
        if(ZeroInDiagonal == size ){
            System.out.println("All 0s in diagonal " );}
        if(OnesInDiagonal == size ){
            System.out.println("All 1s in diagonal "  );}    
        } 
        int ZeroInSubDiagonal=0;
        int OnesInSubDiagonal=0;
        for(int i=1 ; i<size ; i++){
                if(array1[i][i - 1]==0){
                ZeroInSubDiagonal += 1;}
                else{
                    OnesInSubDiagonal +=1;
                } 
        if(ZeroInSubDiagonal == size ){
            System.out.println("All 0s in sub-diagonal " );}
        if(OnesInSubDiagonal == size ){
            System.out.println("All 1s in sub-diagonal "  );}    
        }
    }
    
    
    
    
        
    public static void Q3(){
        char [] my_Array = {'a' , 's', 'c' , 's' , 'a' , 'c','s', 'a' , 'a'};
        Arrays.sort(my_Array);
        for (int i=0 ; i<my_Array.length ; i++){
            System.out.print(my_Array[i] + "  ");
        }
    } 
    public static int count(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) count++;
        }
        return count;
    }
    public static void partition(int[] array) {
        int pivot = array[0];
        int[] newArray = new int[array.length];
        int position = 0;
        for (int value : array) {
            if (value < pivot) newArray[position++] = value;
        }
        newArray[position++] = pivot;
        for (int value : array) {
            if (value > pivot) newArray[position++] = value;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
        System.out.println("Array after partition:");
        display(array);
    }

    public static void duplicates(int[] array) {
        boolean[] checked = new boolean[array.length];

        System.out.println("Frequencies:");
        for (int i = 0; i < array.length; i++) {
            if (!checked[i]) {
                int frequency = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        checked[j] = true;
                        frequency++;
                    }
                }
                System.out.println(array[i] + " ---> " + frequency + " times");
            }
        }
    }
    public static void circular(int[] array) {
        int length = array.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int next1 = array[(i + 1) % length];
            int next2 = array[(i + 2) % length];
            result[i] = next1 + next2;
        }

        System.out.println("After circular:");
        display(result);
    }

    public static void shiftCircular(int[] array) {
        int length = array.length;
        int[] shiftedArray = new int[length];

        for (int i = 0; i < length; i++) {
            shiftedArray[i] = array[(i + 2) % length];
        }

        System.out.println("After shiftCircular:");
        display(shiftedArray);
    }

    public static void display(int[] array) {
        for (int value : array) System.out.print(value + " ");
        System.out.println();
    }

    public static void Q4() {
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) array[i] = sc.nextInt();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Count a number");
            System.out.println("2. Partition the array");
            System.out.println("3. Show duplicates");
            System.out.println("4. Circular sum");
            System.out.println("5. Shift circular");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter number to count: ");
                int target = sc.nextInt();
                System.out.println("Count = " + count(array, target));
            }

            else if (choice == 2) {
                partition(array);
            }

            else if (choice == 3) {
                duplicates(array);
            }

            else if (choice == 4) {
                circular(array);
            }

            else if (choice == 5) {
                shiftCircular(array);
            }

            else if (choice == 6) {
                System.out.println("Goodbye!");
            }

            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 6);

    }


    public static void Q5() {
       
        int[][] grid = new int[3][3];
        int threshold = 200;
      
        System.out.println("Enter energy values for 3x3 sector:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Grid:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] optimized = new int[3][3];
        int[] dx = { -1, 1, 0, 0 }; 
        int[] dy = { 0, 0, -1, 1 }; 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                optimized[i][j] = grid[i][j];
                if (grid[i][j] >= threshold) {
                    
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        
                        if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3) {
                            optimized[i][j] = grid[ni][nj];
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Optimized Grid:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(optimized[i][j] + " ");}       
        System.out.println();    }
    }
    public static void main(String [] args){
        mainMenu();  }
}
