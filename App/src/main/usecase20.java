package main;

/**
 * Author: vamsikoneru06
 */
public class usecase20 {

    public static boolean search(String[] arr, String key){
        if(arr.length == 0){
            throw new IllegalStateException("No bogies available");
        }

        for(String s : arr){
            if(s.equals(key)) return true;
        }
        return false;
    }
}