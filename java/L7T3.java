import java.util.*;
import java.lang.Math;
public class L7T3{
    static Scanner sc = new Scanner (System.in);
    public static void main(String [] args){
    System.out.print("Enter a decimal value (0 to 15): ");
    int value = sc.nextInt();
    if ((value <= 15) && (value >=0)){
        if (value == 10){
            System.out.print("The hex value is A");} 
        else if (value == 11){
            System.out.print("The hex value is B");} 
        else if (value == 12){
            System.out.print("The hex value is C");} 
        else if (value == 13){
            System.out.print("The hex value is D");} 
        else if (value == 14){
            System.out.print("The hex value is E");} 
        else if (value == 15){
            System.out.print("The hex value is F");} 
        else{
            System.out.print("The hex value is " + value);}}
    else{
        System.out.print(value  + " is Invalid Input!");}
    }
}
