/**
 * Author: vamsikoneru06
 * UC5 - Preserve Insertion Order of Bogies
 */

import java.util.LinkedHashSet;

public class usecase5 {
    public static void main(String[] args) {

        LinkedHashSet<String> bogies = new LinkedHashSet<>();

        bogies.add("Engine");
        bogies.add("Sleeper");
        bogies.add("Cargo");
        bogies.add("Guard");
        bogies.add("Sleeper"); // duplicate

        System.out.println("Train Formation:");
        bogies.forEach(System.out::println);
    }
}