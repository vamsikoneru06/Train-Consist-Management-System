package main;

import java.util.Arrays;

/**
 * Author: vamsikoneru06
 */
public class usecase19 {

    public static boolean search(String[] arr, String key){
        Arrays.sort(arr);
        int l=0,h=arr.length-1;

        while(l<=h){
            int m=(l+h)/2;
            int cmp=arr[m].compareTo(key);

            if(cmp==0) return true;
            else if(cmp<0) l=m+1;
            else h=m-1;
        }
        return false;
    }
}