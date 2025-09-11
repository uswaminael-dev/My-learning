import java.util.Scanner;
public class Greet {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter first value: ");
        int value1= sc.nextInt();
        System.out.print("Enter second value: ");
        int value2= sc.nextInt();
        System.out.print("Choose the operator (+,-,*,/); ");
        char operator= sc.next().charAt(0);
        String a="hello";
        String b="world";
        System.out.println(a + b);
        Calculator(value1,value2,operator);
    }
    private static int Calculator(int value1, int value2,char operator)
    {
        if(operator=='+'){
            int add=value1 + value2;
            System.out.print("Ans " + add);}
        else if(operator=='-'){
            int sub=value1 - value2;
            System.out.print("Ans " +sub);}
        else if(operator=='*'){
            int product=value1 * value2;
            System.out.print("Ans " + product);}
        else{
            if (value2==0){
                System.out.println("ZeroDivisionError");
            }
            else{
                int division=value1 / value2;
                 System.out.print("Ans " + division);
            }
            }
        return 0;
    }
}
