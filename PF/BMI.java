public class BMI{
    public static void main (String... args){
        
    double height = 1.68;
    double weight = 62;
    
    int BMI = (int) (weight / (height * height));
    
    System.out.println("Your Body Mass Index (BMI) is " + BMI);
    }
}