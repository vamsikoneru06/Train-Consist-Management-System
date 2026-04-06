#UC6-HASHMAP
/**
 * Author: vamsikoneru06
 * UC6 - Map Bogie to Capacity
 */

import java.util.*;

public class usecase6 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC Chair", 56);
        map.put("First Class", 24);

        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}