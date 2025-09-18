import java.util.*;
public class RideBooking{
    static Scanner sc = new Scanner (System.in);
    public static void main( String [ ] args){
        double fare;
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the distance in km: ");
        double distance = sc.nextDouble();
        System.out.print("Choose a vehicle type--> Car , Bike , Rickshaw: ");
        String vehicle = sc.next();

        CalculateFare (String vehicle ; double distance;);
        PrintReceipt(String name ; String vehicle ; double distance ; double fare;);
    }

        public static double CalculateFare (String vehicle , double distance){
            switch (vehicle){
                case Car:
                fare= 50 * distance;
                return fare;
                
                case Bike:
                fare = 20 * distance;
                return fare;
                
                case Rickshaw:
                fare = 30 * distance;
                return fare;

                default:
                    if (distance <= 0){
                        System.out.print("Invalid Distance");
                    }
                    else{
                        return 0;}
            }
        }
            public static void PrintReceipt(String name, String vehicle, double distance , double fare){
                System.out.print("Passenger : " + name);
                System.out.print("Vehicle : " + vehicle);
                System.out.print("Distance : " + distance + "km");
                System.out.print("Total Fare : " + fare + "PKR");
            }
}