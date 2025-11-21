import java.util.*;
public class Assignment02 {
    static Scanner sc = new Scanner(System.in);
    //method no.1
    public static void question1(){
        System.out.print("Enter a SSN (___-__-____) : ");
        String ssn = sc.next();
        
        if(ssn.matches("\\d{3}-\\d{2}-\\d{4}")){
            System.out.println(ssn + " is a valid social security number.");}
        else {
            System.out.println(ssn + " is an invalid social security number.");}
    }
    
    //method no.2
    public static void question2(){
    System.out.println("M --> Mathematics \nC --> Computer Science \nI --> Information Technology");
    
    System.out.println("\n1 --> Freshman \n2 --> Sophomore \n3 --> Junior \n4 --> Senior");
    System.out.print("\nEnter two characters: ");
    String response = sc.next().toUpperCase();
    
    switch(response){
        case "M1":
            System.out.println("Mathematics Freshman");
            break;
        case "M2":
            System.out.println("Mathematics Sophomore");
            break;
        case "M3":
            System.out.println("Mathematics Junior");
            break;
        case "M4":
            System.out.println("Mathematics Senior");
            break;
        case "C1":
            System.out.println("Computer Science Freshman");
            break;
        case "C2":
            System.out.println("Computer Science Sophomore");
            break;    
        case "C3":
            System.out.println("Computer Science Junior");
            break; 
        case "C4":
            System.out.println("Computer Science Senior");
            break; 
        case "I1":
            System.out.println("Information Technology Freshman");
            break; 
        case "I2":
            System.out.println("Information Technology Sophomore");
            break; 
        case "I3":
            System.out.println("Information Technology Junior");
            break; 
        case "I4":
            System.out.println("Information Technology Senior");
            break; 
        default:
             System.out.println("Invalid Input!");}
    }
    
    
    //method no.3
    public static void question3(){
    int counter=3;
    int num=0;
    char alphabet;
    for(int i=1 ; i<=counter ; i++){
        num= 65 + (int)(Math.random() * 26);
        alphabet = (char) num;
        System.out.print(alphabet);}
     
    for(int i=0 ; i<=counter ; i++){
        num= (int)(Math.random() * 10);
        System.out.print(num);}
    }
    
    
    //method no.4
    public static void question4(){
        System.out.print("Enter a decimal integer: ");
        int number = sc.nextInt();
        
        
        if (number == 0) {
            System.out.println("Binary value: 0");
        }

        String binary = "";
        
        
        while (number > 0) {
            int remainder = number % 2;       
            binary = remainder + binary;      
            number = number / 2;          
        }

        System.out.println("Binary value: " + binary);
    }
    
    
    //method no.5
    public static void question5(){
        System.out.println("1. What is the primary cause of the current rise in Earth's temperature? ");
        System.out.println("1) Sunspots \n2) Volcanic eruptions \n3) Fossil fuel combustion \n4) Deforestation ");
        System.out.print("Answer: ");
        int answer1 = sc.nextInt();
        System.out.println();
        
        System.out.println("2. What is a consequence of melting ice caps and glaciers?");
        System.out.println("1) Lower sea levels \n2) Rising sea levels \n3) A cooler ocean \n4) Stronger ocean currents");
        System.out.print("Answer: ");
        int answer2 = sc.nextInt();
        System.out.println();
        
        System.out.println("3. Which of the following is an effect of ocean warming on marine life?");
        System.out.println("1) Higher oxygen levels \n2) Ocean acidification \n3) Healthier coral reefs \n4) Increased fish populations ");
        System.out.print("Answer: ");
        int answer3 = sc.nextInt();
        System.out.println();
        
        System.out.println("4. Which greenhouse gas is released in large quantities from burning fossil fuels?");
        System.out.println("1) Methane \n2) Ozone \n3) Carbon dioxide \n4) Water vapor");
        System.out.print("Answer: ");
        int answer4 = sc.nextInt();
        System.out.println();
        
        System.out.println("5. What is the greenhouse effect?");
        System.out.println("1) A cooling of Earth's atmosphere \n2) A process that creates more plants \n3) The trapping of heat in the atmosphere \n4) A natural process without human influence ");
        System.out.print("Answer: ");
        int answer5 = sc.nextInt();
        System.out.println();
        
        int score=0;
        int questions= 5;
            if(answer1==3)
                score++;
            
            if(answer2==2)
                score++;
                
            if(answer3==2)
                score++;
                
            if(answer4==3)
                score++;
                
            if(answer5==3)
                score++;
        
        System.out.print("Your score: " + score);   
        System.out.println();
        
        switch(score){
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Very good");
                break;
            default:
                System.out.println("Time to brush up on your knowledge of global warming.");
        }
        
        System.out.println();
        System.out.println("Here is list of some useful websites to learn about Global Warming");
        System.out.println("1. Skeptical Sciences");
        System.out.println("2. United Nations Climate Action");
        System.out.println("3. Climate Central");
        System.out.println("4. National Geographic");
        System.out.println("5. National Oceanic and Atmospheric Administration (NOAA)");
    }
    
    
    //method no.6 
    public static void mainMenu(){
        
    while (true) {
        System.out.println("\n---> Main Menu (Assignment-2) <---");
        System.out.println("1 - Question-1");
        System.out.println("2 - Question-2");
        System.out.println("3 - Question-3");
        System.out.println("4 - Question-4");
        System.out.println("5 - Question-5");
        System.out.println("Press option (1-5) to execute and 0 to exit");
        System.out.print("Enter your option: ");
        int choice1 = sc.nextInt();

        if (choice1 == 0) {
            System.out.println("Exiting program. Goodbye!");
            break;
        }

        
        while (true) {
            switch (choice1) {
                case 1 :
                    System.out.println("---> Executing Question-1 <--");
                    question1();
                    break;
            
                case 2 : 
                    System.out.println("---> Executing Question-2 <--");
                    question2();
                    break;
                case 3 : 
                    System.out.println("---> Executing Question-3 <--");
                    question3();
                    break;
                case 4 : 
                    System.out.println("---> Executing Question-4 <--");
                    question4();
                    break;
                case 5 : 
                    System.out.println("---> Executing Question-5 <--");
                    question5();
                    break;
                default : 
                    System.out.println("Invalid Input!");
            }

            System.out.println();
            System.out.println("\nDo you want to execute this question again then press (y) otherwise press (b) to go back to menu, 0 = exit)");
            System.out.print("Enter your option: ");
            String choice2 = sc.next().toLowerCase();

            if (choice2.equals("y")) {
                continue;
            } else if (choice2.equals("b")) {
                break;
            } else if (choice2.equals("0")) {
                System.out.println("Exiting program. Goodbye!");
                return;
            } else {
                System.out.println("Invalid input! Returning to main menu.");
                break;
            }
        }
    }
    }
    
    //main method
    public static void main(String[] args) {
        mainMenu();     
    } 
}
