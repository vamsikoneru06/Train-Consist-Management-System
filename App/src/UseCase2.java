import java.util.*;

/**
 * Use Case 2: Add Passenger Bogies to Train
 * Demonstrates dynamic management of bogies using ArrayList CRUD operations.
 */
public class UseCase2 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println(" UC2 Add Passenger Bogies to Train ");
        System.out.println("----------------------------------------");

        // Create an ArrayList to hold passenger bogies [cite: 189, 211]
        List<String> passengerBogies = new ArrayList<>();

        // CREATE: Add bogies [cite: 191, 212]
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies); [cite: 223, 224]

        // REMOVE: Remove 'AC Chair' [cite: 206, 214]
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies); [cite: 225, 226]

        // READ: Check if 'Sleeper' exists [cite: 207, 215]
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + passengerBogies.contains("Sleeper")); [cite: 227, 228]

        System.out.println("Final Train Passenger Consist: " + passengerBogies);
        System.out.println("UC2 operations completed successfully..."); [cite: 230, 231]
    }
}