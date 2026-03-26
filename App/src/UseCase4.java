import java.util.*;

/**
 * Use Case 4: Maintain Ordered Bogie Consist
 * Models the physical chaining of bogies using LinkedList.
 */
public class UseCase4 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println(" UC4 Maintain Ordered Bogie Consist ");
        System.out.println("----------------------------------------");

        // Create a LinkedList to maintain physical sequence [cite: 44, 46, 62]
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence [cite: 29, 63]
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist); [cite: 74, 75]

        // Insert a Pantry Car at position 2 [cite: 58, 64]
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist); [cite: 76, 77]

        // Remove the first and last bogie [cite: 59, 65]
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist); [cite: 78, 79]

        System.out.println("UC4 ordered consist operations completed..."); [cite: 80]
    }
}