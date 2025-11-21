import java.util.Scanner;
public class Example
{
    private static Scanner sc;
    public static void main(String[] args)
    {
        double PAmount,ROI,TimePeriod;
        sc=new Scanner (System.in);
        System.out.println("Please enter the Practical Amount; ");
        PAmount=sc.nextDouble();
        System.out.println("Please enter the Rate of Interest; ");
        ROI=sc.nextDouble();
        System.out.println("Please enter the Time Period in Years; ");
        TimePeriod=sc.nextDouble();
        calSimpleIntr(PAmount,ROI,TimePeriod);
    }
    public static void calSimpleIntr(double PAmount, double ROI, double TimePeriod){
    double SI;
    SI=(PAmount*ROI*TimePeriod)/100;
    System.out.println("\nTotal Amount "+ PAmount + " is= "+SI);
    }
}

