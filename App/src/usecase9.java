# 🚆 UC9 – groupingBy

/**
 * Author: vamsikoneru06
 * UC9 - Group Bogies
 */

import java.util.*;
import java.util.stream.*;

class Bogie9 {
    String type;

    Bogie9(String type) {
        this.type = type;
    }
}

public class usecase9 {
    public static void main(String[] args) {

        List<Bogie9> list = Arrays.asList(
                new Bogie9("Sleeper"),
                new Bogie9("Sleeper"),
                new Bogie9("AC Chair")
        );

        Map<String, List<Bogie9>> grouped =
                list.stream().collect(Collectors.groupingBy(b -> b.type));

        grouped.forEach((k,v) -> System.out.println(k + " -> " + v.size()));
    }
}