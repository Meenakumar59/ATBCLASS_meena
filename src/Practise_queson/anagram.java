package Practise_queson;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String str1, String str2) {
        //remove space and convert to lower case
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
//         checks length difference
        if (str1.length() != str2.length()) {
            return false;
        }
        // convert string to char
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
//sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = " Listen";

        if(isAnagram(str1,str2)){
            System.out.println(str1 + "and" + str2 + " are anagram");
        }else{
            System.out.println(str1 + "and" + str2 + " are not anagram" );
        }
    }
}
