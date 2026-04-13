package Main; /**
 * Author: vamsikoneru06
 */

import java.util.*;
import java.util.stream.*;

public class uc13 {

    public static List<Integer> loopFilter(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for(int n : list){
            if(n > 50) result.add(n);
        }
        return result;
    }

    public static List<Integer> streamFilter(List<Integer> list){
        return list.stream().filter(n -> n > 50).toList();
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,60,70);

        long start = System.nanoTime();
        loopFilter(list);
        long end = System.nanoTime();

        System.out.println("Loop Time: " + (end-start));
    }
}