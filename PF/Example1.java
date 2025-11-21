public class Example1{
    public static void main (String [] args){

    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;

    // Get the length of the array
    int length = ages.length;

    // Loop through the elements of the array
    for (int age : ages) {
    sum += age;
    }

    // Calculate the average by dividing the sum by the length
    avg = sum / length;

    // Print the average
    System.out.println("The average age is: " + avg);

    // An array storing different ages
    int age[] = {20, 22, 18, 35, 48, 26, 87, 70};
    
    // Get the length of the array
    length = age.length;
    
    // Create a 'lowest age' variable and assign the first array element of ages to it
    int lowestAge = age[0];
    
    // Loop through the elements of the ages array to find the lowest age
    for (int i : age) {
      // Check if the current age is smaller than the current 'lowest age'
      if (lowestAge > i) {
        // If the smaller age is found, update 'lowest age' with that element
        lowestAge = i;
      }
    }
    
    // Output the value of the lowest age
    System.out.println("The lowest age in the array is: " + lowestAge);
 
    int[] numbers = {3, -1, 7, 0, 9};

    for (int n : numbers) {
      if (n < 0) {
        continue; // skip negative numbers
      }
      if (n == 0) {
        break; // stop loop when zero is found
      }
      System.out.println(n);
    }
 
    int [] number = {45, 12, 98, 33, 27};
    
    int max = number[0];
    int min = number[0];
    
    for (int n : number) {
      if (n > max) {
        max = n;
      }
      if (n < min) {
        min = n;
      }
    }
    
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
     
    String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

    for (int i = 0; i < seats.length; i++) {
      System.out.println("Seat number " + i + " is taken by " + seats[i]);
    }
 
 
 
 
 
    }
}