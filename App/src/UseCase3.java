import java.util.*;

/**
 * Use Case 3: Track Unique Bogie IDs
 * Ensures no duplicate bogie IDs are added using HashSet.
 */
public class UseCase3 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println(" UC3 Track Unique Bogie IDs ");
        System.out.println("----------------------------------------");

        // Create a Set to store unique bogie IDs [cite: 114, 141]
        Set<String> bogies = new HashSet<>();

        // Add IDs (including intentional duplicates) [cite: 118, 142]
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101"); // Duplicate entry [cite: 125]
        bogies.add("BG102"); // Duplicate entry [cite: 126]

        // Observe that duplicates are removed automatically [cite: 144, 155]
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies); // Output order may vary as HashSet is unordered [cite: 139, 153]

        System.out.println("Note: Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed..."); [cite: 155, 156]
    }
}