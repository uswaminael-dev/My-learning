import java.util.*;
public class L9T1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int[40];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11);
        }

        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        int count10=0;

        for(int i = 0; i < array.length; i++) {
            if(array[i]  == 1){
                count1=count1 + 1;}
            else if(array[i]  == 2){
                count2=count2 + 1;}
            else if(array[i]  == 3){
                count3=count3 + 1;}
            else if(array[i]  == 4){
                count4=count4 + 1;}
            else if(array[i]  == 5){
                count5=count5 + 1;}
            else if(array[i]  == 6){
                count6=count6 + 1;}
            else if(array[i]  == 7){
                count7=count7 + 1;}
            else if(array[i]  == 8){
                count8=count8 + 1;}
            else if(array[i]  == 9){
                count9=count9 + 1;}
            else{
                count10 = count10 + 1;}
            }
            System.out.println("RATING\t TIMES");
            System.out.println("1\t "+ count1);
            System.out.println("2\t "+ count2);
            System.out.println("3\t "+ count3);
            System.out.println("4\t "+ count4);
            System.out.println("5\t "+ count5);
            System.out.println("6\t "+ count6);
            System.out.println("7\t "+ count7);
            System.out.println("8\t "+ count8);
            System.out.println("9\t "+ count9);
            System.out.println("10\t "+ count10);
    
}
}