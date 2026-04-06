# 🚆 UC8 – Stream Filter

/**
 * Author: vamsikoneru06
 * UC8 - Filter Passenger Bogies
 */

import java.util.*;
import java.util.stream.*;

class Bogie8 {
    String name;
    int capacity;

    Bogie8(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class usecase8 {
    public static void main(String[] args) {

        List<Bogie8> list = Arrays.asList(
                new Bogie8("Sleeper", 72),
                new Bogie8("AC Chair", 56),
                new Bogie8("First Class", 24)
        );

        List<Bogie8> filtered = list.stream()
                .filter(b -> b.capacity > 50)
                .toList();

        filtered.forEach(b -> System.out.println(b.name));
    }
}