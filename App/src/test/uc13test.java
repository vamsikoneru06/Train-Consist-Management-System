package test;

import Main.uc13;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class uc13test {

    @Test
    void testLoopAndStreamMatch(){
        List<Integer> list = Arrays.asList(10,60,70);

        uc13 usecase13;
        assertEquals(
                uc13.loopFilter(list),
                uc13.streamFilter(list)
        );
    }
}