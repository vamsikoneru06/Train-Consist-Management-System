# 🚆 UC7 – Comparator (Sorting)
/**
 * Author: vamsikoneru06
 * UC7 - Sort Bogies by Capacity
 */

import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class usecase7 {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));

        list.sort(Comparator.comparingInt(b -> b.capacity));

        list.forEach(b -> System.out.println(b.name + " -> " + b.capacity));
    }
}