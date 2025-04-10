package Practise_prblm_1;

import org.openqa.selenium.WebDriver;

import java.util.HashSet;

public class duplicates_arr_int {
    public static void main(String[] args) {
//ThreadLocal
        //WebDriver
               
        int[] arr = {1,2,3,2,3,4,8,9,5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num : arr){
            if(!seen.add(num)){//num is already in seen
                duplicate.add(num);
            }

        }
        System.out.println(seen);
    }

}
