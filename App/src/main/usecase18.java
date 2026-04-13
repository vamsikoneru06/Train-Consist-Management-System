package main;

/**
 * Author: vamsikoneru06
 */
public class usecase18 {

    public static boolean search(String[] arr, String key){
        for(String s : arr){
            if(s.equals(key)) return true;
        }
        return false;
    }
}