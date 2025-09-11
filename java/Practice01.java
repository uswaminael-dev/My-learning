import java.util.Scanner;

public class Practice01{ 
    static Scanner sc=new Scanner (System.in);
    public static void main(String [] args){
        System.out.println("Enter first number;");
        int num1=sc.nextInt();
        System.out.println("Enter second number;");
        int num2=sc.nextInt();
        System.out.println("Enter an operator (+,-,/,*);");
        char operator=sc.next().charAt(0);

        System.out.println("Hello World!");

        int result= Calculator(num1,num2,operator);
        System.out.println("The result is;" + result);
        

    }
    public static int Calculator(int num1, int num2, char operator){
        switch (operator){
            case '+': int add=(num1 + num2);
            return add;
            case '-':int subtraction=(num1 - num2);
            return subtraction;
            case '*': int product= (num1 * num2);
            return product;
            case '/': if (num2==0){
                System.out.println("Zero Division Error");}
                else{int division=num1/num2;
                return division;
                }
            default:
                System.out.println("Invalid Operation");
                return 0;

        }
        
    }

}