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

        fare = CalculateFare ( vehicle , distance);
        PrintReceipt( name , vehicle , distance , fare);
    }

        public static double CalculateFare (String vehicle , double distance){
            double fareA = 0.0;
            switch (vehicle){
                case "Car":
                fareA= 50.0 * distance;
                break;

                case "Bike":
                fareA = 20.0 * distance;
                break;

                case "Rickshaw":
                fareA = 30.0 * distance;
                break;

                default:
                    if (distance <= 0){
                        System.out.print("Invalid Distance");
                    }
                    else{
                        break;}
            }
            return fareA;
        }

            public static void PrintReceipt(String name, String vehicle, double distance , double fare){
                System.out.println("Passenger : " + name);
                System.out.println("Vehicle : " + vehicle);
                System.out.println("Distance : " + distance + " km");
                System.out.println("Total Fare : " + fare + " PKR");
            }
}