# 🚆 UC10 – reduce()
/**
 * Author: vamsikoneru06
 * UC10 - Total Seats using reduce
 */

import java.util.*;

class Bogie10 {
    int capacity;

    Bogie10(int capacity) {
        this.capacity = capacity;
    }
}

public class usecase10 {
    public static void main(String[] args) {

        List<Bogie10> list = Arrays.asList(
                new Bogie10(72),
                new Bogie10(56),
                new Bogie10(24)
        );

        int total = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seats: " + total);
    }
}