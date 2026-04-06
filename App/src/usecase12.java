# 🚆 UC12 – Safety Check (allMatch)
/**
 * Author: vamsikoneru06
 * UC12 - Safety Compliance
 */

import java.util.*;

class Bogie12 {
    String type;
    String cargo;

    Bogie12(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class usecase12 {
    public static void main(String[] args) {

        List<Bogie12> list = Arrays.asList(
                new Bogie12("Cylindrical", "Petroleum"),
                new Bogie12("Open", "Coal")
        );

        boolean safe = list.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
        );

        System.out.println("Safety Status: " + safe);
    }
}