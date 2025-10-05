import java.util.*;
public class Day5{
	static Scanner sc = new Scanner (System.in);
	public static void main(String [ ] args){
	 
    int choice , sugarLevel;
    double milkLevel, price;
    boolean confirm;
    String drink , answer;
    
    System.out.println(" Welcome To RoboCoffee!");
    System.out.println("1. Espresso");
    System.out.println("2. Cappuccino");
    System.out.println("3. Latte");
    
    System.out.print("Enter your choice (1-3): ");
    choice = sc.nextInt();
    
    if (choice == 1){
        drink = "Espresso";
    }
    else if(choice == 2){
        drink = "Cappuccino";
    }
    else if(choice == 3){
        drink = "Latte";
    }
    else{
        System.out.println("Invalid Choice! Defaulting to Water");
        drink = "Water";
    }
    
    price = (double) choice * 1.5;
    
    System.out.println("You selected: " + drink + "Price: $" + price);
    
    System.out.print("Enter sugar level (0-5):");
    sugarLevel = sc.nextInt();
    
    System.out.print("Enter milk level (percentage 0-100):");
    milkLevel = sc.nextDouble();
    
    if (sugarLevel > 3){
        System.out.println("Warning! Too much sugar may cause hyper mode!");
    }
    else{
        System.out.println(" Balanced Sugar Level.");
    }
    
    switch (choice){
        case 1:
            System.out.println("Making Espresso...Strong and Bold!");
            break;
        case 2:
            System.out.println("Making Cappuccino...Frothy and Fun!");
            break;
        case 3:
            System.out.println("Making Latte...Smooth and Milky!");
            break;
        default:
             System.out.println("Making Plain Water...Boring but Safe!");
    }
    
     System.out.println("Brewing...");
     for(int i=1 ; i <= 5 ; i++){
         if(i==2){
              System.out.println(" Steam Puff!");
              continue;
         }
         if(i==4){
              System.out.println("Small glitch detected!");
              break;
         }
          System.out.println("Step " + i + " done.");
     }
     
      System.out.print("Confirm purchase? (yes/no)");
      answer = sc.next();
      
      if(answer.equalsIgnoreCase("Yes")){
          confirm = true;
      }
      else{
          confirm = false;
      }
      
      if (confirm==true){
           System.out.println("Here's your " + drink + "!Enjoy your drink!");
      }
      else{
          System.out.println("Order Cancelled. RoboCoffee is sad.") ;
      }
          
    System.out.println("Program Completed.");
	}
}